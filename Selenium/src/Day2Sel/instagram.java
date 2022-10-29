package Day2Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\keerthana\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/?hl=en)");
		
		WebElement usernsme = driver.findElement(By.xpath("//input[@name='username']"));
		
		usernsme.sendKeys("Grenns");
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
