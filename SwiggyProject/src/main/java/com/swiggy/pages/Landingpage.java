package com.swiggy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Landingpage {
	
	public WebDriver driver =new ChromeDriver();
	public void LoginPage (WebDriver driver) {
		PageFactory.initElements(driver,this);
		driver.get ("https://www.swiggy.com/");
	}

	public Actions actions;
	public WebDriverWait wait;
	
	@FindBy(id="location")
	public WebElement locationBox;
	
	@FindBy(xpath ="//a[contains(@class,'_3iFC5')]")
	public WebElement findFood;
	
	@FindBy(xpath ="//span[contains(@class ,'_2W-T9')]")
	public WebElement locationSuggestion;
	
	public void Landinpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver,10);	
		
	}
	
	public void enterLocation(String city) {
		wait.until(ExpectedConditions.visibilityOf(locationBox));
		locationBox.sendKeys(city);
		
		}
	public void selectLocation() {
		wait.until(ExpectedConditions.visibilityOf(locationSuggestion));
		locationSuggestion.click();
	}
	
	public void continuebtn() {
		findFood.click();
	}
}
