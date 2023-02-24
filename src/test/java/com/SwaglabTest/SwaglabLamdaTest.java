package com.SwaglabTest;

import com.SwaglabBase.Base;
import com.Swaglabpages.SwaglabDetailspage;
import com.Swaglabpages.SwaglabLoginPage;
import com.Swaglabpages.SwaglabyourInformationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SwaglabLamdaTest extends Base{
    WebDriver driver;
    public SwaglabLoginPage swaglabLoginPage;
    public SwaglabDetailspage swaglabDetailspage;
    public SwaglabyourInformationPage swaglabyourInformationPage;
        @BeforeTest
        public void setUpLamdatest() {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            ChromeOptions chromeOptions = new ChromeOptions();
            desiredCapabilities.setCapability("browserName", "chrome");
            desiredCapabilities.setCapability("platform", "win10");
            desiredCapabilities.setCapability("browserVersion", "108");
            desiredCapabilities.setCapability("build", "QA");
            desiredCapabilities.setCapability("project", "swaglab");

            desiredCapabilities.setCapability("test", "swaglabsTestNG");

            try {
                driver = new RemoteWebDriver(new URL("https://shankar12933:BrbTsEMYFbuIj7wltU0Wz2uEwG8abDIy0plWznNRyiG4lpd5LI@hub.lambdatest.com/wd/hub"), desiredCapabilities);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            driver.get("https://www.saucedemo.com/");
        }
    @BeforeClass
    public void swaglabinitalizepages() {
        swaglabLoginPage = new SwaglabLoginPage(driver);
        swaglabDetailspage = new SwaglabDetailspage(driver);
        swaglabyourInformationPage = new SwaglabyourInformationPage(driver);
    }

    @Test
    public void test1() throws InterruptedException {
        swaglabLoginPage.Webelementactions("problem_user", "secret_sauce");
        swaglabLoginPage.swaglabLogin.click();
        swaglabLoginPage.VerifyProductstitle();
    }

    @Test
    public void test2() throws InterruptedException {
        swaglabLoginPage.Webelementactions("standard_user","secret_sauce");
        swaglabLoginPage.swaglabLogin.click();
        swaglabDetailspage.prices();
        swaglabyourInformationPage.chekoutyourinformationpage("shankar", "agiri", "584681");

    }
}
