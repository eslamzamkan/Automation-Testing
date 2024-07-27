package org.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D08_WishlistStepDef {

P03_homePage wishlist=new P03_homePage();
    @When("user click on heart")
    public void user_clicks_on_heart() throws InterruptedException {
        wishlist.click_heart().click();
        Thread.sleep(2000);
    }
    @And("user enter all field with data")
    public void fill_data() {
        wishlist.Recipient_Name().sendKeys("islam gamal");
        wishlist.Recipient_Email().sendKeys("islamzamkan@gmai.com");
        wishlist.your_name().sendKeys("islam");
        wishlist.Your_Email().sendKeys("islamgamal@gmail.com");
        wishlist.add_to_list().click();
    }

    @Then("success message The product has been added to your wishlist with green color")
    public void success_message(String expectedMessage) {
        SoftAssert soft = new SoftAssert();
        String actualMessage = wishlist.success_message().getText();
        soft.assertEquals(actualMessage, expectedMessage);

        String actualColor = wishlist.success_message().getCssValue("background-color");
        String expectedColor = "#4bb07a";  // Update with the correct hex color
        actualColor = Color.fromString(actualColor).asHex();
        soft.assertEquals(actualColor, expectedColor);

        soft.assertAll();
    }

    @And("user click on wishlist after message disappear")
    public void click_on_wishlist() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.invisibilityOf(wishlist.success_message()));
        wishlist.wishlist().click();
    }

    @Then("user check the Qty in wishlist greater than 0")
    public void check_qty() {
        String quantity = wishlist.quantity().getAttribute("value");
        int value = Integer.parseInt(quantity);
        Assert.assertTrue(value > 0);
    }

}
