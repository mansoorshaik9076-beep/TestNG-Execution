package com.pom.object;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomPage {

WebDriver driver;
	
	public HomPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By successmessage = By.xpath("//h4[@class='subheader']");
	
	public void successMessageValidation()
	{
		String text = driver.findElement(successmessage).getText();
		assertEquals(text, "Welcome to the Secure Area. When you are done click logout below.");
	}
}
 