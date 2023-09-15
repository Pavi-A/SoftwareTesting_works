package org.sam;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FbLoginPojo {
	public FbLoginPojo() {
		
	}
	@FindBy(id="email")
	private WebElement email;


   public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
   @FindBy(xpath = "//input[@aria-label='Password']")
   private WebElement password;
 
   @FindBy(name="login")
   private WebElement loginBtn;
   }
