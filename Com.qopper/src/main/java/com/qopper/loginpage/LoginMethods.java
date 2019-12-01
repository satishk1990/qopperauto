package com.qopper.loginpage;

import org.openqa.selenium.WebDriver;

import com.qopper.commonmethods.CommonActions;

public class LoginMethods {

	public static void enterUsername(WebDriver driver,String value) {
		
		
		CommonActions.enterValues(driver, PageElement.username, value);
	
	}
	public static void enterPassword(WebDriver driver,String value) {
		
		CommonActions.enterValues(driver, PageElement.password, value);
	}
    public static void clickOnLoginBtn(WebDriver driver) {
    	CommonActions.clickOnElement(driver, PageElement.loginbtm);

    }
}

