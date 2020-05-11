package com.brite.pages;

import com.brite.utilities.BrowserUtils;
import com.brite.utilities.ConfigurationReader;
import com.brite.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    @FindBy (id = "login")
    private WebElement email;

    @FindBy (id = "password")
    private WebElement password;

    @FindBy (css = "[class='btn btn-primary']")
    private WebElement login;

    public LoginPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    /**
     * Login as Purchasing Manager
     * credentials will be retrieved from configuration.properties file
     */
    public void loginAsPurchasingManager(){
        email.sendKeys(ConfigurationReader.getProperty("purchasing_manager"));
        BrowserUtils.wait(2);
        password.sendKeys(ConfigurationReader.getProperty("purchasing_password"));
        wait.until(ExpectedConditions.elementToBeClickable(login)).click();
    }

    /**
     * Login as Sales Manager
     * credentials will be retrieved from configuration.properties file
     */
    public void loginAsSalesManager(){
        email.sendKeys(ConfigurationReader.getProperty("sales_manager"));
        BrowserUtils.wait(2);
        password.sendKeys(ConfigurationReader.getProperty("sales_password"));
        wait.until(ExpectedConditions.elementToBeClickable(login)).click();
    }

    /**
     * Login as Expenses Manager
     * credentials will be retrieved from configuration.properties file
     */
    public void loginAsExpensesManager(){
        email.sendKeys(ConfigurationReader.getProperty("expenses_manager"));
        BrowserUtils.wait(2);
        password.sendKeys(ConfigurationReader.getProperty("expenses_password"));
        wait.until(ExpectedConditions.elementToBeClickable(login)).click();
    }

    /**
     * Login as Events Manager
     * credentials will be retrieved from configuration.properties file
     */
    public void loginAsEventsManager(){
        email.sendKeys(ConfigurationReader.getProperty("events_scrm_manager"));
        BrowserUtils.wait(2);
        password.sendKeys(ConfigurationReader.getProperty("events_password"));
        wait.until(ExpectedConditions.elementToBeClickable(login)).click();
    }

    /**
     * Login as CRM Manager
     * credentials will be retrieved from configuration.properties file
     */
    public void loginAsCRMManager(){
        email.sendKeys(ConfigurationReader.getProperty("crm_event_manager"));
        BrowserUtils.wait(2);
        password.sendKeys(ConfigurationReader.getProperty("crm_password"));
        wait.until(ExpectedConditions.elementToBeClickable(login)).click();
    }

    /**
     * Login as POS Manager
     * credentials will be retrieved from configuration.properties file
     */
    public void loginAsPOSManager(){
        email.sendKeys(ConfigurationReader.getProperty("pos_manager"));
        BrowserUtils.wait(2);
        password.sendKeys(ConfigurationReader.getProperty("pos_password"));
        wait.until(ExpectedConditions.elementToBeClickable(login)).click();
    }

    /**
     * Login as POS Manager
     * credentials will be retrieved from configuration.properties file
     */
    public void loginAsInventoryManager(){
        email.sendKeys(ConfigurationReader.getProperty("inventory_manager"));
        BrowserUtils.wait(2);
        password.sendKeys(ConfigurationReader.getProperty("inventory_password"));
        wait.until(ExpectedConditions.elementToBeClickable(login)).click();
    }

    /**
     * Login with any email and password
     * @param emailValue        accepts an email
     * @param passwordValue     accepts a password
     */
    public void login(String emailValue, String passwordValue){
        email.sendKeys(emailValue);
        BrowserUtils.wait(2);
        password.sendKeys(passwordValue);
        wait.until(ExpectedConditions.elementToBeClickable(login)).click();
    }

}
