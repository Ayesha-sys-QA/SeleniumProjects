package com.neotech;

import org.openqa.selenium.By;

import com.neotech.utils.BrowserSetup;

public class OrangeHrmLogin extends BrowserSetup {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * HW1: Orange HRM Application Login:
Open Chrome browser
Go to https://hrm.neotechacademy.com/
Enter valid username and password
Click on login button
Then verify that "span with id account-name" has the text "Jacqueline White".
Quit the browser
		 */
		
		setUp();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Neotech@123");
		driver.findElement(By.xpath("//*[@id=\"divLogin\"]/div[2]/div/form/div[3]/button")).click();
		Thread.sleep(5000);
		String name = driver.findElement(By.id("account-name")).getText();
		
		if (name.equals("Jacqueline White")) {
			System.out.println("login successful, account-name is " + name);
		}
		else {
			System.out.println("Login failed");
		}
		
		tearDown();
		
	}

}
