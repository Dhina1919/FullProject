package com.Pages;

import org.openqa.selenium.By;

import com.base.BaseClass;

public class BookHotelPage extends BaseClass{
	
	public void bookHotelButtonCommon() {

		driver.findElement(By.id("book_now")).click();
	}
	
    public BookHotelPage(String firstname, String lastName, String billingAddress, String creditCardNo, String CreditCardType, String expiryYear, String expiryMonth, String cvv) {
	
    	driver.findElement(By.id("first_name")).sendKeys(firstname);
		driver.findElement(By.id("last_name")).sendKeys(lastName);
		driver.findElement(By.id("address")).sendKeys(billingAddress);
		driver.findElement(By.id("cc_num")).sendKeys(creditCardNo);
		driver.findElement(By.id("cc_type")).sendKeys(CreditCardType);
		driver.findElement(By.id("cc_exp_month")).sendKeys(expiryMonth);
		driver.findElement(By.id("cc_exp_year")).sendKeys(expiryYear);
		driver.findElement(By.id("cc_cvv")).sendKeys(cvv);
		driver.findElement(By.id("book_now")).click();
		
    }
	public BookHotelPage() {
		bookHotelButtonCommon();
	
	}

}
