package com.neotech;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BrowserSetup;

public class WebDriverWaitTest extends BrowserSetup  {

	public static void main(String[] args) throws InterruptedException {


		setUp();
		driver.findElement(By.linkText("Dynamic Controls")).click();

		WebElement Enable = driver.findElement(By.xpath("//*[@id=\"input-example\"]/button"));
		Enable.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"input-example\"]/input")));

		WebElement box = driver.findElement(By.xpath("//*[@id=\"input-example\"]/input"));
		box.sendKeys("Hello");

		String text = box.getAttribute("value");

		if (("Hello").equals(text)) {
		    System.out.println("Test passed");
		} else {
		    System.out.println("Test failed!");
		}


		tearDown();


	}

}
