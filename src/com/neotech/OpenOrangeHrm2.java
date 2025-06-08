package com.neotech;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.neotech.ConfigsReader;
import com.neotech.Constants;

public class OpenOrangeHrm2 {

	public static void main(String[] args) throws InterruptedException {
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
		String browser = ConfigsReader.getProperty("browser");
		System.out.println(browser);

		WebDriver driver = null;
		switch (browser.toLowerCase()) {
		case "chrome": {
			driver = new ChromeDriver();
			break;
		}
		case "firefox": {
			driver = new FirefoxDriver();
			break;
		}
		default:
			break;
		}

		// now testing code starts
		String url = ConfigsReader.getProperty("url");
		driver.get(url);

		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.quit();
	}

}


