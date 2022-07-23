package co.com.choucair.prueba.stepdefinitions;

import co.com.choucair.prueba.questions.Answer;
import co.com.choucair.prueba.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class ChoucairPruebaStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^The user want sign up in Utest\\.com$")
    public void theUserWantSignUpInUtestCom() {
        OnStage.theActorCalled("User").wasAbleTo(OpenUp.thepage(), (Login.onThePage()));
    }

    @When("^he send the form with his information complete on sign up page$")
    public void heSendTheFormWithHisInformationCompleteOnSignUpPage() {
        OnStage.theActorInTheSpotlight().attemptsTo(Basic.UserInformation(), (Adress.AdressInformation()), (Devices.DevicesInformation()), (Ultimate.UltimateStep()));
    }

    @Then("^fill in the form and get (.*)$")
    public void fillInTheFormAndGetCompleteSetup(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toFinish(question)));
    }

}
