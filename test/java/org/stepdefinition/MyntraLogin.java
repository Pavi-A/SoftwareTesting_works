package org.stepdefinition;


import org.pojo.MyntraLoginPojo;
import org.sam.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyntraLogin extends BaseClass{
	@Given("To launch the chrome browser and maximize the window")
	public void to_launch_the_chrome_browser_and_maximize_the_window() {
		launchBrowser();
		WindowMaximize();
		
	    
	}

	@When("The launch the url of the myntra application")
	public void the_launch_the_url_of_the_myntra_application() {
		launchUrl("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK&gclid=EAIaIQobChMIk6Drlf79_QIVyTArCh02FgcZEAAYASAAEgJNMPD_BwE");
	    	}
	

	@When("Click search button and search T shirt")
	public void click_search_button_and_search_T_shirt() {
		MyntraLoginPojo f = new MyntraLoginPojo();
		passText("T-shirt", f.getSearchProduct());
    	 
	    
	}

	@When("To Select the first image")
	public void to_Select_the_first_image() {
		MyntraLoginPojo f= new MyntraLoginPojo();
		passText("click", f.getFirstProduct());
	    	}

	@When("Click M size and Add to Bag button")
	public void click_M_size_and_Add_to_Bag_button() {
		MyntraLoginPojo f = new MyntraLoginPojo();
	  clickBtn(f.getClickBtn());  
	}


	@Then("Close the browser")
	public void close_the_browser() {
	    	}

}
