package com.Pages;

import org.openqa.selenium.By;

import com.base.BaseClass;

public class SelectHotelPage extends BaseClass{
	
	public void selectHotelCommonStep() {
		driver.findElement(By.id("continue")).click();
		
	}

	public void selectHotel() {
    driver.findElement(By.id("radiobutton_0")).click();
    selectHotelCommonStep();
	}
	
	public void clickContinue() {
		selectHotelCommonStep();
		
}

}
