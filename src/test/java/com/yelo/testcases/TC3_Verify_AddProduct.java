package com.yelo.testcases;


import org.testng.annotations.Test;

import com.yelo.pageObject.Homepage;
import com.yelo.pageObject.homePage_add_store_product;
import com.yelo.utility.Read_ExcellData;

public class TC3_Verify_AddProduct extends Base_Class {
	
	@Test
	public void AddProduct() throws Throwable {
		
		Homepage page=new Homepage(driver);
		page.clickOnAddProductText();
		page.clickOnAddMore();
		
		homePage_add_store_product page1=new homePage_add_store_product(driver);
		
		page1.enterProductName(Read_ExcellData.getAddProductData(1, 0));
		
		page1.AddDiscription(Read_ExcellData.getAddProductData(1, 1));
		
		page1.enterPrice(Read_ExcellData.getAddProductData(1, 2));
		
	   
		
	     page1.clickOnSaveButton();
		
	}

}
