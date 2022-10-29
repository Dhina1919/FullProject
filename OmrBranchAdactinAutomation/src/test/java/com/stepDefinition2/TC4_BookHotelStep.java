package com.stepDefinition2;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC4_BookHotelStep {

	@Then("User should book a hotel {string},{string} and {string}")
	public void user_should_book_a_hotel_and(String string, String string2, String string3, io.cucumber.datatable.DataTable dataTable) {
	}
	@Then("User should verify after booking success message {string}")
	public void user_should_verify_after_booking_success_message(String string) {
	}
	

	@When("User should perform login {string}, {string}")
	public void user_should_perform_login(String string, String string2) {
	}
	@Then("User should verify the login success message {string}")
	public void user_should_verify_the_login_success_message(String string) {
	}
	@Then("User should search hotel {string}, {string},{string},{string},{string},{string} and {string}")
	public void user_should_search_hotel_and(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
	}
	@Then("User should verify after search hotel success message {string}")
	public void user_should_verify_after_search_hotel_success_message(String string) {
	}
	@Then("User should click book now without entering any fields")
	public void user_should_click_book_now_without_entering_any_fields() {
	}
	@Then("User should verify without enter any fields while booking error message {string}, {string}, {string}, {string}, {string}, {string}, {string}")
	public void user_should_verify_without_enter_any_fields_while_booking_error_message(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
	}







}
