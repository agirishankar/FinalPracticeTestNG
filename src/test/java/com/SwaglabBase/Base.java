package com.SwaglabBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;


    public class Base {
        public WebDriver driver;
        @BeforeSuite
        public void launchDriver() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        @BeforeMethod
        public void url() {
            driver.get("https://www.saucedemo.com/");
        }
       // @AfterTest
        public void quit(){
            driver.quit();

        }
    }


