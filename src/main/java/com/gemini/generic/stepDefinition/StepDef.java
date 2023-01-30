package com.gemini.generic.stepDefinition;

import com.gemini.generic.locator.Locator;
import com.gemini.generic.MobileAction;
import com.gemini.generic.MobileDriverManager;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;

public class StepDef {
    AppiumDriver driver = MobileDriverManager.getAppiumDriver();

    @Given("Application is launched")
    public void appLaunch() {
        System.out.println("app is launched");
        MobileAction.waitSec(8);
    }

    public void login(String username, String pass) {
        String heading = MobileAction.getElementText(Locator.LoginPageHeading);
        if (heading.equalsIgnoreCase("Welcome")) {
            MobileAction.typeText(Locator.usernameInput, username);
            MobileAction.waitSec(2);
        }
        MobileAction.typeText(Locator.passInput, pass);
        MobileAction.waitSec(5);
        ((AndroidDriver) driver).hideKeyboard();
        MobileAction.click(Locator.loginBtn);
        MobileAction.waitSec(5);
    }

    public boolean isElementDisplayed(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    @Then("Login in the application with {string} and {string}")
    public void loginInTheApplicationWithAnd(String username, String pass) {
        Actions act = new Actions(driver);

        login(username, pass);
        if (isElementDisplayed(Locator.terminateBtn)) {
            MobileAction.click(Locator.terminateBtn);
            MobileAction.waitUntilElementVisible(Locator.employeeCodeLogin, 5);
            if (isElementDisplayed(Locator.employeeCodeLogin)) {
                MobileAction.typeText(Locator.employeeCodeLogin, username);
                MobileAction.waitSec(5);
            }
            ((AndroidDriver) driver).hideKeyboard();
            MobileAction.click(Locator.submitBtn);
            MobileAction.waitSec(5);
            if (isElementDisplayed(Locator.otpFirstBox)) {
                MobileAction.click(Locator.otpFirstBox);
                act.sendKeys("8990").build().perform();
            }
            MobileAction.waitSec(3);
            ((AndroidDriver) driver).hideKeyboard();
            MobileAction.click(Locator.submitBtn);
            MobileAction.waitSec(2);
            login(username, pass);
            MobileAction.waitSec(4);
        }
    }


    @Then("Add details in Application form of {string} and {string}")
    public void addDetailsInApplicationForm(String gender, String sameAsProposer) {
        String year = "2001", month = "January", day = "19", name = "QA Test";
        MobileAction.click(Locator.appForm);
        MobileAction.waitSec(7);
        if (driver.findElement(Locator.eKycCheckBox).isDisplayed())
            MobileAction.click(Locator.eKycCheckBox);
        if (driver.findElement(Locator.btn_next).isDisplayed())
            MobileAction.click(Locator.btn_next);

        if (isElementDisplayed(Locator.maleGender)) {
            if (gender.equalsIgnoreCase("male")) {
                MobileAction.click(Locator.maleGender);
            } else {
                MobileAction.click(Locator.femaleGender);
            }
        }
        MobileAction.typeText(Locator.name, name);
        ((AndroidDriver) driver).hideKeyboard();

        MobileAction.click(Locator.dateBox);
        if (isElementDisplayed(Locator.btn_chooseYear))
            MobileAction.click(Locator.btn_chooseYear);

        while (true) {
            String yearRange = MobileAction.getElementText(Locator.year_range).split("~")[0].trim();
            if (Integer.parseInt(yearRange) > Integer.parseInt(year))
                MobileAction.click(Locator.previousDate);
            else break;

        }
        MobileAction.click(AppiumBy.xpath(Locator.year.replace("<year>", year)));
        System.out.println(Locator.month.replace("<month>", month).replace("<year>", year));
        System.out.println(Locator.day.replace("<month>", month).replace("<year>", year).replace("<day>", day));
        MobileAction.click(AppiumBy.xpath(Locator.month.replace("<month>", month).replace("<year>", year)));
        MobileAction.click(AppiumBy.xpath(Locator.day.replace("<month>", month).replace("<year>", year).replace("<day>", day)));
        if (sameAsProposer.equalsIgnoreCase("false"))
            MobileAction.click(Locator.eKycCheckBox);
        MobileAction.click(Locator.btn_next);


    }

    @Then("Choose Product")
    public void chooseProduct() {
        try {
            if (isElementDisplayed(Locator.productSel_next)) {
                MobileAction.click(Locator.productSel_next);
                MobileAction.click(Locator.productSel_next);
                MobileAction.click(Locator.productSel_next);
                MobileAction.click(Locator.productSel_next);
                MobileAction.click(Locator.btn_finish);
            }
            if (isElementDisplayed(Locator.ulip_products)) {
                MobileAction.click(Locator.ulip_products);
                MobileAction.click(Locator.ulip_FirstProduct);
            }
            MobileAction.waitUntilElementVisible(Locator.afterProdSelect, 7);
            MobileAction.click(Locator.afterProdSelect);
            MobileAction.waitSec(5);


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
