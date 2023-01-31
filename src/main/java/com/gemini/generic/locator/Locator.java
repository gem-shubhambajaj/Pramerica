package com.gemini.generic.locator;

import io.appium.java_client.AppiumBy;
import jdk.nashorn.internal.ir.LexicalContext;
import org.openqa.selenium.By;

public class Locator {
    public static String btn_generic = "//android.widget.Button[@text='<button>']";
    public static By LoginPageHeading = AppiumBy.xpath("//android.widget.Image/following-sibling::android.widget.TextView");
    public static By usernameInput = AppiumBy.xpath("//android.view.View[2]//android.widget.EditText");
    public static By passInput = AppiumBy.xpath("//android.view.View[3]//android.widget.EditText");
    public static By loginBtn = AppiumBy.xpath("//*[@text='Sign In']");
//    public static By loginBtn = AppiumBy.xpath("//android.view.View[4]//android.widget.Button");
    public static By signUpBtn = AppiumBy.xpath("//android.widget.TextView[@text='Sign Up']");
    public static By contactUsBtn = AppiumBy.xpath("//android.widget.TextView[@text='Sign Up']");
    public static By forgotPinBtn = AppiumBy.xpath("//android.widget.TextView[@text='Forgot PIN']");
    public static By terminateBtn = AppiumBy.xpath("//android.widget.Button[contains(@text,'Terminate')]");
    public static By employeeCodeLogin = AppiumBy.xpath("//android.view.View/android.widget.EditText");
    public static By submitBtn = AppiumBy.className("android.widget.Button");
    public static By otpFirstBox = AppiumBy.xpath("//android.view.View/android.widget.EditText[1]");
    public static By appForm = AppiumBy.xpath("//android.view.View/android.view.View[4]/android.view.View");
//    public static By eKycCheckBox = AppiumBy.id("ion-tg-0");
    public static By eKycCheckBox = AppiumBy.xpath("//android.widget.ToggleButton");
    public static By btn_next = AppiumBy.xpath("//android.widget.Button[@text='NEXT']");
    public static By name = AppiumBy.xpath("//android.widget.TextView[@resource-id='ion-input-5-lbl']/..//following-sibling::android.widget.EditText");
    public static By maleGender= AppiumBy.xpath("//android.widget.Image[@text='Ico-Male']");
    public static By femaleGender= AppiumBy.xpath("//android.widget.Image[@text='Ico-Female']");
    public static By loadingBox= AppiumBy.xpath("//android.widget.TextView[@text='Loading']/..");
    public static By dateBox= AppiumBy.xpath("//android.view.View/android.view.View/android.widget.EditText[2]");
    public static By btn_chooseYear= AppiumBy.xpath("//android.widget.Button[@text='Choose month and year']");
    public static By year_range= AppiumBy.xpath("//android.view.View[contains(@text,'~')]");
    public static String year = "//android.view.View[@text='<year>']";
    public static String month = "//android.view.View[@text='<month> <year>']";
    public static String day = "//android.view.View[@text='<month> <day>, <year>']";
    public static By previousDate = AppiumBy.xpath("//android.widget.Button[contains(@text,'Previous')]");
    public static By sameAsProposer = AppiumBy.id("ion-tg-1");
    public static By productSel_next = AppiumBy.xpath("//android.widget.Image[@text='chevron forward outline']/..");
    public static By btn_finish = AppiumBy.xpath("//android.widget.TextView[@text='Finish']");
    public static By ulip_products = AppiumBy.xpath("//android.widget.Button[contains(@text,'ULIP')]");
    public static By ulip_FirstProduct = AppiumBy.xpath("(//android.widget.Image[@text='pic'])[1]/..");
    public static By afterProdSelect = AppiumBy.xpath("//android.widget.Button[contains(@text,'Plan Your Policy')]");
    public static By premiumToPay = AppiumBy.xpath("//android.widget.TextView[@text='₹']/..//android.widget.EditText");
    public static String policyTerm = "//android.widget.Button[@text='<years>']";


}
