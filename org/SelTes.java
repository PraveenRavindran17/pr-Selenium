package org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelTes {
	public static void main(String[] args)  {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://omrbranch.com/softwaretestingtraininginchennaiomr");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//button[text()='Double click to see future date']"));
		
		Actions actions =new Actions(driver);
		actions.doubleClick(element).perform();
		driver.quit();
	}

}
