package org.example.StepDefinitions;
import io.cucumber.java.en.*;
import org.example.pages.P03_homePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
public class D04_searchStepDef {
    P03_homePage search = new P03_homePage();
    SoftAssert soft = new SoftAssert();

    @Given("user navigates to home page")
    public void user_is_on_the_home_page() throws InterruptedException {
       search.field_search().click();
       Thread.sleep(1000);
    }
    @When("user searches for a product {string}")
    public void user_enters_product_for_search(String product) throws InterruptedException {
        search.field_search().clear();
        search.field_search().sendKeys(product);
        Thread.sleep(1000);
    }
    @And("user clicks on the search button")
    public void user_clicks_on_the_search_button() throws InterruptedException {
        search.button_search().click();
        Thread.sleep(1000);
    }
    @Then("search results for{string} are displayed")
    public void search_results_for_product_are_displayed(String product) throws InterruptedException {
        Thread.sleep(1000);
        String get_currentURL = Hooks.driver.getCurrentUrl();
        soft.assertTrue(get_currentURL.contains("https://demo.nopcommerce.com/search?q="));
        int result = search.search_result().size();
        for (int i = 0; i < result; i++) {
            soft.assertTrue(search.search_result().get(i).getText().toLowerCase().contains(product.toLowerCase()));
        }
        soft.assertAll();
    }
    //sku scenario
    @When("user searches for a product using SKU{string}")
    public void user_enters_sku_for_search2(String sku) {
        search.field_search().clear();
        search.field_search().sendKeys(sku);
    }
    @And("user clicks on the product from search result")
    public void user_clicks_on_the_search_button2() {
        search.button_search().click();
    }

    @Then("product page SKU should contain {string}")
    public void search_results_for_sku_are_displayed_using_sku(String sku) {
        search.picture().click();
        Assert.assertTrue(search.sku().getText().contains(sku));
    }
}
