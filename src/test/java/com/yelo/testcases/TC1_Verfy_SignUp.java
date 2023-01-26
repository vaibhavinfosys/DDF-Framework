package com.yelo.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.yelo.pageObject.Login_Page;
import com.yelo.pageObject.SignUp_Step2;
import com.yelo.pageObject.SignUp_choose_store_type;
import com.yelo.pageObject.SignUp_page;


public class TC1_Verfy_SignUp extends Base_Class {
	
	@Test
	public void EnterSignUpPage() {
		
		//open URL
		
		driver.get(url);
		
		
		Login_Page loginpage =new Login_Page(driver);
		loginpage.clickOnSignUpLinkText();
		
		SignUp_page signup=new SignUp_page(driver);
		
		signup.EnterName();
		signup.EnterEmailID();
		signup.EnterPassWord();
		signup.EnterePhoneNumber();
		signup.ClickOnLogInButton();
		
		SignUp_Step2 step2=new SignUp_Step2(driver);
		step2.EnetrBusinessName();
		step2.ClickOnNextbutton();
		
		SignUp_choose_store_type chooseStore=new SignUp_choose_store_type(driver);
		chooseStore.clickOnnextBtn();
		
	}
	
	
	
	

}
