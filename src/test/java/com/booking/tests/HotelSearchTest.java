package com.booking.tests;

import com.booking.pages.HotelSearchPage;
import com.booking.pages.ResultsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HotelSearchTest extends BaseTest {

    @Test
    public void searchHotelTest() {
        HotelSearchPage hotelSearchPage = new HotelSearchPage(driver);
        hotelSearchPage.setCity("Warszawa");
//        hotelSearchPage.setDates("2024-05-01","2024-05-10");
        hotelSearchPage.performSearch();
        hotelSearchPage.closePromoAlert();

        ResultsPage resultsPage = new ResultsPage(driver);

        Assert.assertTrue(resultsPage.resultHeading.isDisplayed());

        List<String> hotelNames = resultsPage.getHotelNames();
        System.out.println(hotelNames);

    }

}
