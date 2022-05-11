package com.swiggy.testscripts;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BeforeAfter extends Tools {
	@BeforeTest
	public void setUp(Scenario scenario) throws MalformedURLException {
		Driver.init();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com");
}
		
	@After
	public void teardown() {
		driver.quit();
		
	}{
	}
}
