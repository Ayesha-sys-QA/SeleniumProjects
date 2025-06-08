package com.neotech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonTest {
	public static void main(String[] args) throws InterruptedException {
		/*

	HW1: Amazon Page Title Verification: 
Open chrome browser
Go to “https://www.amazon.com/”
Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed
End the Session (close the browser).	
		
		

		 */
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		Thread.sleep(8000);
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
		
	}

}
