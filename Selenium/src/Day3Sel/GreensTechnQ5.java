package Day3Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechnQ5 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\keerthana\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement interview = driver.findElement(By.xpath("//div[@class = 'card-header1 d-flex align-items-center justify-content-between collapsed']"));
		
		interview.click();
		
		WebElement ctsquestion = driver.findElement(By.xpath("(//a[@title='Interview Questions'])[6]"));
		
		ctsquestion.click();
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
