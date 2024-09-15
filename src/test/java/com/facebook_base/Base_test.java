package com.facebook_base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.facebook_utilities.TestReader;

public class Base_test {


	public WebDriver driver;

	//String browser = "chrome";

	TestReader tr;

	public WebDriver opneApplication() {
		 tr = new TestReader();
		String browser= tr.readBrowser();
		 
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("we do not support this browser");

		}
		
		String facebookUrl= tr.readUrl();
		driver.get(facebookUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;

	}

	
	public void closeApplication() {
		if (driver !=null)
		driver.quit();
	}


}
