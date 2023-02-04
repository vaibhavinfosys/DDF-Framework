package com.yelo.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	//declaration
			@FindBy(xpath = "(//p[text()='Logout'])[2]")private WebElement clk;
			@FindBy(xpath = "//span[text()='vaibhav']")private WebElement verifytext;
			
			@FindBy(xpath = "(//span[text()='Add Products'])[1]")private WebElement clkOnAddProduct;
			
			@FindBy(xpath = "(//button[text()='   Add more'])[2]")private WebElement clkOnAddMore;
			
			
	    //Initialization
			public Homepage(WebDriver driver) {
			
				PageFactory.initElements( driver,this);
			}
			
	    //implementation
			      public void Logout() {
			 		clk.click();
			 	    }
              
			      public String verifylogin() {
			    	  return verifytext.getText();
				 	    }
			      
			      public void clickOnAddProductText() {
			    	  clkOnAddProduct.click();		
			    	  }
			      
			      public void clickOnAddMore() {
			    	  clkOnAddMore.click();
			      }
}
			      
