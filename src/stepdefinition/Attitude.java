package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Attitude {

    @When("I meet ()")
    public void Imeet(String str) {

    }

    @Given("I work in ([\"]*)")
    public void In(String str) {

        if (str.equals("Latenights")) {
            System.out.println("Latenight automation");
        }

        if (str.equals("Mornings")) {
            System.out.println("Mornings automation");
        }

    }

    @Then("I ([\"]*))")
    public void Greet(String str) {
        if (str.equals("Greeted")) {
            System.out.println("Greeted automation");
        }
    }



}
