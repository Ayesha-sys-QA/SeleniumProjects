package com.neotech;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DeleteOrder extends BrowserSetup {

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		// Login
		
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(ConfigsReader.getProperty("Username"));
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(ConfigsReader.getProperty("Password"));
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		//Locate Customers
		
		String expected = "FamilyAlbum";
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id = 'ctl00_MainContent_orderGrid']/tbody/tr"));
		for (int i =0; i < rows.size(); i++) {
			String rowXpath = "//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[" + (i+1)+ "]";
		    WebElement row = driver.findElement(By.xpath(rowXpath));
		    String rowText = row.getText();
		    
			if (rowText.contains(expected)) {
								
		// check the box
				
			driver.findElement(By.xpath("//table/tbody/tr[" + (i + 1) + "]/td[1]")).click();
			}
			
		}
		// delete checked elements
		
		driver.findElement(By.id("ctl00_MainContent_btnDelete")).click();
		Thread.sleep(2000);
		
		tearDown();
		

	}

}
