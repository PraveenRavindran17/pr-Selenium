package Sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class org1 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
	    driver.get( "https://www.amazon.in/");
	   driver.manage().window().maximize();
	
	  
	  WebElement entLog = driver.findElement(By.id("nav-link-accountList"));
	 
	  
	  
	  Actions actions=new Actions(driver);
	  actions.moveToElement(entLog).perform();
	 
	WebElement entStart = driver.findElement(By.xpath("//a[@class='nav-a'][1]"));
	  entStart.click();
	  
	  
	  WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Conditions')]"));
	  String text = element.getText();
	  System.out.println(text);
	   
		
	}
	
	

   

}
