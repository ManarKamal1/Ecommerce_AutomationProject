package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D08_WishlistStepDef {
    P03_HomePage homePage = new P03_HomePage();


    WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
    SoftAssert softAssert = new SoftAssert();


    @When("User press on add to wishlist button of HTC phone")
    public void clickOnWishListBtn() {
        homePage.HTCWishlist_Btn().click();
    }

    @And("User press on Wishlist tab")
    public void pressOnWishListTab() throws InterruptedException {
        Thread.sleep(1000);
        wait.until(ExpectedConditions.invisibilityOf(homePage.Green_SuccessMSG()));
        homePage.wishlist_Tab().click();
    }

    @Then("Green success message will be displayed")
    public void validateSuccessMessage() throws InterruptedException {
        Thread.sleep(1000);
        softAssert.assertTrue(homePage.Green_SuccessMSG().isDisplayed());
        softAssert.assertEquals(homePage.Green_SuccessMSG().
                getCssValue("background-color"), "rgba(75, 176, 122, 1)");
        softAssert.assertAll();
    }


    @Then("User will be navigated to wishlist page")
    public void verifyProductQuantity() {
        int product_Quantity = Integer.parseInt(homePage.Product_Qty().getAttribute("value"));
        softAssert.assertTrue(product_Quantity > 0);
        softAssert.assertAll();
    }
}
