package org.example.StepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
    P01_register reg=new P01_register();


    @Given("user go to register page")
    public void user_go_to_register_page(){
    reg.register_page().click();
}
  @When("user select gender type")
    public void user_select_gender_type(){
        reg.select_Gender().click();
    }
  @And("user enter valid first name")
    public void user_enter_valid_first_name() throws InterruptedException {
    reg.get_First_name().sendKeys("automation");
      Thread.sleep(500);
    }
    @And("user enter valid last name")
    public void user_enter_valid_last_name() throws InterruptedException {
      reg.get_Last_name().sendKeys("tester");
        Thread.sleep(500);
    }


    @And("user enter date of birth day")
    public void day() throws InterruptedException {
        Select sel=new Select(reg.get_day());
        sel.selectByIndex(25);
        Thread.sleep(500);
    }
    @And("user enter date of birth month")
    public void month() throws InterruptedException {
         Select sel=new Select(reg.get_month());
         sel.selectByIndex(10);
        Thread.sleep(500);
    }
    @And("user enter date of birth year")
    public void year() throws InterruptedException {
        Select sel=new Select(reg.get_year());
        sel.selectByIndex(60);
        Thread.sleep(500);
    }


    @And("user enter a valid email")
    public void email() throws InterruptedException {
      reg.get_Email().sendKeys("ahmedaAAi41@example.com");
        Thread.sleep(500);
    }
    @And("user enter a valid Company name")
    public void company_name() throws InterruptedException {
       reg.get_Company().sendKeys("google");
        Thread.sleep(500);
    }
    @And("user fills Password fields with valid password")
    public void  password() throws InterruptedException {
      reg.get_password().sendKeys("P@ssw0rd");
        Thread.sleep(500);
    }
    @And("user refill Confirm password fields")
    public void  confirm_password() throws InterruptedException {
     reg.get_ConfirmPassword().sendKeys("P@ssw0rd");
        Thread.sleep(500);
    }
    @And("user clicks on register button")
    public void register(){
     reg.click_register().click();
    }

    @Then("success message is displayed with color")
    public void displayed_color_message(){
        //Soft asserts continue the execution even after the Assert condition fails
        SoftAssert asser2=new SoftAssert();
        asser2.assertTrue(reg.display_message().isDisplayed());
        String Actual=reg.display_message().getCssValue("color");
        System.out.println(Actual);
        String Expect="rgba(76,177,124,1)";
        asser2.assertEquals(Actual,Expect);
        asser2.assertAll();
    }

}
