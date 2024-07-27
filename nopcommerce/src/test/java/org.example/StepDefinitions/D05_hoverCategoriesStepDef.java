package org.example.StepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class D05_hoverCategoriesStepDef {

    P03_homePage hover=new P03_homePage();
    WebElement randomcategory;
    String randomcategorytext;

    @When("user hover on one of main category")//firstly select one of main categories and hover it
    public void user_hover_on_one_of_main_category() throws InterruptedException {
        //store the method hover.main_categories() in variable cat from type arraylist
        ArrayList<WebElement> cat = hover.main_categoties();
        System.out.println(cat.size());
        //method to get one of 3 main categories randomly
        Random rand = new Random();
        int get_random = rand.nextInt(cat.size());
        randomcategory = cat.get(get_random);
        //doing hover for one 3 main categories
        Actions act = new Actions(Hooks.driver);
        act.moveToElement(randomcategory).build().perform();
        Thread.sleep(2000);
    }

    @And("user select one of the sub categories")//secondly select one 3 sub categories of one of 3 main categories
    public void user_select_one_of_sub_categories()
    {
        randomcategorytext=randomcategory.getText().toLowerCase().trim();
        //this to get the text of one 3 main categories
        System.out.println(randomcategorytext);
        ArrayList<WebElement> subcategorylist;
        //store the 3 of sub categories of 3 main in subcategorylist from type arraylist
        List<WebElement> subcategory=hover.subcategorylist();//store the subcategory the contains about 3 sub cate from every main category
        //doing if condition
        if(subcategory.size()>0)
        {
            if(randomcategorytext.contains("computers"))//verify that randomcategorytext contains on computer or part from it
            {
                subcategorylist=hover.ccomputercategories();//if randomcategorytext contains about computer ,make subcategorylist = sub_catergories of computers
            }
            else if (randomcategorytext.contains("electronic"))//verify that randomcategorytext contains on electronic or part from it
            {
                subcategorylist=hover.electroniccategories();//if randomcategorytext contains about electronic ,make subcategorylist = sub_catergories of electronic
            }
            else//verify that randomcategorytext contains on apparel or part from it
            {
                subcategorylist=hover.apparel_categories();//if randomcategorytext contains about apparel ,make subcategorylist = sub_catergories of apparel
            }
            //method to get random sub cate
            Random rand=new Random();
            int reandomsub= rand.nextInt(subcategorylist.size());
            WebElement randomsubcategory=subcategorylist.get(reandomsub);
            randomcategorytext=randomsubcategory.getText().toLowerCase().trim();//get text of sub category that is selected randomly
            System.out.println(randomcategorytext);
            randomsubcategory.click(); //then click on the random sub cate
        }
        else //if the main cate not contain about sub cate
        {
            randomcategory.click();//please click on it
        }
    }
    @Then("user check sub-category title") //here verify by the current URL whether is containing randomcategorytext
    public void user_check_on_the_title_of_opening_sub_category()
    {
        String getcurrentURL= Hooks.driver.getCurrentUrl();// get current url
        Assert.assertTrue(getcurrentURL.contains(randomcategorytext)); //assert by URl and randomcategorytext
    }
}
