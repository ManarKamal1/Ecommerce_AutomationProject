package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D05_hoverCategoriesStepDef {
    P03_HomePage homePage = new P03_HomePage();
    SoftAssert softAssert = new SoftAssert();

    String SubCategory;


    @When("User hover on one of main categories then click on one of it's sub categories")
    public void hoverOnMainThenClickOnSubcategory() {
        Actions actions = new Actions(Hooks.driver);
        actions.moveToElement(homePage.electronics_MainCategory()).
                moveToElement(homePage.electronics_MainCategory()).build().perform();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(homePage.electronics_MainCategory()));
        SubCategory = homePage.cellPhones_SubCategory().getText().toLowerCase().trim();
        System.out.println("***************" + SubCategory + "*********************");
        actions.moveToElement(homePage.electronics_MainCategory()).
                moveToElement(homePage.cellPhones_SubCategory())
                .click().build().perform();

    }

    @Then("User will be navigated to a page contains products about that subcategory")
    public void subcategoryResults() {
        softAssert.assertTrue(Hooks.driver.getCurrentUrl().contains("cell-phones"));
        softAssert.assertEquals(homePage.subCategory_PageTitle().getText(), "Cell phones");
        softAssert.assertTrue(homePage.subCategory_PageTitle().getText().
                toLowerCase().equals(SubCategory));
        softAssert.assertAll();

    }
}
