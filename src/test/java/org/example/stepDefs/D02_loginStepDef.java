package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_Login;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;

public class D02_loginStepDef {
    P02_Login login = new P02_Login();


    @Given("Users redirects to Login page")
    public void redirectsLoginPage(){
        login.login_URL().click();
    }

    @When("Users logs in with {string} {string} and {string}")
    public void userLoginWithAnd(String type, String username, String password) {
        driver.findElement(By.id("Email")).sendKeys(username);
        driver.findElement(By.id("Password")).sendKeys(password);
    }



    @And("Users presses on Login button")
    public void PressLoginBtn() {
        login.logInButton().click();
    }


    @Then("Users logs in to the website successfully")
    public void SuccessLogin() {
        SoftAssert softAssert= new SoftAssert();
        // My Account Tab Validation
        String myAccountTab_Actual = login.myAccount_Tab().getText();
        String myAccountTab_Expected = "My account";
        softAssert.assertEquals(myAccountTab_Actual,myAccountTab_Expected);
        // Current URL Validation
        String currentURL_Actual = login.getCurrentURL();
        String currentURL_Expected = "https://demo.nopcommerce.com/";
        softAssert.assertEquals(currentURL_Actual,currentURL_Expected);
        softAssert.assertAll();
    }

    @Then("Users fails to login to the website")
    public void LoginFails() {
        SoftAssert softAssert= new SoftAssert();
        String Actual_Result = login.unSuccessfullLoginMsg().getText();
        String Expected_Result = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String MsgColor = login.unSuccessfullLoginMsg().getCssValue("color");
        softAssert.assertEquals(Actual_Result,Expected_Result);
        softAssert.assertEquals(MsgColor,"rgba(228, 67, 75, 1)");
        System.out.println("Color = " + MsgColor);
        softAssert.assertAll();

    }


}
