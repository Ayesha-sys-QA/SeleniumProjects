package com.neotech;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AirTicket extends BrowserSetup  {

	public static void main(String[] args) throws InterruptedException {
				
		setUp();
		
		//Enter Origin Airport
		
		WebElement origin = driver.findElement(By.id("reservationFlightSearchForm.originAirport"));
		origin.clear();
		origin.sendKeys("Bordeaux");

		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		WebElement city = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(), 'BOD - Bordeaux Airport, France')]")
			));

		city.click();
				
		// Enter Destination Airport
		
		driver.findElement(By.id("reservationFlightSearchForm.destinationAirport")).sendKeys("Geneva");
		
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement city2 = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(), 'GVA - Geneva Geneve-Cointrin, Switzerland')]"))
		);
        
		city2.click();
		
		Thread.sleep(2000);
		
		// Click on the calendar
		driver.findElement(By.xpath("//button[@class = 'ui-datepicker-trigger']")).click();
		
		//Select the month
		
        String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		
		while(!currentMonth.equals("December"))
		{
			// click next
			driver.findElement(By.xpath("//a[@aria-label='Next Month']")).click();
			
			//update the month 
			currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			
		}
		Thread.sleep(2000);
		
		// select the day
		
			List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
				
				
			for (WebElement day : days)
				{
					String dayNum = day.getText();
					if (dayNum.equals("14"))
					{
						day.click();
						break;
					}
				}
				Thread.sleep(2000);
				
		// Click on the return Date calendar
				
				driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[2]")).click();
				
				String returnMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
					
										
					while(!returnMonth.equals("December"))
					{
						driver.findElement(By.xpath("//a[@aria-label='Next Month']")).click();
						
						returnMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
						
					}
					Thread.sleep(2000);
					
					List<WebElement> returndays = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
							
								
							for (WebElement day : returndays)
							{
								String dayNum = day.getText();
								if (dayNum.equals("22"))
								{
									day.click();
									break;
								}
							}
							Thread.sleep(2000);
							
							
					// Button Search flight
							
						driver.findElement(By.id("flightSearchForm.button.reSubmit")).click();
						Thread.sleep(50000);
						
					// quit the browser
						
				tearDown();
	}
	}


