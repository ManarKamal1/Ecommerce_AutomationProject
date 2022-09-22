package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepDefs.Hooks.driver;

public class P01_Register {

    public WebElement register_URL(){
        By register_URL = By.className("ico-register");
        return driver.findElement(register_URL);
    }

    public WebElement genderChooser() {
        By genderChooser = By.id("gender-female");
        return driver.findElement(genderChooser);
    }

    public WebElement FirstNameTxtBox() {
        By FirstNameTxtBox = By.id("FirstName");
        return driver.findElement(FirstNameTxtBox);
    }

    public WebElement LastNameTxtBox() {
        By LastNameTxtBox = By.id("LastName");
        return driver.findElement(LastNameTxtBox);
    }

    public WebElement birthDayDropDown() {
        By selectBirthDay = By.name("DateOfBirthDay");
        return driver.findElement(selectBirthDay);
    }

    public WebElement BirthMonthDropDown() {
        By selectBirthMonth = By.name("DateOfBirthMonth");
        return driver.findElement(selectBirthMonth);
    }

    public WebElement BirthYearDropDown() {
        By selectBirthYear = By.name("DateOfBirthYear");
        return driver.findElement(selectBirthYear);
    }

    public WebElement emailAddressTxtBox() {
        By emailAddressTxtBox = By.cssSelector("div[class=\"inputs\"] > input[type=\"email\"]");
        return driver.findElement(emailAddressTxtBox);
    }

    public String validEmail() {
        return "manar.kamal@example.com";
    }

    public WebElement passwordTxtBox() {
        By passwordTxtBox = By.id("Password");
        return driver.findElement(passwordTxtBox);
    }

    public String validPassword() {
        return "TEST@1234";
    }

    public WebElement passwordConfirmationField() {
        By passwordConfirmationField = By.id("ConfirmPassword");
        return driver.findElement(passwordConfirmationField);
    }

    public WebElement registerBtn() {
        By registerBtn = By.cssSelector("button[name=\"register-button\"]");
        return driver.findElement(registerBtn);
    }

    public WebElement RegsuccessMsg() {
        By RegsuccessMsg = By.cssSelector("div[class=\"result\"]");
        return driver.findElement(RegsuccessMsg);
    }

}
