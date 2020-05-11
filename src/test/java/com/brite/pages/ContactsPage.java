package com.brite.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ContactsPage extends BasePage {

    @FindBy(xpath = "//a[@data-menu='68']")
    private WebElement contacts;

    @FindBy(xpath = "//button[@accesskey='c']")
    private WebElement createButton;

    @FindBy(tagName = "Company")
    private WebElement companyField;

    @FindBy(className = "o_field_char o_field_widget o_input o_required_modifier")
    private WebElement nameButton;

    @FindBy(className = "btn btn-primary btn-sm o_form_button_save")
    private WebElement saveButton;

    @FindBy(className = "o_field_char o_field_widget o_required_modifier")
    private WebElement createdCompanyName;


    public void clickOnContacts() {
        wait.until(ExpectedConditions.elementToBeClickable(contacts)).click();
    }

    public void clickOnCreate() {
       createButton.click();
    }

    public void clickOnCompany() {
        companyField.click();
        //wait.until(ExpectedConditions.elementToBeClickable(company)).click();
    }

    public void enterCompanyName() {
        nameButton.click();
        nameButton.sendKeys("ASOS");
        //wait.until(ExpectedConditions.elementToBeClickable(company)).click();
    }

    public void clickOnSaveButton() {
       saveButton.click();
        // wait.until(ExpectedConditions.elementToBeClickable(contacts)).click();
    }

    public void verifyTitle() {
       String title = "ASOS";
        Assert.assertEquals(title, createdCompanyName.getText());
    }


}
