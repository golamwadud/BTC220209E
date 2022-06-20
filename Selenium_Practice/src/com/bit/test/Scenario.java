package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario {

	public static void main(String[] args) throws InterruptedException {
		
		
		Utility util = new Utility();
		
		util.openBrowser();
		util.clickOnAnyElementByXpath("//*[@id=\"headerPrimary\"]/a[6]/div/span[3]");
		util.clickOnAnyElementByXpath("//*[@id=\"listaccountNav-signIn\"]/a/span");
		util.waitForElement(5000);
		util.clickOnAnyElementByXpath("//*[@id=\"username\"]");            
		util.typeOnElement();
		util.closeBrowser();
		
		
		/*
		 * Open Chrome browser.
		 * Navigate to Traget.com
		 * Click on the sigh in button
		 * Verify that sign in menu appears with list of items
		 * click on signIn Text link
		 * user will navigated to the login page
		 * enter email as "hfkshfksfsfsfk@yahoo.com"
		 * enter password as "AAAdbdhd123" 
		 * click on sign in button
		 * user name should be appears on the top right corner.
		 * 
		 */
		
		
	}

}
