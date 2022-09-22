package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepDefs.Hooks.driver;

public class P02_Login {

    public WebElement login_URL(){
        By login_URL = By.className("ico-login");
        return driver.findElement(login_URL);
    }

    public WebElement logInButton() {
        By logInBtn = By.cssSelector("button[class=\"button-1 login-button\"]");
        return driver.findElement(logInBtn);
    }

    public WebElement myAccount_Tab() {
        By myAccount_Tab = By.cssSelector("a[class=\"ico-account\"]");
        return driver.findElement(myAccount_Tab);
    }
    public String getCurrentURL(){
        String strUrl = driver.getCurrentUrl();
        return strUrl;
    }

    public WebElement unSuccessfullLoginMsg() {
        By unSuccessfullLoginMsg = By.cssSelector("div[class=\"message-error validation-summary-errors\"]");
        return driver.findElement(unSuccessfullLoginMsg);
    }

}
