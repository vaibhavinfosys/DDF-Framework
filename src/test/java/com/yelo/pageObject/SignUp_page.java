package com.yelo.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp_page {

	//declaration
			@FindBy(xpath = "//input[@name='firstname']")private WebElement enterName;
			
			@FindBy(xpath = "//input[@id='yelo-email']")private WebElement enterEmail;
			
			@FindBy(xpath = "//input[@id='yelo-password']")private WebElement enterpass;
			
	       @FindBy(xpath = "//input[@placeholder='Enter your phone number']")private WebElement enterPhone;
			
			@FindBy(xpath = "//button[text()='Continue']")private WebElement clickLogin;
			
			
			
			
	    //Initialization
			public SignUp_page(WebDriver driver) {
			
				PageFactory.initElements( driver,this);
			}
			
	    //implementation
			
				// signUp the page
			   
			     public void EnterName() {
			    	 enterName.sendKeys("akshay"); 	 
			 	}
			     
			     public void EnterEmailID() { 
			    	 enterEmail.sendKeys("salmankhan12356@gmail.com");	 
			     }
			     
			     public void EnterPassWord() { 
			    	 enterpass.sendKeys("Salman@12654");
			     }
			     
			     
			   

			     public void EnterePhoneNumber() {
			    	 enterPhone.sendKeys("8208111978");	 
			 	}
			     
			     public void ClickOnLogInButton() { 
			    	 clickLogin.click();	 
			     }
			     
			   
			     
	
}
