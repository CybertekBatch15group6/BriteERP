package com.brite.stepDefinitions;

import com.brite.pages.LoginPage;
import com.brite.utilities.ConfigurationReader;
import com.brite.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page(){
        System.out.println("user opens login page");
        Driver.getDriver().get(ConfigurationReader.getProperty("URL"));

    }

    @When("user logs in as a purchasing manager")
    public void user_logs_in_as_a_purchasing_manager() {
        System.out.println("Logging in as purchasing manager");
        loginPage.loginAsPurchasingManager();
    }

    @When("user logs in as a crm manager")
    public void user_logs_in_as_a_crm_manager() {
        System.out.println("Logging in as purchasing manager");
        loginPage.loginAsCRMManager();
    }

    @Then("user should verify that title is #Inbox - Odoo")
    public void user_should_verify_that_title_is_Inbox_Odoo() {
        Assert.assertEquals("#Inbox - Odoo", Driver.getDriver().getTitle());
    }
}
