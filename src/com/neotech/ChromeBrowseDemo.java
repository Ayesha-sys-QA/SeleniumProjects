package com.neotech;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowseDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.neotechacademy.com/");
		Thread.sleep(5000);
		driver.quit();
		
		
		

	}
}

