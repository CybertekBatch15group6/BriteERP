package com.brite.pages;

import com.brite.utilities.BrowserUtils;
import com.brite.utilities.ConfigurationReader;
import com.brite.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage{

    @FindBy(id = "login")
    private WebElement email;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(css = "[class='btn btn-primary']")
    private WebElement login;

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void loginAsPurchasingManager(){
        wait.until(ExpectedConditions.visibilityOf(email));
        email.sendKeys(ConfigurationReader.getProperty("purchasing_manager"));
        password.sendKeys(ConfigurationReader.getProperty("purchasing_password"), Keys.ENTER);
        BrowserUtils.wait(4);

    }
}
