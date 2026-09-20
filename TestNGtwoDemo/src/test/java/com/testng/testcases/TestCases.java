package com.testng.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testng.base.Baseclass;

public class TestCases {
	
	Baseclass base = new Baseclass();
	
    @BeforeTest
	public void launchBrowser()
	{
		base.launchchromebrowser();
	}
	
    @Test(priority = 0) 
    public void search() throws InterruptedException
    {
    	base.searchAndAcessApp();
    }   
    
    @Test(priority = 1) 
    public void verifyLoginFlow() throws InterruptedException
    {
    	base.enterUsername();
    	Thread.sleep(2000);
    	base.enterPassword();
    	Thread.sleep(2000);
    	base.clickLoginButton();
    	Thread.sleep(2000);
    }
    
    @AfterTest
    public void closeBrowser()
    {
    	base.closeBrowser();
    }
}
