package com.qopper.commonmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseMethods {

	public static WebDriver runBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:/QopperTestingnew/chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://staging.qopper.com");
	Thread.sleep(1000);
		return driver;
		
	}
	
	
}
