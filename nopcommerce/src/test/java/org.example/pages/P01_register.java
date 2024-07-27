package org.example.pages;
import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class P01_register {

public WebElement register_page(){
    return Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.header div.header-upper div.header-links-wrapper div.header-links ul:nth-child(1) li:nth-child(1) > a.ico-register"));
}
public WebElement select_Gender(){
    return Hooks.driver.findElement(By.id("gender-female"));
}

public  WebElement get_day() {
    return Hooks.driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]"));
}
public WebElement get_month(){
    return Hooks.driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]"));
}
    public WebElement get_year()//locate the year filed
    {
        return Hooks.driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]"));
    }


 public WebElement get_First_name()
 {
     return Hooks.driver.findElement(By.id("FirstName"));

 }
 public WebElement get_Last_name()
 {
     return Hooks.driver.findElement(By.id("LastName"));

 }
public WebElement get_Email()
{
     return Hooks.driver.findElement(By.id("Email"));
}
public WebElement get_Company(){
     return Hooks.driver.findElement(By.id("Company"));
}
public WebElement get_password()
{
     return Hooks.driver.findElement(By.id("Password"));

}
public WebElement get_ConfirmPassword()
{
     return Hooks.driver.findElement(By.id("ConfirmPassword"));
}
public WebElement click_register()
{
     return Hooks.driver.findElement(By.id("register-button"));
}
public WebElement display_message(){
     return Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.master-wrapper-content div.master-column-wrapper div.center-1 div.page.registration-result-page div.page-body > div.result"));
}

}
