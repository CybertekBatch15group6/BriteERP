package com.brite.pages.crm;

import com.brite.pages.BasePage;
import com.brite.utilities.BrowserUtils;
import com.brite.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CRMPage extends BasePage {

    @FindBy (className = "btn btn-primary btn-sm o-kanban-button-new")
    private WebElement createButton1;

    @FindBy (xpath = "//button[@name='close_dialog']")
    private WebElement createButton2;

    @FindBy (xpath = "//input[@id='o_field_input_2499']")
    private WebElement opportunityTitleInput;



    public void selectCreateButton1 (){
        wait.until(ExpectedConditions.elementToBeClickable(createButton1)).click();
    }

    public void inputOpportunityTitle (String opportunityTitleName){
        wait.until(ExpectedConditions.visibilityOf(opportunityTitleInput)).sendKeys(opportunityTitleName);
    }
    public void selectCreateButton2 (){
        createButton2.click();
    }
}
