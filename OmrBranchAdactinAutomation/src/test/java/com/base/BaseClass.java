package com.base;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.beust.jcommander.StringKey;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author keerthana
 *@Description maintains all reusable methods
 *@Date16-OCT-22
 *
 */

public class BaseClass {
	
		public static WebDriver driver;
		
		

			public static String getProjectPath() {
				
			String path	=System.getProperty("user.dir");
			return path;
			
			
			}
			//Browser
			
			public static void getDriver(String browserType) {
				
				switch (browserType) {
				
				
				case "chrome":
					
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();
				case "firefox":
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
					
				case "ie":
					WebDriverManager.iedriver().setup();
					driver = new InternetExplorerDriver();
					
				case "edge":
					WebDriverManager.edgedriver().setup();
					driver = new EdgeDriver();
					
					
					break;

				default:
					break;
				}
				
					
			}
			
		//Get property file	
			public String getPropertyFileValue(String key) throws FileNotFoundException, IOException {

				Properties properties = new Properties();
				properties.load(new FileInputStream("C:\\\\Users\\\\hp\\\\eclipse-workspace\\\\OMRBranchAdactinAutomation\\\\Config\\\\config.properties"));
				
				String value = (String)properties.get(key);
				return value;
			}
		

		private String url;

		
		
		public static void getDriver() {// 1
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		public static void enterURL(String url) {// 2
			driver.get(url);
		}

		public static void maximizewindow() {// 3
			driver.manage().window().maximize();
		}

		public void elementSendkeys(WebElement element, String data) {// 4
			element.sendKeys(data);
		}

		public void elementSendkeysJS(WebElement element, String data) {// 5
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('value'," + data + ")", element);
		}

		/**
		 * @Description method for click
		 * @param element
		 * @Date 16-oct-22
		 */
		
		public void elementClick(WebElement element) {// 6
			element.click();
		}

		/**
		 * @Description method for get the Text
		 * @param element
		 * @return String
		 * @Date 16-oct-22
		 */
		
		public String getText(WebElement element) {// 7
			String text = element.getText();
			return text;
		}
		/**
		 * @Description method for find locator by ID
		 * @param attributevalue
		 * @return element
		 * @Date 16-oct-22
		 */
		

		public WebElement findLocatorById(String attributevalue) {// 8
			WebElement element = driver.findElement(By.id(attributevalue));
			return element;
		}
		
		/**
		 * @Description method for findLocatorByName
		 * @param attributevalue
		 * @return element
		 * Date 16-oct-22
		 */

		public WebElement findLocatorByName(String attributevalue) {// 9
			WebElement element = driver.findElement(By.name(attributevalue));
			return element;
		}

		/**
		 * @Description method for findLocatorByclassName
		 * @param attributevalue
		 * @return element
		 * @Date 16-oct-22
		 */
		public WebElement findLocatorByclassName(String attributevalue) {// 10
			WebElement element = driver.findElement(By.className(attributevalue));
			return element;
		}
		
		/**
		 * @Description method for findLocatorByXpath
		 * @param xpath
		 * @return element
		 * @Date 16-oct-22
		 */

		public WebElement findLocatorByXpath(String xpath) {// 10
			WebElement element = driver.findElement(By.xpath(xpath));
			return element;
		}
		/**
		 * @Description method for window closed
		 * @Date 16-0ct-22
		 */
		
		public void windowclosed() {// 11
			driver.close();
		}

		/**
		 * @Description method for quit
		 * @Date 16-oct-22
		 */
		public static void quit() {// 12
			driver.quit();
		}
		
		/**
		 * @Description method for getTitle
		 * @return title
		 * @Date 16-oct-22
		 */

		public String getTitle() {// 13
			String title = driver.getTitle();
			return title;
			
		}
		/**
		 *@Description method for getCurrentUrl
		 *@return url
		 *@Date 16-oct-22
		 */

		public String getCurrentUrl() {// 14
			String url = driver.getCurrentUrl();
			return url;
			
			
		}

		/**
		 *@Description method for elementGetAttributeValue
		 *@param id
		 *@return attribute1
		 *@Date -oct-22
		 */
		
		public String elementGetAttributeValue(String id) {// 15
			WebElement element = driver.findElement(By.id(id));
			String attribute1 = element.getAttribute("value");
			return attribute1;
		}

		/**
		 * Description method for elementGetAttributeValue
		 * @param element
		 * @return attribute
		 * Date 16-10-22
		 */
		public String elementGetAttributeValue(WebElement element) {// 15
			// WebElement element = driver.findElement(By.id(id));
			String attribute = element.getAttribute("value");
			return attribute;
		}

		public String elementGetAttributeValue(WebElement element, String attributeName) {// 16
			String attribute = element.getAttribute(attributeName);
			return attribute;
		}

		public void selectByText(WebElement element, String text) {// 17
			Select s = new Select(element);
			s.selectByVisibleText(text);
		}

		public void selectByvalue(WebElement element, String value) {// 18
			Select s = new Select(element);
			s.selectByValue(value);
		}

		public void selectByIndex(WebElement element, int index) {// 19
			Select s = new Select(element);
			s.selectByIndex(index);
		}

		public List<WebElement> getOptions(WebElement element) {// 20
			Select s = new Select(element);
			List<WebElement> options = s.getOptions();
			return options;
		}

		public List<WebElement> getAllSelectedOptions(WebElement element) {// 21
			Select s = new Select(element);
			List<WebElement> options = s.getAllSelectedOptions();
			return options;
		}

		public WebElement getFirstSelectedOption(WebElement element) {// 22
			Select s = new Select(element);
			WebElement firstSelectedOption = s.getFirstSelectedOption();
			return firstSelectedOption;
		}

		public void deSelectAll(WebElement element) {// 23
			Select s = new Select(element);
			s.deselectAll();
		}

		public void deSelectBtIndex(WebElement element, int index) {// 24
			Select s = new Select(element);
			s.deselectByIndex(index);
		}

		public void deSelectByVisibleText(WebElement element, String text) {// 25
			Select s = new Select(element);
			s.deselectByVisibleText(text);
		}

		public void deSelectByValue(WebElement element, String value) {// 26
			Select s = new Select(element);
			s.deselectByValue(value);
		}

		public boolean ismultiple(WebElement element) {// 27
			Select s = new Select(element);
			boolean multiple = s.isMultiple();
			return multiple;
		}

		public void switchWindowByid(String id) {// 28
			driver.switchTo().window(id);
		}

		public void switchWindowByTittle(String tittle) {// 29
			driver.switchTo().window(tittle);
		}

		public void switchWindowByUrl(String url) {// 30
			driver.switchTo().window(url);
		}

		public String getwindowHandle() {// 31
			String windowHandle = driver.getWindowHandle();
			return windowHandle;
		}

		public Set<String> getwindowHandles() {// 32
			Set<String> windowHandles = driver.getWindowHandles();
			return windowHandles;
		}

		public int getSize(WebElement element) {// 33
			Select s = new Select(element);
			List<WebElement> options = s.getOptions();
			int size = options.size();
			return size;
		}

		public void accept() {// 34
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}

		public void dismiss() {// 35
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		}

		public void sendKeysToiInsertValue(String data) {// 36
			Alert alert = driver.switchTo().alert();
			alert.sendKeys(data);
		}

		public void switchFrameById(String id) {// 37
			driver.switchTo().frame(id);
		}

		public void switchFrameByName(String name) {// 38
			driver.switchTo().frame(name);
		}

		public void switchFrameByIndex(int index) {// 39
			driver.switchTo().frame(index);
		}

		public void switchFrameByelement(String id) {// 40
			WebElement element = driver.findElement(By.id(id));
			driver.switchTo().frame(element);
		}

		public int frameCount(String tagName) {// 41
			List<WebElement> elements = driver.findElements(By.tagName("tagName"));
			int size = elements.size();
			return size;
		}

		public void getAttributeUsingJs(String attributename, WebElement element) {// 42
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("return arguments[0].getAttreibute(attributename)", element);
		}

		public void scrollUp(WebElement element) {// 43
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(false)", element);
		}

		public void scrollDown(WebElement element) {// 44
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true)", element);
		}

		
		public void clickUsingJs(WebElement element) {// 45
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", element);
		}

