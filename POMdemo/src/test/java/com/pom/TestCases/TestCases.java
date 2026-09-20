package com.pom.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pom.object.GoogleSearchPage;
import com.pom.object.HomPage;
import com.pom.object.LoginPage;
import com.pom.object.ResultsPage;

public class TestCases {

	WebDriver driver;
	
	GoogleSearchPage obj1;
	ResultsPage obj2;
	LoginPage obj3;
	HomPage obj4;
	
	@BeforeTest
public void launchChromeBrowsesr()
	{
		System.setProperty("webdriver,chrome.driver", "c:\\program File\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window();
		
	}
	@Test (priority = 0)
	public void verifySearch() throws InterruptedException
	{
		obj1 = new GoogleSearchPage(driver);
		obj1.searchTextField();
		obj1.clicksearchButton();
		
		
	}
	@Test  (priority = 1)
	public void verifySearchClick() throws InterruptedException
	{
		obj2 = new ResultsPage(driver);
		obj2.clickLink();
		
	}
	@Test (priority = 2)
	public void verifycredentials() throws InterruptedException 
	{
	obj3 = new LoginPage(driver); 	
	obj3.enterusername();
	obj3.enterpassword();
	obj3.clickLogin();
	
	
	}
	@Test  (priority = 3)
	public void verifySuccessfulLogin()
	{
		obj4 = new HomPage(driver);
		obj4.successMessageValidation();
	}
	@AfterTest 
	public void closeBrowser()
	{
		driver.close();
	}
}
