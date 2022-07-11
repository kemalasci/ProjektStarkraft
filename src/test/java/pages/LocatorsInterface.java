package pages;

import org.openqa.selenium.By;

public interface LocatorsInterface {

    By linkKontrol = By.cssSelector("a");
    By cookiesButton = By.cssSelector("a.ginger_btn.ginger-accept.ginger_btn_accept_all");
    By karriereMenuItem = By.xpath("//a[text()='Karriere'][1]");
    By moreInformationButton = By.xpath("(//i[@class='btl bt-plus'])[2]");
    By betweenInformationButton = By.cssSelector(".slick-next.slick-arrow");
    By javaPytonTitle = By.xpath("(//h4[text()='JAVA & Python Entwicklung'])[2]");
    By scroolToOffeneStellen = By.xpath("//h2[text()='Werde ein Teil von Starkkraft']");


    By jobPageControl = By.cssSelector("h2.vacancy_title.sk_blau");
    By scrooltoForm = By.cssSelector(" h2.text-center.sk_blau.vacancy_form__title");


    By nameSurnameInput = By.cssSelector("input#input_3_2");
    By mobileInput = By.cssSelector("input#input_3_3");
    By emailInput = By.cssSelector("input#input_3_4");
    By interestedInput = By.cssSelector("input#input_3_5");
    By messageInput = By.cssSelector("textarea#input_3_6.textarea.medium");
    By applyNowbutton = By.xpath("(//input[@id='gform_submit_button_3'])[1]");
    By errorControl = By.xpath("(//div[@class='validation_error'])[1]");

    By sacialMediaList = By.cssSelector("li.social__item");
    By aplicationList = By.cssSelector("div[class^='ginput_container ginput_container']");

}
