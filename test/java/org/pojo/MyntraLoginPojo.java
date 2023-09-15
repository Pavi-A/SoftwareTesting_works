package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyntraLoginPojo {
	public MyntraLoginPojo() {
		
		
	}
	@FindBy(xpath="//input[@placeholder='Search for products, brands and more']")
	private WebElement searchProduct;
	@FindBy(xpath="(//a[@target='_blank'])[1]")
	private WebElement firstProduct;
	@FindBy(xpath="(//button[@class='size-buttons-size-button size-buttons-size-button-default'])[1]")
	private WebElement clickBtn;
	
	
	public WebElement getSearchProduct() {
		return searchProduct;
	}
	public WebElement getFirstProduct() {
		return firstProduct;
	}
	public WebElement getClickBtn() {
		return clickBtn;
	}

}