		public void moveToElement(WebElement element) {// 46
			Actions actions = new Actions(driver);
			actions.moveToElement(element).perform();
		}

		public void dragAndDrop(WebElement source, WebElement dest) {// 47
			Actions actions = new Actions(driver);
			actions.dragAndDrop(source, dest).perform();
		}

		public void rightClick(WebElement element) {// 48
			Actions actions = new Actions(driver);
			actions.contextClick(element).perform();
		}

		public void DoubleClick(WebElement element) {// 49
			Actions actions = new Actions(driver);
			actions.doubleClick(element).perform();
		}

		public String readValueFromExcel(String sheetName, int rownum, int cellnum) throws IOException {
			String res = "";
			File file = new File(
					"C:\\Users\\keerthana\\eclipse-workspace\\MavenClass\\Excel Sheet\\Maven Excel Worksheet.xlsx");
			FileInputStream stream = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(stream);
			Sheet sheet = workbook.getSheet("dinesh");
			Row row = sheet.getRow(rownum);
			Cell cell = row.getCell(cellnum);
			CellType cellType = cell.getCellType();
			switch (cellType) {
			case STRING:
				res = cell.getStringCellValue();

				break;
			case NUMERIC:
				if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat dateformat = new SimpleDateFormat("dd/MMM/yy");
					res = dateformat.format(dateCellValue);
				} else {

					double numericcellvalue = cell.getNumericCellValue();
					long check = Math.round(numericcellvalue);
					if (check == numericcellvalue) {
						res = String.valueOf(check);

					} else {
						res = String.valueOf(numericcellvalue);

					}
				}

			default:
				break;
			}
			return res;
		}

		public String WriteDataIncell(String sheetname, int rownum, int cellnum, String data) throws IOException {
			File file = new File(
					"C:\\Users\\keerthana\\eclipse-workspace\\MavenClass\\Excel Sheet\\Maven Excel Worksheet.xlsx");
			FileInputStream stream = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(stream);
			Sheet sheet = workbook.getSheet("dhina");
			Row row = sheet.getRow(rownum);
			Cell cell = row.createCell(cellnum);
			cell.setCellValue(data);
			FileOutputStream out = new FileOutputStream(file);
			workbook.write(out);
			return data;
		}

		public File takeScreenshot() throws IOException {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
			File file = new File("sample.png");
			FileUtils.copyFile(screenshotAs, file);
			return screenshotAs;
		}

		public static void main(String[] args) {

		}

	}


