package co.com.travelocity.com.co.stepdefinitions;


import co.com.travelocity.exceptions.CauseResultNotWaitedException;
import co.com.travelocity.models.TransactionLogin;
import co.com.travelocity.tasks.login.InitiationWeb;
import co.com.travelocity.tasks.login.SubmitsUserAndPassword;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.com.travelocity.userinterfaces.login.MenuLogin.BTN_SEARCH;
import static co.com.travelocity.util.Utilities.getRandomDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getWebdriverManager;

public class LoginStepDefinitions {

    static WebDriver driver = getWebdriverManager().getWebdriver(getRandomDriver());

    @Before
    public void configurationsActor() {
        TransactionLogin.setStrEmail(System.getProperty("user"));
        TransactionLogin.setStrPassword(System.getProperty("password"));
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Duban").can(BrowseTheWeb.with(driver));

    }

    @Given("transactional user navigate to the login page")
    public void transactionalUserNavigateToTheLoginPage() {
        theActorInTheSpotlight().attemptsTo(InitiationWeb.url());

    }

    @When("enter your credentials")
    public void enterYourCredentials() {
        theActorInTheSpotlight().attemptsTo(SubmitsUserAndPassword.inApp(
                TransactionLogin.getStrEmail(), TransactionLogin.getStrPassword()));

    }

    @Then("he should be logged in")
    public void heShouldBeLoggedIn() {

        theActorInTheSpotlight().should(seeThat(WebElementQuestion.the(BTN_SEARCH), isVisible())
                .orComplainWith(CauseResultNotWaitedException.class, "Error al cargar el menu de Travelocity."));

    }


}
