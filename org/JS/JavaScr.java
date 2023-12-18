package org.JS;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScr {
	
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver =new ChromeDriver();
	driver.get("https://omrbranch.com/");
	driver.manage().window().maximize();
	
	JavascriptExecutor executor=(JavascriptExecutor )driver;
	
	WebElement txtMail = driver.findElement(By.id("email"));
	txtMail.sendKeys("greenstechchennaiomr@gmail.com");
	
	WebElement txtPass = driver.findElement(By.id("pass"));
	txtPass.sendKeys("Automate4$");
	
	
	WebElement btnLog = driver.findElement(By.xpath("//button[@value='login']"));
	btnLog.click();
	Thread.sleep(3000);
	WebElement lnkHot = driver.findElement(By.xpath("//h3[text()='Hotel Booking']"));
	lnkHot.click();
	
	WebElement txtChkin = driver.findElement(By.name("check_in"));
	
	executor.executeScript("arguements[0].SetAttribute('value','2023-10-10')",txtChkin);
	
	
	
	}

}
