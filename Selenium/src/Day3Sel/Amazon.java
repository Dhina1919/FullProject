package Day3Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\keerthana\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement enter = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		enter.sendKeys("Iphone");
		
	
		WebElement search = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		
		search.click();
		
		
		
	}

}
