package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ICICQ4 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\keerthana\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		
		WebElement username = driver.findElement
				(By.xpath("//input[@class='login-input mode-select-userid']"));
		
		username.sendKeys("account");
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
