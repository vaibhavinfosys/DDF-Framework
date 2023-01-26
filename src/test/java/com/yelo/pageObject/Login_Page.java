package com.yelo.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	
	//declaration
		@FindBy(xpath = "//a[text()='Sign Up']")private WebElement clk;
		
    //Initialization
		public Login_Page(WebDriver driver) {
		
			PageFactory.initElements( driver,this);
		}
		
    //implementation
		
			
		     
		     public void clickOnSignUpLinkText() {
		 		clk.click();
		 	}
		     
		
		

}
