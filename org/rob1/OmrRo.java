package org.rob1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmrRo {
	public static void main(String[] args) throws AWTException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();
		WebElement txtBox = driver.findElement(By.id("email"));
		txtBox.click();
		
		Robot robot=new Robot();
		 robot.keyPress(KeyEvent.VK_P);
		 robot.keyRelease(KeyEvent.VK_P);
		 
		 robot.keyPress(KeyEvent.VK_R);
		 robot.keyRelease(KeyEvent.VK_R);

		 robot.keyPress(KeyEvent.VK_A);
		 robot.keyRelease(KeyEvent.VK_A);
		 robot.keyPress(KeyEvent.VK_SHIFT);
		 
		 robot.keyPress(KeyEvent.VK_2);
		 robot.keyRelease(KeyEvent.VK_2);
		 robot.keyRelease(KeyEvent.VK_SHIFT);
		
		 robot.keyPress(KeyEvent.VK_2);
		 robot.keyRelease(KeyEvent.VK_2);
		 
		 robot.keyPress(KeyEvent.VK_TAB);
		 robot.keyRelease(KeyEvent.VK_TAB);
		 
		 robot.keyPress(KeyEvent.VK_SHIFT);
		
		 robot.keyPress(KeyEvent.VK_E);
		 robot.keyRelease(KeyEvent.VK_E);
		
		 robot.keyPress(KeyEvent.VK_E);
		 robot.keyRelease(KeyEvent.VK_E);
		 
		 robot.keyPress(KeyEvent.VK_N);
		 robot.keyRelease(KeyEvent.VK_N);
		  
		 
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		 
		 
		
		 
		 
		 
	}

}
