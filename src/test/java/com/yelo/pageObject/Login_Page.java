package com.yelo.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	
	//declaration
		@FindBy(xpath = "//a[text()='Sign Up']")private WebElement clk;
		
		@FindBy(xpath = "//input[@id='exampleInputEmail1']")private WebElement enterEmail;
		
		@FindBy(xpath = "//input[@id='exampleInputPassword1']")private WebElement enterpassword;
		
		@FindBy(xpath = "//button[text()='Login']")private WebElement clkOnLoginbtn;
		
    //Initialization
		public Login_Page(WebDriver driver) {
		
			PageFactory.initElements( driver,this);
		}
		
    //implementation
		
			
		     
		     public void clickOnSignUpLinkText() {
		 		clk.click();
		 	}
		     
		     public void EnterEmail(String Email) {
		    	 enterEmail.sendKeys(Email);
			 	}
		     
		     public void EnterPassword(String password) {
		    	 enterpassword.sendKeys(password);
			 	}
		     
		     public void ClickOnLoginButton() {
		    	 
		    	 clkOnLoginbtn.click();
			 		
			 	}  
		     
		     
		
		

}
