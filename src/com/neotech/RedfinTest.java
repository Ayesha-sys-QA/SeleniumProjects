package com.neotech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RedfinTest {
	public static void main(String[] args) throws InterruptedException {
		/*
		 * HW2: Opening Page on Firefox Browser
Open Firefox browser
Navigate to “https://www.redfin.com/”
Verify that you have navigated to (https://www.redfin.com/)
End the Session (close the browser).
		 */
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.redfin.com/");
		Thread.sleep(5000);
		String currenturl = driver.getCurrentUrl();
		if (currenturl.startsWith("https://www.redfin.com")) {
		    System.out.println("URL is valid: " + currenturl);
		} else {
		    System.out.println("Unexpected URL: " + currenturl);
		}
		
		driver.close();
			
			
		}
		
		
	

}
