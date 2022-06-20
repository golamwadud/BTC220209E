package com.bit.test;

import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Browser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/zinatrehana/Downloads/All WebDriver/chromedriver");
		ChromeDriver dr = new ChromeDriver();
		dr.get("https://www.amazon.com/");

	}

}
