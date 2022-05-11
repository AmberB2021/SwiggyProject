package com.swiggy.testscripts;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderPizzaTestSteps extends Driver{
	
	@Given("a user is on the homepage of Swiggy")
	public void a_user_is_on_the_homepage_of_swiggy() {
		Assert.assertTrue(driver.getTitle().equals("Order food online from India's best food delivery service. Order from restaurants near you"));    
	}

	@Given("she Enters location as {string}")
	public void she_enters_location_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		landingPage.enterLocation(string);
	}
	

	@When("she selects first location from suggested location in suggestion-box")
	public void she_selects_first_location_from_suggested_location_in_suggestion_box() {
		landingPage.selectLocation(); 
		
	}

	
	@When("she redirects to ItemPage")
	public void she_redirects_to_item_page() {
		
	System.out.println("test casse"); 
		
	}

	@When("she hover over search icon")
	public void he_hover_over_search_icon() {
		items.hoverOverSerch();
	}

	@When("she Enters Item as {string}")
	public void he_enters_item_as(String string) {
		
	    items.enterItem(string);
		items.searchItem();
	}

	@When("she select first suggested Item in pizza cateogory")
	public void she_select_first_suggested_item_in_pizza_cateogory() {
		items.selectFirstItem();
	}

	@When("she searchs resturant and select first restaurant")
	public void she_searchs_resturant_and_select_first_restaurant() {
		placeOrder.addItem();
	}

	@When("she redirects to orderPage")
	public void she_redirects_to_order_page() {
		placeOrder.continueorder();
	}

	@When("she adds first item to cart")
	public void she_adds_first_item_to_cart() {
		placeOrder.moveToCart();
	}

	@When("she click on checkout button")
	public void she_click_on_checkout_button() {
		placeOrder.checkoutAction();
	    
	}

	@Then("she should be able to order a pizza suscessfully")
	public void she_should_be_able_to_order_a_pizza_suscessfully() {
		String expectedErrMsg = "SECURE CHECKOUT";
		String actualErrMsg = checkOut.getMsg();
		Assert.assertEquals(actualErrMsg, expectedErrMsg);
	    
	}{
	}
}
