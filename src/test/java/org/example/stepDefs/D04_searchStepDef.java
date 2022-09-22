package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D04_searchStepDef {
    P03_HomePage search = new P03_HomePage();
    SoftAssert softAssert = new SoftAssert();


    @When("User search using product name {string} in search field")
    public void searchUsingProductName(String name) {
        search.search_Field().sendKeys(name);
    }

    @When("User search with product sku {string} in search field")
    public void searchWithProductSKU(String sku) {
        search.search_Field().sendKeys(sku);
    }

    @And("User press on Search button")
    public void pressSearchButton() {
        search.search_Btn().click();
    }

    @Then("Search results appears with products related to the product name {string}")
    public void searchResultsRelatedToProductName(String name) {
        softAssert.assertTrue(Hooks.driver.getCurrentUrl().toLowerCase().contains("https://demo.nopcommerce.com/search?q="));
        List<WebElement> products = search.search_Results();
        for (WebElement product : products) {
            softAssert.assertTrue(product.getText().toLowerCase().contains(name));
        }

        softAssert.assertAll();
    }

    @Then("Search results appears with products related to the product sku {string}")
    public void searchResultsRelatedToProductSKU(String sku) {
        search.search_Results().get(0).click();
        Assert.assertTrue(search.getProductSku().getText().contains(sku));
    }
}
