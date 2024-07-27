package org.example.pages;
import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {
    public WebElement login_link()  {
        return Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.header div.header-upper div.header-links-wrapper div.header-links ul:nth-child(1) li:nth-child(2) > a.ico-login"));
    }

    public WebElement get_email(){
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement get_password(){
        return Hooks.driver.findElement(By.id("Password"));
    }
    public  WebElement RememberMe(){
        return Hooks.driver.findElement(By.xpath("//label[contains(text(),'Remember me?')]"));
    }
    public WebElement click_login(){
        return Hooks.driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
    }

    public WebElement my_account(){
        return Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.header div.header-upper div.header-links-wrapper div.header-links ul:nth-child(1) li:nth-child(1) > a.ico-account"));
    }

    //assertion
    public WebElement login_success(){
        return Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.master-wrapper-content div.master-column-wrapper div.center-2 div.page.account-page.customer-info-page div.page-title > h1:nth-child(1)"));
    }

    public WebElement login_failed(){
        return Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.master-wrapper-content div.master-column-wrapper div.center-1 div.page.login-page div.page-body div.customer-blocks div.returning-wrapper.fieldset form:nth-child(1) > div.message-error.validation-summary-errors:nth-child(1)"));
    }


}
