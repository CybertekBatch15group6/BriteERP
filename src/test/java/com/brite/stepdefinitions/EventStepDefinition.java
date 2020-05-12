package com.brite.stepdefinitions;


import com.brite.pages.EventPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class EventStepDefinition {

    EventPage eventPage = new EventPage();

 // @When("navigates to {string} module")
 // public void navigates_to_module(String module) {
 //    eventPage.navigateTo(module);
//  }
  //  @Given("User is on the login page")
  //  public void user_is_on_the_login_page() {
     // Write code here that turns the phrase above into concrete action;
 //}

    @When("user logs in as a event manager")
    public void user_logs_in_as_a_event_manager() {
  //     eventPage.
    }

    @When("navigates to {string} module")
    public void navigates_to_module(String string) {
      eventPage.navigation("Events");
    }
    @Then("user clicks on events")
    public void user_clicks_on_event() {
        eventPage.pleaseClickEvents();
    }

    @Then("user provides {string}, {string}, {string}, and {string} and clicks on confirm event")
    public void user_types_event_info(String eventName, String date, String endDate, String minimumAttendees) {
        eventPage.pleaseClickButton();
        eventPage.whatIsIt(eventName);
        eventPage.whenIsIt(date);
        eventPage.whenIsItEnding(endDate);
        eventPage.attending(minimumAttendees);
        eventPage.clickOnConfirm();
    }
}