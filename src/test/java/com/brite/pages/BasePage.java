package com.brite.pages;

import com.brite.utilities.BrowserUtils;
import com.brite.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver,20);

    public void navigation (String module){
        BrowserUtils.waitForPageToLoad(10);
        String path = "(//span[@class='oe_menu_text' and contains(text(), '"+module+"')])[1]";
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(path)))).click();
    }




}
