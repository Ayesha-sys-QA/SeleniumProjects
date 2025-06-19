package com.test11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class WindowLesson11CommonM extends CommonMethods 
{

	public static void main(String[] args) {
		
		setUp();
		
		WebElement element = waitForVisibility(By.linkText("Click Here"));
		click(element);
		
		switchToChildWindow();
		
		WebElement email = waitForVisibility(By.id("emailid"));
		sendText(email, "aicha@gmail.com");
		
		WebElement submit = waitForVisibility(By.xpath("//button[text()='Submit']"));
		click(submit);
		
		 wait(2); 
		 
	     driver.close(); // close the child window

	     switchToMainWindow(); // I ve added this to Common Methods to go back to main window
		
				
		tearDown();

	}

}
