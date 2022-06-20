package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {
	
ChromeDriver dr;
	
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/zinatrehana/Downloads/All WebDriver/chromedriver");
		dr = new ChromeDriver();
		dr.get("https://www.target.com/");
	}
	
	public void closeBrowser() throws InterruptedException {
		waitForElement(5000);
		dr.quit();
	}
	
	public void goToAnyWebSite(String url) {
		dr.get(url);
	}
	
	public void clickOnAnyElement(By locator) {
		dr.findElement(locator).click();
		//dr.findElement(By.xpath("//*[@id=\"username\"]"))
	}
	
	public void clickOnElement(WebElement ele) {
		//dr.findElement(By.id("")).click();
		ele.click();
	}
	
	public void clickOnAnyElementByXpath(String xpathValue) {
		dr.findElement(By.xpath(xpathValue)).click();
	}
	
	//click by css, id, class etc
	public void typeOnElement() {
		
		dr.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("abcdefgh@gmail.com");
	}
	
	public void typeOnAnyElement(By locator, String text) {
		dr.findElement(locator).sendKeys("abcdefgh@gmail.com");
		locator = By.xpath("\"//*[@id=\\\\\\\"username\\\\\\\"]\\\")\"");
		 
	}
	
	public void waitForElement(long milli) throws InterruptedException {
		Thread.sleep(milli);
	}
	
	//Target : Expect More. Pay Less.
	public void verifyTitle(String expectedTitle) {
		String actualTitle = dr.getTitle();
		boolean result = actualTitle.equals(expectedTitle);
		System.out.println("Title matched or not ? : " + result);
	}
	
	public void verifyUrl(String expectedUrl) {
		String actualUrl = dr.getCurrentUrl();
		boolean result = actualUrl.contains(expectedUrl);
		System.out.println("URL matched or not ? : " + result);
	}
	
	public void verifyElementDisplay(By by) {
		boolean result = dr.findElement(by).isDisplayed();
		System.out.println("Is element displayed? : " + result);
	}
	
	public void verifyAnyText(By locator, String expectedText) {
		String text = dr.findElement(locator).getText();
		System.out.println("Did the text matched or not? : " + text.contains(expectedText));
	}
	
	
	
	


}
