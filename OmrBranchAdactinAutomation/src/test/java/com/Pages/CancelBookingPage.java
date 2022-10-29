package com.Pages;

import org.openqa.selenium.By;

import com.base.BaseClass;

public class CancelBookingPage extends BaseClass {
	
	public void cancelOrderId(String orderId) {

		driver.findElement(By.id("my_itinerary")).click();
		driver.findElement(By.id("order_id_text")).sendKeys(orderId);
		driver.findElement(By.xpath("//input[contains(@id,'btn_id_)]")).click();
		driver.switchTo().alert().accept();

}
	
}