package com.brite.pages;

import com.brite.utilities.BrowserUtils;
import com.brite.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver,20);

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    protected WebElement curretUsername;
    public String getCurrentUserName(){
        BrowserUtils.wait(3);
        wait.until(ExpectedConditions.visibilityOf(curretUsername));
        return curretUsername.getText();
    }



    public void navigation (String module){
        BrowserUtils.waitForPageToLoad(10);
        String path = "(//span[@class='oe_menu_text' and contains(text(), '"+module+"')])[1]";
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(path)))).click();
    }




}