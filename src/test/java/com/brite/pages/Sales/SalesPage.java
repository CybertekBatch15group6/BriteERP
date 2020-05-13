package com.brite.pages.Sales;

import com.brite.pages.BasePage;
import com.brite.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SalesPage extends BasePage {

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    private WebElement search;

    @FindBy(xpath = "//td[contains(text(),'SO812')]")
    private WebElement quotationNumber;

    public void passQuotationNumber(String number){

        BrowserUtils.wait(4);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@class='o_searchview_input']"))).sendKeys(number,Keys.ENTER);


    }

    public String verifyNumber(){

        BrowserUtils.wait(5);
        BrowserUtils.waitForPageToLoad(10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[contains(text(),'SO812')]")));
        return driver.findElement(By.xpath("//td[contains(text(),'SO812')]")).getText().trim();


    }




}
