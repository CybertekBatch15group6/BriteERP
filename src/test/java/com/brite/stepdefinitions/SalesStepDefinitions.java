package com.brite.stepdefinitions;

import com.brite.pages.Sales.SalesPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SalesStepDefinitions {

    SalesPage salesPage = new SalesPage();


    @When("user navigates to {string}")
    public void user_navigates_to(String string) {

        salesPage.navigation(string);
    }

    @Then("user searches the quotation {string} as a number")
    public void user_searches_the_quotation_as_a_number(String string) {
        salesPage.passQuotationNumber(string);
    }

    @Then("user verifies that correct quotation number appears as {string}")
    public void user_verifies_that_correct_quotation_number_appears_as(String string) {

        Assert.assertEquals(string,salesPage.verifyNumber());
    }
}
