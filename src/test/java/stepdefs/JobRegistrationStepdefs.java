package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.LocatorsInterface;
import utils.BaseClass;

import static pages.InformationClass.*;

public class JobRegistrationStepdefs extends BaseClass implements LocatorsInterface {


    @Then("user should be able to click on the link for SDET job application registration")
    public void userShouldBeAbleToClickOnTheLinkForSDETJobApplicationRegistration() {

        scroolTo(scroolToOffeneStellen);
        open(jobRegistrationLink);


            clickTo(cookiesButton);

        verifyElementContainsText(jobPageControl, "TEST-AUTOMATION");

    }

    @And("user schould be fill the application form")
    public void userSchouldBeFillTheApplicationForm() {

        scroolTo(scrooltoForm);
        clickTo(nameSurnameInput);
        sendKeysTo(nameSurnameInput, nameSurnameString);
        sendKeysTo(mobileInput, mobileInputString);
        sendKeysTo(emailInput, emailInputString);
        sendKeysTo(interestedInput, interestedInputString);
        sendKeysTo(messageInput, messageInputString);
    }

    @Then("user should be able to click on the apply now button")
    public void userShouldBeAbleToClickOnTheApplyNowButton() {
        clickTo(applyNowbutton);
    }


    @And("the user should see the validation_error message")
    public void theUserShouldSeeTheValidation_errorMessage() {
        verifyElementContainsText(errorControl, errorString);

    }


}
