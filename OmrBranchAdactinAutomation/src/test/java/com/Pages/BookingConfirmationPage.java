package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class BookingConfirmationPage extends BaseClass {
	
	public String getOrderId() {

		WebElement orderId = driver.findElement(By.id("order_no"));
		    String attribute = orderId.getAttribute("value");
		    return attribute;
		    
		
		
	}

}
