 package org;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {
public static void main(String[] args) throws InterruptedException  {
	
	WebDriver driver = new ChromeDriver();
	
    driver.get( "https://www.amazon.in/");
   driver.manage().window().maximize();
   Thread.sleep(3000);
  
  WebElement entLog = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
 
  
  
  Actions actions=new Actions(driver);
  actions.moveToElement(entLog).perform();
  Thread.sleep(3000);
WebElement entStart = driver.findElement(By.xpath("//a[@class='nav-a'][1]"));
  actions.moveToElement(entStart).perform();
  
  Thread.sleep(500);
  WebElement element = driver.findElement(By.xpath("//a[@class='a-link-normal'][2]"));
  String text = element.getText();
  System.out.println(text);
   
  
  
   
   

  

   
   
 	    
}
}





