package com.qopper.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.property.GetProperty;
import com.qopper.commonmethods.BaseMethods;
import com.qopper.commonmethods.CommonActions;
import com.qopper.logging.LogginSystem;
import com.qopper.loginpage.LoginMethods;


public class LoginPage {
WebDriver driver ;
	
@BeforeMethod
public void LounchBrowser() throws InterruptedException, IOException {
	driver=	BaseMethods.runBrowser();
	}

@Test(priority=1)	
public void loginSuccessful() throws InterruptedException, IOException {
	LoginMethods.login("alexa", "qwerty123", driver);
	LogginSystem.debuglogs("Login method executed");
	Assert.assertEquals(CommonActions.getCrntUrl(driver),GetProperty.gtProperty("UrlAfterLogin"));
	}


@Test(priority=2)
public void loginWithWrongPassword() throws InterruptedException, IOException {
	
	LoginMethods.login("Alex", "password", driver);

	Assert.assertEquals(LoginMethods.getPsswrdValidationMsg(driver), GetProperty.gtProperty("ValidationErrorForWrongPassword"));
	
}

@AfterMethod
public void closeBrowser() {
	
	driver.close();
}
}
