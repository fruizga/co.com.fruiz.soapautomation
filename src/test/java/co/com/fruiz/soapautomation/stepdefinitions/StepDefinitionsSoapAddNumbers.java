package co.com.fruiz.soapautomation.stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionsSoapAddNumbers {
    @When("^you add two numbers$")
    public void youAddTwoNumbers(DataTable arg1) {

    }

    @Then("^I should see the response of the service is (\\d+)$")
    public void iShouldSeeTheResponseOfTheServiceIs(int arg1) {

    }
}
