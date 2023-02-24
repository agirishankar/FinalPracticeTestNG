package com.Swaglabpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwaglabDetailspage {

    private WebDriver driver;
    public SwaglabDetailspage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public void prices() throws InterruptedException {
        List<WebElement> listofallprices = new ArrayList<WebElement>();
        listofallprices = driver.findElements(By.cssSelector("div.inventory_item_price"));
        List<Double> allproductsamount = new ArrayList<>();
        for (WebElement webElement : listofallprices)
        {allproductsamount.add(Double.parseDouble(webElement.getText().replace("$", "")));
        }
        System.out.println(Collections.min(allproductsamount));
        Double minproductamount = Collections.min(allproductsamount);
        System.out.println("Min amount" + minproductamount);
        WebElement minproductamountpriceAddtocart = driver.findElement(By.xpath("//div[@class='pricebar']//div[text()='"+minproductamount+"']//following-sibling::button[text()='Add to cart']"));
        minproductamountpriceAddtocart.click();
        Thread.sleep(2000);
        WebElement Addtocartlink = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        Addtocartlink.click();
        WebElement checkoutbutton = driver.findElement(By.cssSelector("button[id='checkout']"));
        checkoutbutton.click();
}


}
