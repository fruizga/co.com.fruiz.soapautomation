package co.com.fruiz.soapautomation.stepdefinitions;

import co.com.fruiz.soapautomation.questions.LastResponseStatus;
import co.com.fruiz.soapautomation.tasks.AddNumbers;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepDefinitionsSoapAddNumbers {
    @When("^you add two numbers$")
    public void youAddTwoNumbers(List<String> values) {
        theActorInTheSpotlight().attemptsTo(AddNumbers.with(values));
    }

    @Then("^I should see the response of the service is (\\d+)$")
    public void iShouldSeeTheResponseOfTheServiceIs(int code) {
        theActorInTheSpotlight().should(
                seeThat("last response status code is 200",
                        LastResponseStatus.isEqualsTo(code))
        );

    }
}
