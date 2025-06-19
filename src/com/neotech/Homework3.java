package com.neotech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BrowserSetup;

public class Homework3 extends BrowserSetup {

	public static void main(String[] args) throws InterruptedException {
		
		
		setUp();
		
		  WebElement multipleDropdown = driver.findElement(By.xpath("(//div[@class='ui fluid multiple selection dropdown'])[1]"));
	        multipleDropdown.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='item' and text()='CSS']")).click();

		
		Thread.sleep(1000); 
		
		 driver.findElement(By.xpath("//div[@class='menu transition visible']/div[text()='HTML']")).click();
	        Thread.sleep(1000);

	      
	        WebElement selected = driver.findElement(By.xpath("//div[@class='ui fluid multiple selection dropdown']/a[text()='CSS']"));
	        if (selected.isDisplayed()) {
	            System.out.println("CSS is selected.");
	        }

	        
	        WebElement removeHtml = driver.findElement(By.xpath("//a[text()='HTML']/i"));
	        removeHtml.click();
	        Thread.sleep(1000);

	        driver.quit();
	   
		
	        
	      tearDown();
	      
	}
}
