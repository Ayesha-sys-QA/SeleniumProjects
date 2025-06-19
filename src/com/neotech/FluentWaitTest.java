package com.neotech;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.neotech.utils.BrowserSetup;

public class FluentWaitTest extends BrowserSetup  {

		

			public static void main(String[] args) throws InterruptedException  {
			
				
				setUp();
				driver.findElement(By.linkText("Dynamic Controls")).click();
				
				WebElement enablebutton = driver.findElement(By.xpath("//*[@id=\"input-example\"]/button"));
				enablebutton.click();
				
				FluentWait<WebDriver> wait = new FluentWait<WebDriver> (driver);
				
				wait.withTimeout(Duration.ofSeconds(20));
				wait.pollingEvery(Duration.ofSeconds(5));
				wait.ignoring(NoSuchElementException.class);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"input-example\"]/input")));

				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='input-example']/input")));

				WebElement box = driver.findElement(By.xpath("//*[@id='input-example']/input"));
				box.sendKeys("Hello");
				
				Thread.sleep(2000);
				
				String text = box.getAttribute("value");

				if (("Hello").equals(text)) {
				    System.out.println("Test passed");
				} else {
				    System.out.println("Test failed!");
				}
						
				
				tearDown();
				
	}

}
