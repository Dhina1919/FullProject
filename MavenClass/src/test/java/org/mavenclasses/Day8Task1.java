package org.mavenclasses;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day8Task1 {
	
	static WebDriver driver;
	
	@BeforeClass
	 
	public static void beforeClass() {
		 WebDriverManager.chromedriver().setup();
		 
		 driver = new ChromeDriver();
		 driver.get("http://adactinhotelapp.com/");
		 
		 driver.manage().window().maximize();
		
	}
	
	@AfterClass
	
	public static void afterClass() {
		
		driver.quit();
		
		
	}
	
	@Before
	
	public void beforeMethod() {
		
		long time = System.currentTimeMillis();
		
		System.out.println(time);
	
	}
	
	@Test
	
	public void Login() {
		
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys("dhinakaran@019@gamil.com");
		
		WebElement txtpassword = driver.findElement(By.id("p"
				+ ""
				+ "assword"));
		txtpassword.sendKeys("123344556");
		
		WebElement btnlogin = driver.findElement(By.name("login"));
		btnlogin.click();	
		
	}
	
	@After
	
	public void Aftermethod() {
		
		long time = System.currentTimeMillis();
		
		System.out.println(time);
		
		

	}
	
	
		
	
	
	                                        
	
	       
	
	
	
	
	
	
	
	
	
	}
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
					


