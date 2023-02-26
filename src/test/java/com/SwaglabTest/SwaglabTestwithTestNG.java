package com.SwaglabTest;

import com.SwaglabBase.Base;
import com.Swaglabpages.SwaglabChekoutOverviewPage;
import com.Swaglabpages.SwaglabDetailspage;
import com.Swaglabpages.SwaglabLoginPage;
import com.Swaglabpages.SwaglabyourInformationPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SwaglabTestwithTestNG extends Base {
    public SwaglabLoginPage swaglabLoginPage;
    public SwaglabDetailspage swaglabDetailspage;
    public SwaglabyourInformationPage swaglabyourInformationPage;
    public SwaglabChekoutOverviewPage swaglabChekoutOverviewPage;

    @BeforeClass
    public void swaglabinitalizepages() {
        swaglabLoginPage = new SwaglabLoginPage(driver);
        swaglabDetailspage = new SwaglabDetailspage(driver);
        swaglabyourInformationPage = new SwaglabyourInformationPage(driver);
        swaglabChekoutOverviewPage=new SwaglabChekoutOverviewPage(driver);
    }

    @Test
    public void test1() throws InterruptedException {
        swaglabLoginPage.Webelementactions("problem_user", "secret_sauce");
        swaglabLoginPage.swaglabLogin.click();
        swaglabLoginPage.VerifyProductstitle();
    }

    @Test
    public void test2() throws InterruptedException {
        Thread.sleep(4000);
        swaglabLoginPage.Webelementactions("standard_user", "secret_sauce");
        swaglabLoginPage.swaglabLogin.click();
        swaglabDetailspage.prices();
        swaglabyourInformationPage.chekoutyourinformationpage("shankar", "agiri", "584681");
        swaglabChekoutOverviewPage.chekoutdetailspage();
        swaglabChekoutOverviewPage.Verifychekoutdetailspage();

    }

}

