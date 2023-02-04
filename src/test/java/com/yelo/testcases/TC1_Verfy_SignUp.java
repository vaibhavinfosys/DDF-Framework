package com.yelo.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.yelo.pageObject.Login_Page;
import com.yelo.pageObject.SignUp_Step2;
import com.yelo.pageObject.SignUp_choose_store_type;
import com.yelo.pageObject.SignUp_page;
import com.yelo.utility.Read_ExcellData;


public class TC1_Verfy_SignUp extends Base_Class {
	
	@Test(enabled = false)
	public void EnterSignUpPage() throws Throwable {
		
		//open URL
		
		driver.get(url);
		
		
		Login_Page loginpage =new Login_Page(driver);
		loginpage.clickOnSignUpLinkText();
		
		SignUp_page signup=new SignUp_page(driver);
		
		signup.EnterName(Read_ExcellData.getSignUpData(1, 0));
		signup.EnterEmailID(Read_ExcellData.getSignUpData(1, 1));
		signup.EnterPassWord(Read_ExcellData.getSignUpData(1, 2));
		signup.EnterePhoneNumber(Read_ExcellData.getSignUpData(1, 3));
		signup.ClickOnLogInButton();
		
		SignUp_Step2 step2=new SignUp_Step2(driver);
		step2.EnetrBusinessName(Read_ExcellData.getSignUpData(1, 4));
		step2.ClickOnNextbutton();
		
		SignUp_choose_store_type chooseStore=new SignUp_choose_store_type(driver);
		chooseStore.clickOnnextBtn();
		
	}
	
	
	
	
	
	

}
