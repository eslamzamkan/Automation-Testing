package org.example.StepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class D06_homeSlidersStepDef {

    P03_homePage slider=new P03_homePage();

    @When("user click first slider")
    public void user_click_first_slider(){
        slider.first_slider().click();
    }
    @Then("the webpage reload to home page")
    public void the_webpage_reload_to_home_page(){
        System.out.println(Hooks.driver.getCurrentUrl());
        WebDriverWait wait=new WebDriverWait(Hooks.driver, Duration.ofMillis(2000));
        //explicit wait until home page load
        wait.until(ExpectedConditions.visibilityOf(slider.home_page()));
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("iphone 14 pro"));
    }
    @When("user click second slider")
    public void user_click_second_slider(){
      slider.next().click();
      slider.second_slider().click();
    }
    @Then("the webpage reload same home page")
    public void the_webpage_reload_same_home_page(){
        System.out.println(Hooks.driver.getCurrentUrl());
        WebDriverWait wait2=new WebDriverWait(Hooks.driver,Duration.ofMillis(2000));
        wait2.until(ExpectedConditions.visibilityOf(slider.home_page()));
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("samsung s22 ultra"));
    }
}
