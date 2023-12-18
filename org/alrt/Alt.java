package org.alrt;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alt {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://omrbranch.com/softwaretestingtraininginchennaiomr");
		driver.manage().window().maximize();
		WebElement btnEnter = driver.findElement(By.xpath("//button[text()='Right click to enter past date']"));
		
		Actions actions =new Actions(driver);
		actions.contextClick(btnEnter).perform();
		
	    Alert al = driver.switchTo().alert();
	    al.sendKeys("Naveen");
	    al.accept();
	    
	    
		
		
		
		
		
		
	}

}
