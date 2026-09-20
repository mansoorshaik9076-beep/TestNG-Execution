package com.pom.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {

	WebDriver driver;
	
	public GoogleSearchPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By searchText = By.id("ti6dpd");
	By searchButton = By.name("btnK");
	
	//Action methods;
	
	public void searchTextField() throws InterruptedException
	{
		driver.findElement(searchText).sendKeys("The internet Herokuapp");
		Thread.sleep(2000);
		
	}
	
	public void clicksearchButton() throws InterruptedException
	{
		driver.findElement(searchButton).click();
		Thread.sleep(60000);
	}
}
