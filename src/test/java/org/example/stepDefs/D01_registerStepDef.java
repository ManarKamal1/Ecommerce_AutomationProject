package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Register;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
    P01_Register register = new P01_Register();


    @Given("Users redirects to registration page")
    public void registrationPage(){
        register.register_URL().click();
    }

    @When("Users enters gender type")
    public void entersGender() {
        register.genderChooser().click();
    }


    @And("Users enters their First Name")
    public void entersFirstName() {
        register.FirstNameTxtBox().sendKeys("Manar");
    }


    @And("Users enters their Last Name")
    public void entersLastName() {
        register.LastNameTxtBox().sendKeys("Kamal");
    }


    @And("Users selects date of birth")
    public void selectBirthDate() {
        Select select = new Select(register.birthDayDropDown());
        select.selectByValue("18");

        select = new Select(register.BirthMonthDropDown());
        select.selectByValue("8");

        select = new Select(register.BirthYearDropDown());
        select.selectByValue("1993");
    }


    @And ("Users enters their valid email address")
    public void entersEmail() {
        register.emailAddressTxtBox().sendKeys(register.validEmail());
    }


    @And ("Users enters valid password")
    public void entersPassword() {
        register.passwordTxtBox().sendKeys(register.validPassword());
    }

    @And ("Users re-enters the same valid password")
    public void passwordConfirmation() {
        register.passwordConfirmationField().sendKeys(register.validPassword());
    }

    @And ("Users presses on register button")
    public void pressRegisterButton() {
        register.registerBtn().click();
    }


    @Then("success registration message appears")
    public void user_could_register_successfully() {
        SoftAssert softAssert= new SoftAssert();
        String actualResult = register.RegsuccessMsg().getText();
        String expectedResult = "Your registration completed";
        String MsgColor = register.RegsuccessMsg().getCssValue("color");
        softAssert.assertEquals(actualResult,expectedResult);
        softAssert.assertEquals(MsgColor,"rgba(76, 177, 124, 1)");
        System.out.println("Color = " + MsgColor);
    }
}
