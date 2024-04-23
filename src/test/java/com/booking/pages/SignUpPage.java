package com.booking.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

    @FindBy(id = "username")
    private WebElement emailInput;

    @FindBy(xpath = "//span[text()='Kontynuuj za pomocą e-maila']")
    private WebElement continueButton;

    @FindBy(id = "new_password")
    private WebElement newPasswordInput;

    @FindBy(id = "confirmed_password")
    private WebElement confirmedPasswordInput;

    @FindBy(xpath = "//span[text()='Utwórz konto']")
    private WebElement createAccountButton;

    public SignUpPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setEmail(String email) {
        emailInput.sendKeys(email);
    }

    public void continueSignUp() {
        continueButton.click();
    }

    public void setNewPassword(String password) {
        newPasswordInput.sendKeys(password);
    }

    public void setConfirmedPassword(String confirmPassword) {
        confirmedPasswordInput.sendKeys(confirmPassword);
    }

    public void signUp() {
        createAccountButton.click();
    }



}
