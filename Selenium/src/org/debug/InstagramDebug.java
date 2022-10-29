package org.debug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramDebug {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\keerthana\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com/accounts/login/");
		
		Thread.sleep(3000);
		
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		
		username.sendKeys("greens Tech");
	
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
