package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Face {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txtBox = driver.findElement(By.name("email"));
		 Actions actions =new Actions(driver);
		 actions.keyDown(Keys.SHIFT).sendKeys("praveen").keyUp(Keys.SHIFT).perform();
		
	}

}
