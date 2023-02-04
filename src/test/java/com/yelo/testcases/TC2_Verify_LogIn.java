package com.yelo.testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.yelo.pageObject.Homepage;
import com.yelo.pageObject.Login_Page;

public class TC2_Verify_LogIn extends Base_Class{
	
	@Test
	
	public void verify_login_with_valid_credential(){
		
		Homepage page=new Homepage(driver);		
		String ActualText="vaibhav";
		
		String expectedText = page.verifylogin();
		
		SoftAssert soft =new SoftAssert();
		
		soft.assertEquals(ActualText, expectedText);
		
		soft.assertAll();
		
     }

}
