package com.qopper.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qopper.commonmethods.BaseMethods;
import com.qopper.loginpage.LoginMethods;


public class LoginPage {
WebDriver driver ;
	
@BeforeMethod
public void LounchBrowser() throws InterruptedException {
	driver=	BaseMethods.runBrowser();
	}
@Test	
public void loginSuccessful() {
	LoginMethods.enterUsername(driver, "alexa");
	LoginMethods.enterPassword(driver, "qwerty123");
	LoginMethods.clickOnLoginBtn(driver);
	}

public void closeBrowser() {
	
	driver.close();
}
}
