package com.booking.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelSearchPage {

    @FindBy(id = "onetrust-accept-btn-handler")
    private WebElement cookieButton;

    @FindBy(id = ":re:")
    private WebElement hotelSearchInput;

    @FindBy(className = "b80d5adb18")
//    private WebElement checkInInput;
//    @FindBy(xpath = "//span[@class='b80d5adb18']")
//    @FindBy(xpath = "//span[@class='cf06f772fa ef091eb985' and text()='19']")
    private WebElement checkInInput;

    @FindBy(xpath = "//span[text()='Data wymeldowania']")
    private WebElement checkOutInput;

    @FindBy(id = "//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[3]/div/button/span[2]/svg")
    private WebElement travelersInput;

    @FindBy(xpath = "//*[@id=\":rf:\"]/div/div[1]/div[2]/button[2]/span/span/svg")
    private WebElement adultPlusBtn;

    @FindBy(xpath = "//*[@id=\":rf:\"]/div/div[2]/div[2]/button[2]/span/span/svg")
    private WebElement childPlusBtn;

    @FindBy(xpath = "//*[@id=\":rf:\"]/div/div[3]/div[2]/button[2]/span/span/svg/path")
    private WebElement roomPlusBtn;

    @FindBy(xpath = "//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[4]/button")
    private WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"b2searchresultsPage\"]/div[46]/div/div/div/div[1]/div[1]/div/button")
    private WebElement promoAlertFrame;


    private WebDriver driver;

    public HotelSearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    private static final Logger logger = LogManager.getLogger();

    public void setCity(String cityName) {
        logger.info("Closing cookie");
        cookieButton.click();
        logger.info("Setting city " + cityName);
        hotelSearchInput.sendKeys(cityName);
        driver.findElement(By.xpath("//div[text()='"+cityName+"']")).click();
        logger.info("Setting city done");

    }

    public void setDates(String checkin, String checkout) {
        checkInInput.sendKeys(checkin);
        checkOutInput.sendKeys(checkout);
    }

    public void setTravelers() {
        travelersInput.click();
        adultPlusBtn.click();

    }

    public void performSearch() {
        logger.info("Performing search");
        searchButton.click();
        logger.info("Performing search done");
    }

    public void closePromoAlert() {
        try {
            promoAlertFrame.click();
        } catch (Exception e) {
            System.out.println("Wyskakujące okno promocyjne nie zostało wyświetlone lub nie można go zamknąć.");
        }
    }


}
