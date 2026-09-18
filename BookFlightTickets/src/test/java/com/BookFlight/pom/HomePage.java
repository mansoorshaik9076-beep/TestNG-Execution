package com.BookFlight.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HomePage {

 WebDriver driver;	
	
 public HomePage(WebDriver driver)
 {
this.driver=driver;	 
 }
 
 By close = By.xpath("//span[@class='commonModal__close']");
 By roundTripButton = By.xpath("//li[@data-cy='roundTrip']");
 By sourceCity = By.id("fromCity");
 By sourceSearchBox = By.xpath("//input[@aria-controls='react-autowhatever-1']");
 By destinationCity = By.id("toCity");
 By destinationSearchBox = By.xpath("//input[@aria-controls='react-autowhatever-1']");
 By searchButton = By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']");
 //Action methods:
 
 public void closePopUp() throws InterruptedException
 {
	 Thread.sleep(6000);
	    try {
	        driver.findElement(close).click();
	    }
	    catch (Exception e) {
	        System.out.println("Popup is not displayed");
	    } 
	Thread.sleep(2000);
 }
    public void clickRoundtripButton() throws InterruptedException
    {
    	driver.findElement(roundTripButton).click();
    	Thread.sleep(2000);
    }
 
    public void enterSourceCity(String fromCity) throws InterruptedException
    {
    	driver.findElement(sourceCity).click();
    	Thread.sleep(2000);
    	driver.findElement(sourceSearchBox).sendKeys(fromCity);
    	Thread.sleep(2000);
    	//driver.findElement(By.xpath("//span[text()='"+fromCity+"']"));
    	driver.findElement(By.xpath("//span[@class='revampedCityName' and contains(text(),'" + fromCity + "')]")).click();
    }
    
    public void enterDestinationCity(String toCity) throws InterruptedException
    {
    	driver.findElement(destinationCity).click();
    	Thread.sleep(2000);
    	driver.findElement(destinationSearchBox).sendKeys(toCity);
    	Thread.sleep(2000);
    	//driver.findElement(By.xpath("//span[text()='"+toCity+"']"));
    	driver.findElement(By.xpath("//span[@class='revampedCityName' and contains(text(),'" + toCity + "')]")).click();

    }
    
    public void selectDepartureDate() throws InterruptedException
    {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(500,600)","");
    	driver.findElement(By.xpath("//div[@aria-label='Sat Sep 19 2026']")).click();
    	Thread.sleep(2000);
    	
    }
    public void selectReturnDate() throws InterruptedException
    {
    	driver.findElement(By.xpath("//div[@aria-label='Thu Sep 24 2026']")).click();
    	Thread.sleep(2000);
    }
    public void clickSearchButton() throws InterruptedException
    {
    	driver.findElement(searchButton).click();
    	Thread.sleep(20000);
    }
		}
