package DragandDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoGuru {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\keerthana\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement s = driver.findElement(By.xpath("//li[@id='credit2']"));
		WebElement d = driver.findElement(By.xpath("o1[@id='bank']"));
		
		Actions actions = new Actions(driver);
		
		actions.dragAndDrop(s,d).perform();
		
		WebElement s2 = driver.findElement(By.xpath("(//li[@id='fourth'])[2]"));
		WebDriver d1 = (WebDriver) driver.findElement(By.xpath("//o1[@id='amt7']"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
