package com.neotech;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BrowserSetup;

public class AmazonList extends BrowserSetup {

	public static void main(String[] args) throws InterruptedException {
		setUp();
		Thread.sleep(10000);

		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));

		Select dept = new Select(dropdown);

		List<WebElement> options = dept.getOptions();

		System.out.println("Number of departments: " + options.size());

		for (WebElement option : options) {
			System.out.print(option.getText() + "/");
		}

		// Select "Computers"
		dept.selectByVisibleText("Computers");

		Thread.sleep(3000);
		
		tearDown();
	}
}
