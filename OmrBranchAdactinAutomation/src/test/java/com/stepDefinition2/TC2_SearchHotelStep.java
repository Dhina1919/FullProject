package com.stepDefinition2;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC2_SearchHotelStep {
	

	@Given("User is on the Adactin Page")
	public void user_is_on_the_adactin_page() {
	}
	@When("User should perform login {string} and {string}")
	public void user_should_perform_login_and(String string, String string2) {
	}
	@Then("User should Search Hotel {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_should_search_hotel_and(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	}
	@Then("User should verify after Search Message {string}")
	public void user_should_verify_after_search_message(String string) {
	}


	@Then("User should only enter the mandatory fields {string},{string},{string},\"{int}-{int}-{int}\"and\"{int}- Two\"")
	public void user_should_only_enter_the_mandatory_fields_and_two(String string, String string2, String string3, Integer int1, Integer int2, Integer int3, Integer int4) {
	}

	@Then("User should Search Hotel {string},{string},{string},\"{int}-{int}-{int}\"and\"{int}- Two\"")
	public void user_should_search_hotel_and_two(String string, String string2, String string3, Integer int1, Integer int2, Integer int3, Integer int4) {
	}
	@Then("User should verify after Error message {string},{string}")
	public void user_should_verify_after_error_message(String string, String string2) {
	}


	@Then("User should Search Hotels Without entering the fields")
	public void user_should_search_hotels_without_entering_the_fields() {
	}
	@Then("User should verify Error Message after search {string}")
	public void user_should_verify_error_message_after_search(String string) {
	}







	
	
}
