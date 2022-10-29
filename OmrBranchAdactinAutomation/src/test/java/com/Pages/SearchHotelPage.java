package com.Pages;

import org.openqa.selenium.By;

import com.base.BaseClass;

public class SearchHotelPage extends BaseClass {
	
	public void searchHotelButton() {
	     driver.findElement(By.id("submit")).click();
	     
		}
		
		public void searchHotelsCommonStep(String location, String noOfRooms, String checkInDate, String checkOutDate, String adultsPerRoom) {

			driver.findElement(By.id("location")).sendKeys(location);
			driver.findElement(By.id("room_nos")).sendKeys(noOfRooms);
			driver.findElement(By.id("datepick_in")).sendKeys(checkInDate);
			driver.findElement(By.id("datepick_out")).sendKeys(checkOutDate);
			driver.findElement(By.id("adult_room")).sendKeys(adultsPerRoom);
			
		}	
		
		public void searchHotels(String location, String noOfRooms, String checkInDate, String checkOutDate, String adultsPerRoom) {
			searchHotelsCommonStep(location,noOfRooms,checkInDate, checkOutDate, adultsPerRoom);
			searchHotelButton();
			
		}
		
		public void searchHotel(String location, String hotels , String roomType, String noOfRooms, String checkInDate, String checkOutDate, String adultsPerRoom , String childrenPerRoom) {
			searchHotelsCommonStep(location,noOfRooms,checkInDate, checkOutDate, adultsPerRoom);
			
			driver.findElement(By.id("hotels")).sendKeys(hotels);
			driver.findElement(By.id("room_type")).sendKeys(roomType);
			driver.findElement(By.id("child_room")).sendKeys(childrenPerRoom);
			}
		
		public void searchHotelCommonPage() {
			searchHotelButton();
	}	
		
	     public SearchHotelPage() {
	
	     
	     }	
		
		
		
		
		
		
		
		
		
		
		
	}
		
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	



		
		
		
		
		
		
		
		
		

