package DragandDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	private static WebElement more;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\keerthana\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		WebElement close = driver.findElement(By.xpath("//div[@class='exehdJ']"));
		Actions actions = new Actions(driver);
	
		
		actions.moveToElement(more).perform();
		
		WebElement customercare = driver.findElement(By.xpath("(//div[@class='_3vhnxt'))[2]"));
		
		customercare.click();
		
		WebElement text = driver.findElement(By.xpath("(//span[@class='hDTmm5'])[1]"));
		
		String text2 = text.getText();
		
		System.out.print(text2);
				
		
				
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
