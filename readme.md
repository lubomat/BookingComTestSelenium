# Booking.com Test Automation Project

## About the Project
This project demonstrates automated tests for the Booking.com website using Selenium WebDriver. It focuses on a few basic test scenarios for validating core functionalities of the website.

## Features
- Automated UI tests for:
    - Searching for hotels
    - Signing up a new user
- Basic validation of page elements and workflows.
- Modular design with reusable components such as page objects and utility classes.

## Technologies Used
- **Java 17** - Primary programming language.
- **Selenium WebDriver** - Web automation framework.
- **TestNG** - Testing framework for managing test execution.
- **WebDriverManager** - For managing browser drivers.
- **Log4j** - Logging framework for detailed execution logs.
- **ExtentReports** - For generating test execution reports.
- **Maven** - Build automation and dependency management.

## Project Structure

The project is organized as follows:

- **src/**
    - **main/**
        - **java/pl.testeroprogramowania/**
            - `Main.java` - Placeholder class for main execution.

    - **test/**
        - **java/com.booking/**
            - **pages/** - Page Object Model classes.
                - `HotelSearchPage.java` - Handles hotel search actions.
                - `LoggedUserPage.java` - Handles user account actions.
                - `ResultsPage.java` - Handles search results.
                - `SignUpPage.java` - Handles user sign-up.
            - **tests/** - Test classes.
                - `BaseTest.java` - Test setup and teardown logic.
                - `HotelSearchTest.java` - Hotel search test scenarios.
                - `SignUpTest.java` - User sign-up test scenarios.
            - **utils/** - Utility classes.
                - `DriverFactory.java` - Driver setup and configuration.
                - `PropertiesLoader.java` - Loads configuration properties.
                - `SeleniumHelper.java` - Helper methods (e.g., waits, screenshots).
        - **resources/**
            - **screenshots/** - Stores captured screenshots.
            - `config.properties` - Configuration file for browser settings.
            - `log4j2.xml` - Logging configuration.

- **target/**
    - Maven build output.

- **pom.xml** - Maven configuration file for dependencies and build settings.


## Test Scenarios
### 1. Hotel Search
- Select a city (e.g., "Bangkok") and search for hotels.
- Verify search results and handle promotional pop-ups.

### 2. User Sign-Up
- Open the registration form.
- Enter a randomly generated email address and set a password.
- Verify account creation.

## How to Run the Tests
1. **Prerequisites**:
    - Install JDK 17 or higher.
    - Install Maven.
    - Ensure the Chrome or Firefox browser is installed.

2. **Clone the Repository**:
   ```bash
   git clone https://github.com/lubomat/BookingComTestSelenium.git