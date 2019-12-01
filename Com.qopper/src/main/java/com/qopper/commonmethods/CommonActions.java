package com.qopper.commonmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonActions {

	
	public static void clickOnElement(WebDriver driver,By element) {
		driver.findElement(element).click();
		
}
	
	public static void enterValues(WebDriver driver, By element,String value) {
		
		driver.findElement(element).sendKeys(value);
	}
	
	
}
