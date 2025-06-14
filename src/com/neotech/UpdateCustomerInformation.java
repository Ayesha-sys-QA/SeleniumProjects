package com.neotech;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UpdateCustomerInformation extends BrowserSetup {

	public static void main(String[] args) {
	
		setUp();
		
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(ConfigsReader.getProperty("Username"));
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(ConfigsReader.getProperty("Password"));
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		//Locate Customer
		
		String expected = "Susan McLaren";
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id = 'ctl00_MainContent_orderGrid']/tbody/tr"));
		for (int i =0; i < rows.size(); i++) {
			String rowXpath = "//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[" + (i+1)+ "]";
		    WebElement row = driver.findElement(By.xpath(rowXpath));
		    String rowText = row.getText();
		    
			if (rowText.contains(expected)) {
				System.out.println("Customer Susan present");
				
			//Customers details
				
			driver.findElement(By.xpath("//table/tbody/tr[" + (i + 1) + "]/td[13]")).click();
			
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("aspnetForm")));
			
			// Update
			
			driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton")).click();
							}
				
	}
		tearDown();
	}
		
	}


