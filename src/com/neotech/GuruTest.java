package com.neotech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuruTest {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * HW1:
Open chrome browser
Go to "https://demo.guru99.com/test/newtours/"
Click on Register Link
Fill out ALL required info
Click Submit
User successfully registered
(Create the script using different locators)

		 */

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.findElement(By.linkText("REGISTER")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("Aisha");
		driver.findElement(By.name("lastName")).sendKeys("Angel");
		driver.findElement(By.name("phone")).sendKeys("369 369 3693");
		driver.findElement(By.id("userName")).sendKeys("aisha@angel.fr");
		
		
		Thread.sleep(5000);
		driver.findElement(By.name("submit")).click();
		
		driver.quit();
		
		
		
	}

}
