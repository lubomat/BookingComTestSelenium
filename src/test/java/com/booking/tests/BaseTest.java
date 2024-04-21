package com.booking.tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.booking.utils.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public WebDriver driver;

    protected static ExtentSparkReporter sparkReporter;

    protected static ExtentReports extentReports;

    @BeforeSuite
    public void beforeSuite() {
        sparkReporter = new ExtentSparkReporter("index.html");
        extentReports = new ExtentReports();
        extentReports.attachReporter(sparkReporter);
    }

    @AfterSuite
    public void afterSuite() {
        extentReports.flush();
    }

    @BeforeMethod
    public void setup() throws IOException {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();   //   "chrome"
        driver = DriverFactory.getDriver();
        driver.manage().timeouts().implicitlyWait(2L, TimeUnit.SECONDS);
        driver.get("http://booking.com");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void afterSetup() {
//        driver.quit();
    }
}

