package com.booking.tests;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.booking.pages.HotelSearchPage;
import com.booking.pages.ResultsPage;
import com.booking.utils.SeleniumHelper;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class HotelSearchTest extends BaseTest {

    @Test
    public void searchHotelTest() throws IOException {
        ExtentTest test = extentReports.createTest("Search Hotel Test");
        HotelSearchPage hotelSearchPage = new HotelSearchPage(driver);
        hotelSearchPage.setCity("Bangkok");
        test.log(Status.PASS,"Setting city done", SeleniumHelper.getScreenshot(driver));
//        hotelSearchPage.setDates("2024-05-01","2024-05-10");
        hotelSearchPage.performSearch();
        hotelSearchPage.closePromoAlert();


        ResultsPage resultsPage = new ResultsPage(driver);

        Assert.assertTrue(resultsPage.resultHeading.isDisplayed());

        List<String> hotelNames = resultsPage.getHotelNames();
        System.out.println(hotelNames);

    }

}
