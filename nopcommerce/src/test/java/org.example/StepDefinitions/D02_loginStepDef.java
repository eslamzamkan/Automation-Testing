package org.example.StepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;


public class D02_loginStepDef {
    P02_login log=new P02_login();

    @When("user go to login page")
    public void login_page(){

        log.login_link().click();
    }

    @Given("user login with valid Email")
    public void email() throws InterruptedException {
    log.get_email().sendKeys("ahmedaAAi41@example.com");
        Thread.sleep(500);

    }
    @And("user login with valid password")
    public void password() throws InterruptedException {
        log.get_password().sendKeys("P@ssw0rd");
        Thread.sleep(500);
    }
    @And("user press on login button")
    public void login_button() throws InterruptedException {
        log.RememberMe().click();
        Thread.sleep(500);
        log.click_login().click();

    }
    @And("user open my account")
    public void account() throws InterruptedException {
        log.my_account().click();
        Thread.sleep(400);
    }

    @Then("user login to the system successfully")
    public void login_successfully(){
        SoftAssert asser=new SoftAssert();
        asser.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/"));
        asser.assertTrue(log.login_success().isDisplayed());
        asser.assertAll();
    }


    //Negative scenario

    @Given("user login with invalid Email")
    public void invalid_email(){
        log.get_email().sendKeys("wrong@example.com");
    }

    @And("login with invalid password")
    public void invalid_password() throws InterruptedException {
        log.get_password().sendKeys("P@ssw0rd");
        Thread.sleep(500);
    }

    @Then("user could not login to the system")
    public void login_failed(){
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(log.login_failed().getText().contains("Login was unsuccessful."));
        String actual=log.login_failed().getCssValue("color");
        actual= Color.fromString(actual).asHex();
        String expect="#e4434b";
        soft.assertEquals(actual,expect);
        soft.assertAll();
    }


}
