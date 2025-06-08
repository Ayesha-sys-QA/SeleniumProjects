package com.neotech;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class AlertText extends BrowserSetup {

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']\r\n")).click();
		
		driver.findElement(By.xpath("//span[text()='Alerts']")).click();
		driver.findElement(By.id("alertButton")).click();
		
		Alert alertbox = driver.switchTo().alert();
		String AlertText= alertbox.getText();
		if (AlertText.equals("You clicked a button")) {
			System.out.println("Alert Message is: " + AlertText + "--> Test Pass");
		}
		else
			System.out.println("Test Fail");
		
		alertbox.accept();
		driver.findElement(By.id("confirmButton")).click();
		Alert alertbox2 = driver.switchTo().alert();
		String AlertText2= alertbox2.getText();
		if (AlertText2.equals("Do you confirm action?")) {
			System.out.println("Test Pass--> Alert message = " + AlertText2);
				}
		else
			System.out.println("Test fail");
		
		alertbox2.accept();
		
		driver.findElement(By.id("promtButton")).click();
		Alert alertbox3 = driver.switchTo().alert();
		alertbox3.sendKeys("Aicha Moustatia");
		alertbox3.accept();
		
		Thread.sleep(5000);
		tearDown();
		
	}

}
