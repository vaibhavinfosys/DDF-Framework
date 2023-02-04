package com.yelo.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp_Step2 {
	
	//declaration
			@FindBy(xpath = "(//input[@placeholder='Enter shop/business name'])[2]")private WebElement enterBuisenessname;
			
			@FindBy(xpath = "(//button[@id='btnLoader'])[2]")private WebElement clkNextBtn;
	    //Initialization
			public SignUp_Step2(WebDriver driver) {
			
				PageFactory.initElements( driver,this);
			}
			
	    //implementation
			
				
			     
			     public void EnetrBusinessName(String buisnessName) {
			    	 enterBuisenessname.sendKeys(buisnessName);
			 	}
			     
			     public void ClickOnNextbutton() {
			    	 clkNextBtn.click();
			 	}

}
