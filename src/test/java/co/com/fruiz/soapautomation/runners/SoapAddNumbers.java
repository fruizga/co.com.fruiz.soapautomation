package co.com.fruiz.soapautomation.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/add_two_numbers.feature"},
        glue={"co.com.fruiz.soapautomation.stepdefinitions", "co.com.fruiz.soapautomation.utils"},
        snippets= SnippetType.CAMELCASE)
public class SoapAddNumbers {
}