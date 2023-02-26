package com.Swaglabpages;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SwaglabChekoutOverviewPage {
private WebDriver driver;

public SwaglabChekoutOverviewPage(WebDriver driver){

    PageFactory.initElements(driver,this);
    this.driver=driver;
}


    @FindBy(xpath = "//div[text()='Sauce Labs Onesie']")
    WebElement chekoutdetailspageproductname;

    @FindBy (xpath = "//div[@class='item_pricebar']//child::div[text()='7.99']")
    WebElement chekoutdetailspageproductprice;
public void chekoutdetailspage() {
    String chekoutdetailspageproductnamedisplayed = chekoutdetailspageproductname.getText();
    String chekoutdetailspageproductpricedisplayed = chekoutdetailspageproductprice.getText();
    System.out.println(chekoutdetailspageproductnamedisplayed);
    System.out.println(chekoutdetailspageproductpricedisplayed);
}
    public void Verifychekoutdetailspage() {
        Assert.assertTrue(chekoutdetailspageproductname.isDisplayed());
        System.out.println(chekoutdetailspageproductname.getText());
        Assert.assertTrue(chekoutdetailspageproductprice.isDisplayed());
        System.out.println(chekoutdetailspageproductprice.getText());
    }

}


