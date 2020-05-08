package com.brite.stepdefinitions;

import com.brite.pages.LoginPage;
import com.brite.utilities.BrowserUtils;
import com.brite.utilities.ConfigurationReader;
import com.brite.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("Open login page");
        String URL = ConfigurationReader.getProperty("URL");
        Driver.getDriver().get(URL);
    }

    @When("user logs in as a purchasing manager")
    public void user_logs_in_as_a_purchasing_manager() {
        System.out.println("Login as a purchasing manager");
        loginPage.loginAsPurchasingManager();
    }

    @Then("user should verify that title is #Inbox - Odoo")
    public void user_should_verify_that_title_is_Inbox_Odoo() {
        System.out.println("Verify that title is #Inbox - Odoo");
        BrowserUtils.waitForPageToLoad(10);
        BrowserUtils.wait(3);
        Assert.assertEquals("#Inbox - Odoo", Driver.getDriver().getTitle());
    }

}
