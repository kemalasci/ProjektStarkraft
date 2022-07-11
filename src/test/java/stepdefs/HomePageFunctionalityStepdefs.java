package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.LocatorsInterface;
import utils.BaseClass;
import utils.Config;

import java.awt.*;

import static pages.InformationClass.url;

public class HomePageFunctionalityStepdefs extends BaseClass implements LocatorsInterface {

    @Given("User should be able to navigate to home Page")
    public void userShouldBeAbleToNavigateToHomePage() throws AWTException {
        Config.maximized = true;
        open(url);

        clickTo(By.partialLinkText("sc-dlVxhl bEDIID"));

            //RobotClass(7);

    }


   @When("All links in the home page should be properly defined")
    public void allLinksInTheHomePageShouldBeProperlyDefined() {
        verifyLinks(linkKontrol);
    }


    @Then("All image in the home page should be properly defined")
    public void allImageInTheHomePageShouldBeProperlyDefined() {
        selenium_broken_images(url);
    }
}
