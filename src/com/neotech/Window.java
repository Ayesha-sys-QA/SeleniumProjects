package com.neotech;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
public class Window extends BrowserSetup {

	public static void main(String[] args) throws InterruptedException   {
		/*
		 * Launch the browser and open the site "https://neotech.vercel.app/email"
2) Click on link "Click Here". When the user clicks on the "Click Here" link, new child window opens.
3) On the Child Window, Enter your email ID and submit.
4) Then Access Credentials will be Displayed on submitted page. You will see the child window is open in new tab.
5) Close the Child window on which credentials are displayed. Switch to the parent window.
6) Quit all browsers
		 */
setUp();
Thread.sleep(2000);

// Store the parent window 
String parentWindow = driver.getWindowHandle();

// Click the "Click Here" link
driver.findElement(By.linkText("Click Here")).click();

// 5. Switch to the new window
Set<String> allWindows = driver.getWindowHandles();
for (String window : allWindows) {
    if (!window.equals(parentWindow)) {
        driver.switchTo().window(window);
        break;
    }
}

// 6. Wait and enter email
Thread.sleep(1000);
driver.findElement(By.id("emailid")).sendKeys("aicha@example.com");
Thread.sleep(2000);

// 7. Submit the email
driver.findElement(By.xpath("//button[text()='Submit']")).click();

// 8. Wait and close the child window
Thread.sleep(2000);
driver.close();

// 9. Switch back to the parent window
driver.switchTo().window(parentWindow);

// 10. Quit all
driver.quit();

tearDown();

	}

}
