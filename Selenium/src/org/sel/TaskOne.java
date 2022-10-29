package org.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskOne  {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\keerthana\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");

String title = driver.getTitle();
System.out.println(title);

String currenturl = driver.getCurrentUrl();
System.out.println(currenturl);

}
	
}
