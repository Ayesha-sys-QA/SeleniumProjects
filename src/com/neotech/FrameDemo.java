package com.neotech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FrameDemo extends BrowserSetup {

	public static void main(String[] args) throws InterruptedException {
		
setUp();
Thread.sleep(3000);
// first way to locate a frame by index
driver.switchTo().frame(0);

WebElement age = driver.findElement(By.id("age"));

age.sendKeys("54");

Thread.sleep(3000);

driver.switchTo().defaultContent();

Thread.sleep(3000);
// second way to locate a frame by webelemnt

WebElement frameEl = driver.findElement(By.tagName("iframe"));

driver.switchTo().frame(frameEl);

age.clear();
Thread.sleep(3000);
age.sendKeys("34");
Thread.sleep(3000);
tearDown();

	}

}
