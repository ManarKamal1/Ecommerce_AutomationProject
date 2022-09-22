package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.example.stepDefs.Hooks.driver;

public class P03_HomePage {



    public WebElement currencyDropDown(){
        By currencyDropDown = By.id("customerCurrency");
        return driver.findElement(currencyDropDown);
    }

    public List<WebElement> items_Prices(){
        By items_Prices = By.className("prices");
        return driver.findElements(items_Prices);
    }

    public WebElement search_Field(){
        By search_Field = By.id("small-searchterms");
        return driver.findElement(search_Field);
    }

    public WebElement search_Btn(){
        By search_Btn = By.xpath("//*[@class=\"button-1 search-box-button\"]");
        return driver.findElement(search_Btn);
    }

    public List<WebElement> search_Results(){
        By search_Results = By.className("item-box");
        return driver.findElements(search_Results);
    }

    public WebElement getProductSku(){
        By ProductSku = By.xpath("//*[@class=\"sku\"]/span[2]");
        return driver.findElement(ProductSku);
    }

    public WebElement electronics_MainCategory(){
        By electronics_MainCategory = By.xpath("//ul[@class='top-menu notmobile']/li[2]/a");
        return driver.findElement(electronics_MainCategory);
    }

    public WebElement cellPhones_SubCategory(){
        By cellPhones_SubCategory = By.xpath("//ul[@class='top-menu notmobile']/li[2]/ul/li[2]/a");
        return driver.findElement(cellPhones_SubCategory);
    }

    public WebElement subCategory_PageTitle(){
        By subCategory_PageTitle = By.xpath("//*[@class='page-title']");
        return driver.findElement(subCategory_PageTitle);
    }

    public WebElement First_SliderAndroid(){
        By First_SliderAndroid = By.xpath("//*[@class='nivoSlider']/a[1]");
        return driver.findElement(First_SliderAndroid);
    }

    public WebElement Second_SliderIphone(){
        By Second_SliderIphone = By.xpath("//*[@class='nivoSlider']/a[2]");
        return driver.findElement(Second_SliderIphone);
    }

    public WebElement FollowUs_FacebookIcon(){
        By FollowUs_FacebookIcon = By.xpath("//div[@class=\"footer-block follow-us\"]/div/ul/li[1]");
        return driver.findElement(FollowUs_FacebookIcon);
    }

    public WebElement FollowUs_TwitterIcon(){
        By FollowUs_TwitterIcon = By.xpath("//div[@class=\"footer-block follow-us\"]/div/ul/li[2]");
        return driver.findElement(FollowUs_TwitterIcon);
    }

    public WebElement FollowUs_RSSIcon(){
        By FollowUs_TwitterIcon = By.xpath("//div[@class=\"footer-block follow-us\"]/div/ul/li[3]");
        return driver.findElement(FollowUs_TwitterIcon);
    }

    public WebElement FollowUs_YouTubeIcon(){
        By FollowUs_TwitterIcon = By.xpath("//div[@class=\"footer-block follow-us\"]/div/ul/li[4]");
        return driver.findElement(FollowUs_TwitterIcon);
    }

    public WebElement HTCWishlist_Btn(){
        By HTCWishlist_Btn = By.xpath("(//*[@class=\"button-2 add-to-wishlist-button\"])[3]");
        return driver.findElement(HTCWishlist_Btn);
    }

    public WebElement Green_SuccessMSG(){
        By SuccessMSG = By.xpath("//*[@class=\"bar-notification success\"]");
        return driver.findElement(SuccessMSG);
    }

    public WebElement wishlist_Tab(){
        By wishlist_Tab = By.xpath("//*[@class=\"wishlist-label\"]");
        return driver.findElement(wishlist_Tab);
    }

    public WebElement Product_Qty(){
        By Product_Qty = By.xpath("//*[@class=\"qty-input\"]");
        return driver.findElement(Product_Qty);
    }


}
