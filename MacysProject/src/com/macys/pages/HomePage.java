package com.macys.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.h2k.macys.MacysTests;

public class HomePage {
	
	
	WebDriver driver;
	
	int i;
	
	String s;
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;//We are assigning the local variable to global variable..
		
		//In order to distinguish between global variables and local variables we have to use this keyword.
	}
	//Whenever user performs an actions resulting in a next page it should return 
	//next page object
	public SearchResultsPage searchItem(String itemName)
	{
		driver.findElement(By.id(MacysTests.pro.getProperty("Macys.HomePage.inputField"))).sendKeys(itemName);
		driver.findElement(By.id(MacysTests.pro.getProperty("Macys.HomePage.searchField"))).submit();
		//driver.findElement(By.id("globalSearchInputField")).sendKeys(itemName);
		//driver.findElement(By.id("subnavSearchSubmit")).submit();
		
		//Creating an object of next page
		SearchResultsPage sPage = new SearchResultsPage(driver);
		
		//Returning an object of next page
		return sPage;
		
	}

}
