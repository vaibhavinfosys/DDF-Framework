package com.yelo.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp_choose_store_type {
	
	//declaration
			@FindBy(xpath = "(//button[@type='submit'])[2]")private WebElement clk;
			
	    //Initialization
			public SignUp_choose_store_type(WebDriver driver) {
			
				PageFactory.initElements( driver,this);
			}
			
	    //implementation
			
				
			     
			     public void clickOnnextBtn() {
			 		clk.click();
			 	}

}
