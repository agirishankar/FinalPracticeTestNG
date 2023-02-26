package com.Swaglabpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SwaglabLoginPage {
    private WebDriver driver;
    public SwaglabLoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver= driver;
    }
    @FindBy(css = "input[id='user-name']")
    public WebElement swaglabusername;

    @FindBy(css = "input[id='password']")
    public WebElement swaglabpassword;

    @FindBy(css = "input[id='login-button']")
    public WebElement swaglabLogin;
    @FindBy(css = "span[class='title']")
    public WebElement Productstitle;

    public void Webelementactions(String username,String password) {
        swaglabusername.sendKeys(username);
        swaglabpassword.sendKeys(password);
    }
    public void VerifyProductstitle() {
        Assert.assertTrue(Productstitle.isDisplayed());
        System.out.println(Productstitle.getText());
    }
}


