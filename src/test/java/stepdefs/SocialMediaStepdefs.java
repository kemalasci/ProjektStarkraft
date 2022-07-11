package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.LocatorsInterface;
import utils.BaseClass;
import utils.Config;

import java.util.List;
import java.util.Set;

import static pages.InformationClass.url;

public class SocialMediaStepdefs extends BaseClass implements LocatorsInterface {


    @When("click social media web pages  links and Page Control")
    public void clickSocialMediaWebPagesLinksAndPageControl() throws InterruptedException {
        String homePageIds = driver.getWindowHandle();

        List<WebElement> links = driver.findElements(sacialMediaList);

        for (WebElement link : links) {
            link.click();

            Thread.sleep(1000);
        }
        Set<String> windowIDs = driver.getWindowHandles();

        for (String ID : windowIDs) {
            if (ID.equals(homePageIds)) continue;


            driver.switchTo().window(ID);


            Assert.assertTrue(driver.getCurrentUrl().toLowerCase().contains("com"));


            driver.close();

        }
        driver.quit();
    }


}
