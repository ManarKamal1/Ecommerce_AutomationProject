package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class D07_followUsStepDef {
    P03_HomePage homePage = new P03_HomePage();


    @When("User press on FollowUs Facebook icon")
    public void pressOnFacebookFollowIcon() {
        homePage.FollowUs_FacebookIcon().click();
    }

    @When("User press on FollowUs Twitter icon")
    public void pressOnTwitterFollowIcon() {
        homePage.FollowUs_TwitterIcon().click();
    }

    @When("User press on FollowUs RSS icon")
    public void pressOnRSSFollowIcon() {
        homePage.FollowUs_RSSIcon().click();
    }

    @When("User press on FollowUs Youtube icon")
    public void pressOnYoutubeFollowIcon() {
        homePage.FollowUs_YouTubeIcon().click();
    }

    @Then("New tab will be opened with this URL {string}")
    public void validateOpenedURL(String url) {

        List<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        try {
            Thread.sleep(2000);
            ArrayList<String> openedTabs = new ArrayList<String>(Hooks.driver.getWindowHandles());
            if(openedTabs.size()>1) {
                Hooks.driver.switchTo().window(tabs.get(1));
            }
            else {
                Hooks.driver.switchTo().window(tabs.get(0));
            }

        }
        catch (InterruptedException exp) {
            exp.printStackTrace();
        }
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), url);
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));
    }
}
