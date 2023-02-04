package com.yelo.pageObject;






import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class homePage_add_store_product {

	
	//declaration
	@FindBy(xpath = "//input[@placeholder='Product Name']")private WebElement enterproductName;
	@FindBy(xpath = "//textarea[@placeholder='Product Description']")private WebElement adddiscription;
	
	@FindBy(xpath = "//input[@placeholder='Price']")private WebElement enterprice;
	
	@FindBy(xpath = "//button[text()='Save Product']")private WebElement clkOnSaveButton;
	
	


	
	
//Initialization
	public homePage_add_store_product(WebDriver driver) {
	
		PageFactory.initElements( driver,this);
		 
		
	}
	

	
//implementation
	     
	      
	      public void enterProductName(String productname) throws InterruptedException {
	    	  
	    	  Thread.sleep(1000);
	    	  enterproductName.sendKeys(productname);
		
	    	  
	      }
	      
	      public void AddDiscription(String adddiscriptions) throws InterruptedException {
	    	  Thread.sleep(1000);
	    	  adddiscription.sendKeys(adddiscriptions);
		
	    	  
	      }
	      
	      public void enterPrice(String enterPrice) throws InterruptedException {
	    	  Thread.sleep(1000);
	    	  enterprice.sendKeys(enterPrice);
			
	    	  
	      }
	      
	    
		public void clickOnSaveButton() throws InterruptedException {
			 Thread.sleep(1000); 
	    	  clkOnSaveButton.click();
	   }
	
}
