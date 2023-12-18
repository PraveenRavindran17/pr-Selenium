package org.Fl;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flip {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement txtBox = driver.findElement(By.xpath("//input[@name='q']"));
		txtBox.sendKeys("iphone13",Keys.ENTER);
		driver.close();
		
		
		
		
		
		
		
		
	}

}
