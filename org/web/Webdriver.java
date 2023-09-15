package org.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91807\\eclipse-workspace\\SeleniumInmakes2\\driver\\chromedriver_win32.zip");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}

}
