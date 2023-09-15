package org.script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class apps {
	public static void main(String[] args,) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91807\\eclipse-workspace\\AllJavascript\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//WebElement dob = driver.findElement(By.id("birthday_wrapper"));
		//Select s = new Select(dropDown);
		//boolean mul = s.isMultiple();
		//System.out.println(mul);
		
		
		
		
	}

}
