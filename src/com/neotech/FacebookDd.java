package com.neotech;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BrowserSetup;

public class FacebookDd extends BrowserSetup {

	public static void main(String[] args) throws InterruptedException  {

/*
 * Facebook dropdown verification
        Open chrome browser

        Go to https://www.facebook.com/r.php

        Verify:

        month dd has 12 month options
        day dd has 31 day options
        year dd has 118 year options

        Select your date of birth	

        Quit browser
 */
      setUp();
      Thread.sleep(5000);
      
      WebElement monthDdElement = driver.findElement(By.id("month"));
      Select monthDd = new Select(monthDdElement);
      List<WebElement> months = monthDd.getOptions();
      Integer sizeM = months.size();
      System.out.println(sizeM);
      if(sizeM == 12) {
    	  System.out.println("Test Size of months Pass");}
      else { System.out.println("Test months failed");}
      //---------------------------------------------------
      WebElement dayDdElement = driver.findElement(By.id("day"));
      Select dayDd = new Select(dayDdElement);
      List<WebElement> days = dayDd.getOptions();
      Integer sizeD = days.size();
      if(sizeD == 31) {
    	  System.out.println("Test days pass");
      }else
    	  {System.out.println("test size days fail!");}
      //----------------------------------------------------------
      
      WebElement yearDdElement = driver.findElement(By.id("year"));
      Select yearDd = new Select(yearDdElement);
      List<WebElement> years = yearDd.getOptions();
      Integer sizeY = years.size();
      if(sizeY == 118) {
    	  System.out.println("Test Years Size Pass");
      }
    	  else {
    		  System.out.println("Year size test failed!");}
     // -------------------------------------------------------------------
      dayDd.selectByValue("2");
      monthDd.selectByIndex(3);
      yearDd.selectByValue("1970");
      
      
      Thread.sleep(2000);
     
      
    	  
    	  
      
      

      

    	  
      
      
      
      tearDown();
      
	}
		
	}


