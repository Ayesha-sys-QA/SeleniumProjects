package com.neotech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		/*
		
 */
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
		driver.findElement(By.name("firstname")).sendKeys("test");
		driver.findElement(By.name("lastname")).sendKeys("code");
		driver.findElement(By.name("reg_email__")).sendKeys("test@code.fr");
		driver.findElement(By.name("reg_passwd__")).sendKeys("test@code.fr");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(8000);
		driver.quit();
		
	}

}
