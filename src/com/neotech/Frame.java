package com.neotech;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import com.neotech.utils.BrowserSetup;

public class Frame extends BrowserSetup {

    public static void main(String[] args) throws InterruptedException {

        setUp();

        String headerText = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
        if (headerText.equals("Not a Friendly Topic")) {
            System.out.println("Header verified!");
        } else {
            System.out.println("Header not matched!");
        }
//-----------------------------------------------------------------
        driver.switchTo().frame(0);
        Thread.sleep(1000); 
      
        driver.switchTo().frame("child-frame");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        
        driver.switchTo().defaultContent();
//--------------------------------------------------------------------------
       
        driver.switchTo().frame("animals");

        WebElement dropdown = driver.findElement(By.id("animal-select"));
        dropdown.click();
        dropdown.findElement(By.xpath("//option[text()='Dog']")).click();
        Thread.sleep(5000);
//----------------------------------------------------------------------------
        tearDown();
    }
}
