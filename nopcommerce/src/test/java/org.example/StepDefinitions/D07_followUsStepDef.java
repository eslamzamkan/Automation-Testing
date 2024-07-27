package org.example.StepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.example.pages.P03_homePage;
import org.testng.Assert;

import java.util.Set;

public class D07_followUsStepDef {
 P03_homePage follow=new P03_homePage();

   @When("user click on facebook link")
    public void user_click_on_facebook_link() throws InterruptedException {
    Thread.sleep(3000);
     follow.facebook().click();

    }
    @Then("user driver into facebook page")
    public void user_driver_into_facebook_page() throws InterruptedException {
     Set<String> all_tab=Hooks.driver.getWindowHandles();
     String tab1=(String) all_tab.toArray()[0];
     String tab2=(String) all_tab.toArray()[1];
     Hooks.driver.switchTo().window(tab2);
     System.out.println(Hooks.driver.getCurrentUrl());
     Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("facebook"));
     Thread.sleep(3000);
    }
    @When("user click on twitter link")
    public void user_click_on_twitter_link() throws InterruptedException {
     Thread.sleep(3000);
    follow.twitter().click();

    }
    @Then("user driver into twitter page")
    public void user_driver_into_twitter_page() throws InterruptedException {
     Set<String> all_tab=Hooks.driver.getWindowHandles();
     String tab1=(String) all_tab.toArray()[0];
     String tab2=(String) all_tab.toArray()[1];
     Hooks.driver.switchTo().window(tab2);
     System.out.println(Hooks.driver.getCurrentUrl());
     Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("twitter"));
     Thread.sleep(3000);
    }
    @When("user click on rss link")
    public void user_click_on_rss_link() throws InterruptedException {
     Thread.sleep(3000);
    follow.rss().click();

    }
    @Then("user driver into rss page")
    public void user_driver_into_rss_page() throws InterruptedException {
      Set<String> all_tab=Hooks.driver.getWindowHandles();
      String tab1=(String) all_tab.toArray()[0];
      String tab2=(String) all_tab.toArray()[1];
      Hooks.driver.switchTo().window(tab2);
     System.out.println(Hooks.driver.getCurrentUrl());
     Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("rss"));
     Thread.sleep(3000);
    }
    @When("user click on youtube link")
    public void user_click_on_youtube_link() throws InterruptedException {
     Thread.sleep(3000);
    follow.youtube().click();

    }
    @Then("user driver into youtube page")
    public void user_driver_into_youtube_page() throws InterruptedException {
     Set<String> all_tab=Hooks.driver.getWindowHandles();
     String tab1=(String) all_tab.toArray()[0];
     String tab2=(String) all_tab.toArray()[1];
     Hooks.driver.switchTo().window(tab2);
     System.out.println(Hooks.driver.getCurrentUrl());
     Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("youtube"));
     Thread.sleep(3000);
    }
}
