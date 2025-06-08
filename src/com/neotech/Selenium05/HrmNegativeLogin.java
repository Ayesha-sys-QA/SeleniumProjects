package com.neotech.Selenium05;

import org.openqa.selenium.By;

import com.neotech.BrowserSetup;

public class HrmNegativeLogin extends BrowserSetup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
/*
 * TC 2: Orange HRM Application Negative Login: 
Open Chrome browser
Go to https://hrm.neotechacademy.com/
Enter valid username
Leave password field empty
Verify error message with text "Password cannot be empty" is displayed.
 */
		setUp();
		Thread.sleep(2000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"divLogin\"]/div[2]/div/form/div[3]/button")).click();
		Thread.sleep(5000);
		String message = driver.findElement(By.id("txtPassword-error")).getText();
		if(message.equals("Password cannot be empty")) {
			System.out.println("The test pass --> error message is: " + message);
		}
		else {
			System.out.println("Test failed");
		}
		
		
		tearDown();
		
		
	}

}
