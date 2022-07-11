package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LocatorsInterface;
import utils.BaseClass;

import static pages.InformationClass.url;

public class KarrierePageStepdefs extends BaseClass implements LocatorsInterface {
    @Given("User should be able to navigate to homePage")
    public void userShouldBeAbleToNavigateToHomePage() {

        open(url);
       // clickTo(cookiesButton);
    }

    @When("karriereMenuItem should be clickable")
    public void karrieremenuitemShouldBeclickable() {
        clickTo(karriereMenuItem);
    }

    @Then("more info button should be clickable")
    public void moreInfoButtonShouldBeClickable() throws InterruptedException {

        clickTo(cookiesButton);

        clickTo(moreInformationButton);
    }

    @And("should be able to navigate between information pages")
    public void shouldBeAbleToNavigateBetweenInformationPages() {

        for (int i = 0; i < 5; i++) {

            clickTo(betweenInformationButton);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    @And("Java and Python entwicklung page should appear on the last page")
    public void javaAndPythonEntwicklungPageShouldAppearOnTheLastPage() {
        verifyElementContainsText(javaPytonTitle, "JAVA");
        driver.manage().deleteAllCookies();

    }



}
