package org.ddBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDn {
	
	public static void main(String[] args) {
		
		
	WebDriver driver =new ChromeDriver();	
	driver.get("https://omrbranch.com/apitestingtraininginchennaiomr");
		driver.manage().window().maximize();
	
	
	WebElement ddnCountry = driver.findElement(By.id("country-list"));
	
	Select select =new Select(ddnCountry);
	select.selectByIndex(15);
	
	List<WebElement> options = select.getOptions();
	for (int i = 0; i < options.size(); i++) {
		WebElement element = options.get(i);
		String text = element.getText();
		System.out.println(text);
		
		String attribute = element.getAttribute("value");
		
	System.out.println(attribute);
	}		
	
	
	for (WebElement element: options) {
		String text = element.getText();
		System.out.println(text);
	}
		driver.close();		
	}
	}


