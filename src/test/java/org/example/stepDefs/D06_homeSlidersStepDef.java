package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class D06_homeSlidersStepDef {
    P03_HomePage homePage = new P03_HomePage();
    WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(60));
    String firstSliderExpectedPageURL = "https://demo.nopcommerce.com/nokia-lumia-1020";
    String secondSliderExpectedPageUrl = " https://demo.nopcommerce.com/iphone-6";


    @When("User press on First slider")
    public void pressOnFirstSlider() {
        homePage.First_SliderAndroid().click();
    }

    @When("User press on Second slider")
    public void clickOnSecondSlider() throws InterruptedException {
        Thread.sleep(5000);
        homePage.Second_SliderIphone().click();
    }

    @Then("User will be navigated to First slider details page")
    public void NavigationToFirstSlider_URL() {
        wait.until(ExpectedConditions.urlToBe(firstSliderExpectedPageURL));
        System.out.println(Hooks.driver.getCurrentUrl());
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), firstSliderExpectedPageURL);
    }

    @Then("User will be navigated to Second slider details page")
    public void NavigationToSecondSlider_Link() {
        wait.until(ExpectedConditions.urlToBe(secondSliderExpectedPageUrl));
        System.out.println(Hooks.driver.getCurrentUrl());
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), secondSliderExpectedPageUrl);
    }
}
