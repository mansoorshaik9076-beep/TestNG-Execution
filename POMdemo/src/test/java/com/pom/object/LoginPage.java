package com.pom.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	By username = By.id("username");
	By password = By.id("password");
	By loginButton = By.className("radius");
	
	public void enterusername() throws InterruptedException
	{
	driver.findElement(username).sendKeys("tomsmith");	
	Thread.sleep(2000);
	}
	
	public void enterpassword() throws InterruptedException
	{
		driver.findElement(password).sendKeys("SuperSecretPassword!");
		Thread.sleep(2000);
	}
	public void clickLogin() throws InterruptedException
	{
	driver.findElement(loginButton).click();
	Thread.sleep(2000);
	}
}
