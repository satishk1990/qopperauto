package com.qopper.commonmethods;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.property.GetProperty;

public class BaseMethods {

	public static WebDriver runBrowser() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:/QopperTestingnew/chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(GetProperty.gtProperty("TestUrl"));
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
		
	}
	
	
}
