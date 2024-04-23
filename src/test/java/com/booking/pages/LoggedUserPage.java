package com.booking.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoggedUserPage {

    @FindBy(xpath = "div[text()='Twoje konto']")
    private WebElement myAccountLink;

    public LoggedUserPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String myAccount() {
        return myAccountLink.getText();
    }
}
