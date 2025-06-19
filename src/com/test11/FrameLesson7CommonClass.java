package com.test11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class FrameLesson7CommonClass extends CommonMethods  {

    public static void main(String[] args) {

        setUp();

        WebElement header = waitForVisibility(By.xpath("//span[text()='Not a Friendly Topic']"));
        if (header.isDisplayed()) {
            System.out.println("Header matched");
        } else {
            System.out.println("Header NOT matched or not visible");
        }

        switchToFrame(0); 
        
        switchToFrame("child-frame"); 

        WebElement element = waitForVisibility(By.id("inner-frame-check-box"));
        click(element);

        driver.switchTo().defaultContent();

        switchToFrame("animals");

        WebElement animal = waitForVisibility(By.id("animal-select"));
        selectDropdown(animal, "Dog");
        wait(2);
        

        tearDown();
    }
}
