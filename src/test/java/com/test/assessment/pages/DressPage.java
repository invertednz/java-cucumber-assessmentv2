package com.test.assessment.pages;

import com.test.framework.selenium.SeleniumTest;
import com.test.framework.selenium.base.SeleniumBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class DressPage extends SeleniumBase {


    @FindBy(linkText = "Sign in")
    public static WebElement LOGIN_BUTTON;

    @FindBy(xpath = "//a[@title='Add to cart']")
    public static WebElement ADDCART_BUTTON;

    public static String url = "http://automationpractice.com/index.php";


    public DressPage(WebDriver driver) {
        super(driver);
    }

    public void addFirstDressToCart(){
        ADDCART_BUTTON.click();
    }

    public Boolean onDressPage(){
        return ADDCART_BUTTON.isDisplayed();
    }
}