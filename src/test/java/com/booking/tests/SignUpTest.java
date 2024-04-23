package com.booking.tests;

import com.booking.pages.HotelSearchPage;
import com.booking.pages.LoggedUserPage;
import com.booking.pages.SignUpPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTest extends BaseTest{

    @Test
    public void registerTest() {
        HotelSearchPage hotelSearchPage = new HotelSearchPage(driver);
        hotelSearchPage.openSignUpForm();
        int randomNum = (int) (Math.random()*1000);

        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.setEmail("Testowalny"+randomNum+"@gmail.com");
        signUpPage.continueSignUp();
        signUpPage.setNewPassword("Testowe321");
        signUpPage.setConfirmedPassword("Testowe321");
        signUpPage.signUp();

        LoggedUserPage loggedUserPage = new LoggedUserPage(driver);
        System.out.println();


    }
}
