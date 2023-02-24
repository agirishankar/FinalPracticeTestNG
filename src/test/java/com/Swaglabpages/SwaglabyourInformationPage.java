package com.Swaglabpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwaglabyourInformationPage {

    private WebDriver driver;
    public SwaglabyourInformationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(css ="input[id='first-name']")

    WebElement checkoutfirstnametextbox;

    @FindBy(css ="input[id='last-name']")
    WebElement checkoutlasttnametextbox;

    @FindBy(css ="input[id='postal-code']" )
    WebElement  checkoutzipcodetnametextbox;
    @FindBy(css ="input[id='continue']")
    WebElement continuebutton;

    public void chekoutyourinformationpage(String firstname,String lastname,String zipcode) throws InterruptedException {
        checkoutfirstnametextbox.sendKeys(firstname);
        checkoutlasttnametextbox.sendKeys(lastname);
        checkoutzipcodetnametextbox.sendKeys(zipcode);
        continuebutton.click();
    }

}
