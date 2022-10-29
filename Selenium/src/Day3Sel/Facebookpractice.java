package Day3Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookpractice {
	
	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\keerthana\\eclip"
			+ "se-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	
	WebDriver driver = new ChromeDriver();
	
  driver.get("https://www.facebook.com/login/");
  
  WebElement username = driver.findElement(By.id("email"));
  username.sendKeys("Greens");
  
  WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
  
 password.sendKeys("1234567");
 
 WebElement login = driver.findElement(By.xpath("//button[@value='1']"));
  
  
  login.click();
  
  
	
	}
	
	

}
