package com.qopper.commonmethods;

import java.sql.Driver;

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
	
	public static String getCrntUrl(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		
		return driver.getCurrentUrl();
		
		}
	public static String getText(WebDriver driver, By element) {
		return driver.findElement(element).getText();
		
		
	}
}
