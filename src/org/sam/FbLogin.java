package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLogin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91807\\eclipse-workspace\\AutomationTool\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    WebElement login = driver.findElement(By.id("email"));
	    login.sendKeys("pavialagar03@gmail.com");
	    WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	    password.sendKeys("12345");
	    WebElement clkbtn = driver.findElement(By.xpath("//button[@name='login']"));
	    clkbtn.click();
	    
	}

}
