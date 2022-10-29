package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutomation {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\keerthana\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		WebElement btnsign = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		
		btnsign.click();
		
		WebElement btnclick = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		btnclick.click();
		
		Alert al = driver.switchTo().alert();
		
		al.sendKeys("Dhina");
		al.accept();
		
  WebElement text = driver.findElement(By.id("demo1"));		
		
	String t = text.getText();
	
	System.out.println(t);
		

		  
		
		
		
		
		
		
		
		
	}

	
	
	
}
