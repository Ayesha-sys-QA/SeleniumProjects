package com.neotech;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HrmEmployee extends BrowserSetup {

	public static void main(String[] args) throws InterruptedException  {
		
		setUp();
		
		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
		driver.findElement(By.tagName("button")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.xpath("//*[@id='menu_pim_addEmployee']/span[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("first-name-box")).sendKeys("Aicha");
		driver.findElement(By.id("last-name-box")).sendKeys("Moustatia");

		WebElement input = driver.findElement(By.id("employeeId"));
		input.clear();
		input.sendKeys("2112");

		driver.findElement(By.xpath("//button[@data-id='location']")).click();

		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='France Regional HQ']")));
		button.click();
		
		Thread.sleep(5000);
		// Cliquer sur le bouton Save 
		WebElement saveButton = driver.findElement(By.id("modal-save-button"));
		saveButton.click();
		

		// Attendre que la fenêtre se ferme
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait3.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.modal.show")));

		
		WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement userDropdown = wait4.until(ExpectedConditions.elementToBeClickable(By.id("user-dropdown")));
		userDropdown.click();
		
		driver.findElement(By.id("logoutLink")).click();
System.out.println("test passed");
		
		tearDown();
	}
}
