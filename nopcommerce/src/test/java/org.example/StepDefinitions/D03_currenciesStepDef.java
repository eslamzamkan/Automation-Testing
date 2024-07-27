package org.example.StepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D03_currenciesStepDef {
  P03_homePage cur=new P03_homePage();

    @Given("user select euro")
    public void select_euro(){
      Select sel =new Select(cur.Select_Currencies());
      sel.selectByIndex(1);
    }

    // Use hard assertion to verify Euro Symbol (€)
    @Then("click euro is display in products")
    public void Four_Products(){
      for(int i=0;i<cur.Four_Products().size();i++){
        Assert.assertTrue(cur.Four_Products().get(i).getText().contains("€"));
        System.out.println(cur.Four_Products().get(i).getText());
      }

    }

}
