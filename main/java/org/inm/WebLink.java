package org.inm;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class WebLink extends BaseClass {
	
	
	@Test
	public void tc1() {
		System.out.println("Test case 1");
		launchUrl("https://www.facebook.com/");

		
	
	}



	@Before
	public void startDate() {
		Date d = new Date();
		System.out.println(d);

	}

	@BeforeClass
	public static void launchTheBrowser() { 
		launchBrowser();
		WindowMaximize();

	}

	@AfterClass
	public static void BrowserEnd() {
		//closeEntireBrowser();

	}

	@After
	public void EndDate() {
		Date d = new Date();
		System.out.println(d);

	}

	@Test
	public void tc2() {
		System.out.println("Test case 2");
		launchUrl("https://mail.google.com/mail/");
		

	}

	@Test
	public void tc3() {
		System.out.println("Test Case 3");
		launchUrl("https://inmakes.com/");

	}
	@Test
    public void tc4() {
		System.out.println("Test case 4");
		launchUrl("https://www.youtube.com/");
		

	}



	
		
	}


