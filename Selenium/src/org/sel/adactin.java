package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class adactin {
	public static void main(String[] args) {
		
		System.setProperty("WebDriver.driver.ChromeDriver","C:\\Users\\keerthana\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
		WebElement login = driver.findElement(By.id("email"));
		login.sendKeys("Tech");
		

		
		
		
		
	}

}
