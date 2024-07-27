package org.example.pages;
import org.checkerframework.checker.index.qual.PolyUpperBound;
import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

public class P03_homePage {

/////currencies

    public WebElement Select_Currencies(){//Put currency
    return Hooks.driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/div[1]/div[1]/select[1]"));
}
//look at product price
     public List<WebElement> Four_Products(){
        List<WebElement> Elements= Hooks.driver.findElements(By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]"));
        return Elements;
}



///***search feature***///

    public WebElement field_search() {
        return Hooks.driver.findElement(By.cssSelector("#small-searchterms"));
    }
    public WebElement button_search() {
        return Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.header div.header-lower div.search-box.store-search-box form:nth-child(1) > button.button-1.search-box-button"));
    }
    public List<WebElement> search_result() {
        return Hooks.driver.findElements(By.cssSelector("h2.product-title"));
    }
    public WebElement picture() {
        return Hooks.driver.findElement(By.cssSelector("div.product-item div.picture a"));
    }
    public WebElement sku() {
        return Hooks.driver.findElement(By.cssSelector("div.sku span.value"));
    }


//hover

    public ArrayList<WebElement> main_categoties()// locate main categories
    {
        ArrayList<WebElement> category=new ArrayList<>();
        WebElement computer=Hooks.driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[2]/ul[1]/li[1]/a[1]"));
        WebElement electronic=Hooks.driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[2]/ul[1]/li[2]/a[1]"));
        WebElement apparel=Hooks.driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[2]/ul[1]/li[3]/a[1]"));
        category.add(computer);
        category.add(electronic);
        category.add(apparel);
        return category;
    }
    public  List<WebElement> subcategorylist()//locate list of sub_category
    {
        List<WebElement> sub_cate_list=Hooks.driver.findElements(By.cssSelector("div.master-wrapper-page:nth-child(7) div.header-menu ul.top-menu.notmobile:nth-child(1) li:nth-child(2) > ul.sublist.first-level:nth-child(3)"));
        return sub_cate_list;
    }
    public ArrayList<WebElement> ccomputercategories()// locate sub_categories of computers
    {
        ArrayList<WebElement> computer_sub_categories=new ArrayList<>();
        WebElement desktops=Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.header-menu ul.top-menu.notmobile:nth-child(1) li:nth-child(1) ul.sublist.first-level:nth-child(3) li:nth-child(1) > a:nth-child(1)"));
        WebElement netbooks=Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.header-menu ul.top-menu.notmobile:nth-child(1) li:nth-child(1) ul.sublist.first-level:nth-child(3) li:nth-child(2) > a:nth-child(1)"));
        WebElement software=Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.header-menu ul.top-menu.notmobile:nth-child(1) li:nth-child(1) ul.sublist.first-level:nth-child(3) li:nth-child(3) > a:nth-child(1)"));
        computer_sub_categories.add(desktops);
        computer_sub_categories.add(netbooks);
        computer_sub_categories.add(software);
        return computer_sub_categories;
    }
    public ArrayList<WebElement> electroniccategories()// locate sub_categories of computers
    {
        ArrayList<WebElement> electronic_sub_categories=new ArrayList<>();
        WebElement cameraphoto=Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.header-menu ul.top-menu.notmobile:nth-child(1) li:nth-child(2) ul.sublist.first-level:nth-child(3) li:nth-child(1) > a:nth-child(1)"));
        WebElement cellphone=Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.header-menu ul.top-menu.notmobile:nth-child(1) li:nth-child(2) ul.sublist.first-level:nth-child(3) li:nth-child(2) > a:nth-child(1)"));
        WebElement others=Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.header-menu ul.top-menu.notmobile:nth-child(1) li:nth-child(2) ul.sublist.first-level:nth-child(3) li:nth-child(3) > a:nth-child(1)"));
        electronic_sub_categories.add(cameraphoto);
        electronic_sub_categories.add(cellphone);
        electronic_sub_categories.add(others);
        return electronic_sub_categories;
    }
    public ArrayList<WebElement> apparel_categories()// locate sub_categories of computers
    {
        ArrayList<WebElement> apparel_sub_categories=new ArrayList<>();
        WebElement shoes=Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.header-menu ul.top-menu.notmobile:nth-child(1) li:nth-child(3) ul.sublist.first-level:nth-child(3) li:nth-child(1) > a:nth-child(1)"));
        WebElement clothing=Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.header-menu ul.top-menu.notmobile:nth-child(1) li:nth-child(3) ul.sublist.first-level:nth-child(3) li:nth-child(2) > a:nth-child(1)"));
        WebElement accessories=Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.header-menu ul.top-menu.notmobile:nth-child(1) li:nth-child(3) ul.sublist.first-level:nth-child(3) li:nth-child(3) > a:nth-child(1)"));
        apparel_sub_categories.add(shoes);
        apparel_sub_categories.add(clothing);
        apparel_sub_categories.add(accessories);
        return apparel_sub_categories;
    }



    // sliders

    public WebElement first_slider() {
        return Hooks.driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"));
    }
    public WebElement second_slider(){
        return Hooks.driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[2]"));
    }
    public WebElement home_page(){
        return Hooks.driver.findElement(By.xpath("//body/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]"));
    }
    public WebElement next(){
        return Hooks.driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[2]"));
    }


    //followUs Feature

    public WebElement facebook(){
        return Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.footer div.footer-upper div.footer-block.follow-us:nth-child(4) div.social ul.networks li.facebook > a:nth-child(1)"));
    }
    public WebElement twitter(){
        return Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.footer div.footer-upper div.footer-block.follow-us:nth-child(4) div.social ul.networks li.twitter > a:nth-child(1)"));
    }
    public WebElement rss(){
       return Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.footer div.footer-upper div.footer-block.follow-us:nth-child(4) div.social ul.networks li.rss > a:nth-child(1)"));
    }
    public WebElement youtube(){
       return Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.footer div.footer-upper div.footer-block.follow-us:nth-child(4) div.social ul.networks li.youtube > a:nth-child(1)"));
    }


    //Wishlist
    public WebElement Recipient_Name(){
        return Hooks.driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[5]/div[1]/input[1]"));
    }

    public WebElement Recipient_Email(){
        return Hooks.driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[5]/div[2]/input[1]"));
    }

    public WebElement your_name(){
        return Hooks.driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[5]/div[3]/input[1]"));
    }

    public WebElement Your_Email(){
        return Hooks.driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[5]/div[4]/input[1]"));
    }

    public WebElement add_to_list(){
        return Hooks.driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[8]/div[1]/button[1]"));
    }

    public WebElement click_heart(){
        return Hooks.driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[4]/div[1]/div[2]/div[3]/div[2]/button[3]"));
    }

    public WebElement success_message(){
        return Hooks.driver.findElement(By.cssSelector("div.bar-notification.success p.content"));
    }

    public WebElement wishlist(){
        return Hooks.driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]/span[1]"));
    }

    public WebElement quantity(){
        return Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.master-wrapper-content div.master-column-wrapper div.center-1 div.page.wishlist-page div.page-body div.wishlist-content div.table-wrapper:nth-child(1) table.cart tbody:nth-child(3) tr:nth-child(1) td.quantity > input.qty-input"));
    }

}


