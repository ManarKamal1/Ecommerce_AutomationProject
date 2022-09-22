package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_Login;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D03_currenciesStepDef {
    P03_HomePage homePage = new P03_HomePage();
    P02_Login login = new P02_Login();


    @Given("User redirects to Home page")
    public void redirectsToHomePage() {
        SoftAssert softAssert= new SoftAssert();
        softAssert.assertTrue(Hooks.driver.getCurrentUrl().toLowerCase().contains("https://demo.nopcommerce.com/"));
    }
    @When("User choose Euro from drop down list")
    public void selectEuroCurrency() {
        Select select = new Select(homePage.currencyDropDown());
        select.selectByVisibleText("Euro");
    }
    @Then("All items prices is converted to Euro")
    public void RecheckAllPriceItemsConvertedToEuro() {
        List<WebElement> items_Prices = homePage.items_Prices();
        for(WebElement item_Price : items_Prices){
            Assert.assertTrue(item_Price.getText().contains("€"));
        }
    }
}
