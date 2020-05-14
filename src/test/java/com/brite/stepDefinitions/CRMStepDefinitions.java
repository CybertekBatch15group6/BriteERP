package com.brite.stepDefinitions;

import com.brite.pages.crm.CRMPage;
import com.brite.utilities.BrowserUtils;
import com.brite.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CRMStepDefinitions {

    CRMPage crmPage = new CRMPage();

    @When("user navigates to {string}")
    public void user_navigates_to(String string) {
        crmPage.navigation(string);
        BrowserUtils.wait(3);
    }

    @When("user selects first create button")
    public void user_selects_first_create_button() {
        crmPage.selectCreateButton1();
    }

    @When("user enters {string} as the Opportunity Title")
    public void user_enters_as_the_Opportunity_Title(String string) {
        crmPage.inputOpportunityTitle(string);
    }

    @When("user selects second create button")
    public void user_selects_second_create_button() {
        crmPage.selectCreateButton2();
    }

    @Then("a new pipeline called {string} will be visible")
    public void a_new_pipeline_called_will_be_visible(String string) {
        WebElement newPipeline = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'"+string+"')]//parent::strong//parent::div"));
        Assert.assertTrue(newPipeline.isDisplayed());
    }

    @When("user selects pipeline called {string}")
    public void user_selects_pipeline_called(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user selects action tab")
    public void user_selects_action_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user selects {string} button")
    public void user_selects_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user confirms deletion")
    public void user_confirms_deletion() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("pipeline called {string} should no longer be visible")
    public void pipeline_called_should_no_longer_be_visible(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
