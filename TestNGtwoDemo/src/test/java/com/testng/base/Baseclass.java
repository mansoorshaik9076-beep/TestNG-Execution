package com.testng.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
  WebDriver driver;
  
  public void launchchromebrowser()
  {
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
  }
  
  public void searchAndAcessApp() throws InterruptedException
  {
	  driver.get("https://the-internet.herokuapp.com/login");
	  
  }
  
  public void enterUsername()
  {
	  driver.findElement(By.id("username")).sendKeys("tomsmith");
  
  }
  public void enterPassword() 
  {
	  driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	  
  }
  
  public void clickLoginButton()
  {
	  driver.findElement(By.className("radius")).click();
	
  }
  
  public void closeBrowser()
  {
	  driver.quit();
  }


  }
  