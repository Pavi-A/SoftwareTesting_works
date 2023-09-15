package org.sam;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyntraLoginPojo {
	public MyntraLoginPojo() {
		
		
	}
	@FindBy(xpath="//input[@placeholder='Search for products, brands and more']")
	private WebElement searchProduct;
	@FindBy(xpath="")

}
