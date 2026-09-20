package com.pom.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultsPage {

	
	WebDriver driver;
	
	public ResultsPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By link = By.linkText("Login Page");
	
	public void clickLink() throws InterruptedException
	{
	driver.findElement(link).click();
	Thread.sleep(2000);
	}
}
