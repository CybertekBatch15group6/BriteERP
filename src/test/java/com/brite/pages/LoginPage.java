package com.brite.pages;

import com.brite.utilities.BrowserUtils;
import com.brite.utilities.ConfigurationReader;
import com.brite.utilities.Driver;
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
     */
    public void loginAsPurchasingManager(){
        BrowserUtils.wait(2);
        email.sendKeys(ConfigurationReader.getProperty("purchasing_manager"));
        BrowserUtils.wait(2);
        password.sendKeys(ConfigurationReader.getProperty("purchasing_password"));
        BrowserUtils.wait(2);
        login.click();
        BrowserUtils.wait(2);
    }

    /**
     * Login as Sales Manager
     */
    public void loginAsSalesManager(){
        BrowserUtils.wait(2);
        email.sendKeys(ConfigurationReader.getProperty("sales_manager"));
        BrowserUtils.wait(2);
        password.sendKeys(ConfigurationReader.getProperty("sales_password"));
        BrowserUtils.wait(2);
        login.click();
        BrowserUtils.wait(2);
    }

    /**
     * Login as Expenses Manager
     */
    public void loginAsExpensesManager(){
        BrowserUtils.wait(2);
        email.sendKeys(ConfigurationReader.getProperty("expenses_manager"));
        BrowserUtils.wait(2);
        password.sendKeys(ConfigurationReader.getProperty("expenses_password"));
        BrowserUtils.wait(2);
        login.click();
        BrowserUtils.wait(2);
    }

    /**
     * Login as Events Manager
     */
    public void loginAsEventsManager(){
        BrowserUtils.wait(2);
        email.sendKeys(ConfigurationReader.getProperty("events_scrm_manager"));
        BrowserUtils.wait(2);
        password.sendKeys(ConfigurationReader.getProperty("events_password"));
        BrowserUtils.wait(2);
        login.click();
        BrowserUtils.wait(2);
    }

    /**
     * Login as CRM Manager
     */
    public void loginAsCRMManager(){
        BrowserUtils.wait(2);
        email.sendKeys(ConfigurationReader.getProperty("crm_event_manager"));
        BrowserUtils.wait(2);
        password.sendKeys(ConfigurationReader.getProperty("crm_password"));
        BrowserUtils.wait(2);
        login.click();
        BrowserUtils.wait(2);
    }

    /**
     * Login as POS Manager
     */
    public void loginAsPOSManager(){
        BrowserUtils.wait(2);
        email.sendKeys(ConfigurationReader.getProperty("pos_manager"));
        BrowserUtils.wait(2);
        password.sendKeys(ConfigurationReader.getProperty("pos_password"));
        BrowserUtils.wait(2);
        login.click();
        BrowserUtils.wait(2);
    }

    /**
     * Login as POS Manager
     */
    public void loginAsInventoryManager(){
        BrowserUtils.wait(2);
        email.sendKeys(ConfigurationReader.getProperty("inventory_manager"));
        BrowserUtils.wait(2);
        password.sendKeys(ConfigurationReader.getProperty("inventory_password"));
        BrowserUtils.wait(2);
        login.click();
        BrowserUtils.wait(2);
    }

}
