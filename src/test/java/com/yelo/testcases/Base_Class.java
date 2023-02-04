package com.yelo.testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.yelo.pageObject.Homepage;
import com.yelo.pageObject.Login_Page;
import com.yelo.utility.Read_Configuration;

import io.github.bonigarcia.wdm.WebDriverManager;





public class Base_Class {
	Read_Configuration readConfig= new Read_Configuration();
	String url=readConfig.getBaseUrl();
	String browser=readConfig.getBrowser();
	String Email=readConfig.getEmailID();
	String password=readConfig.getPassword();
	
	
	  
	
	public static WebDriver driver;
	
	
	
	@BeforeClass
	public void setup() {
		
		switch(browser.toLowerCase()) {
		
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
			
		case "msedge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
			
		default:
			driver=null;
			break;
			
		}
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		// maximize the windows
		driver.manage().window().maximize();
		
	}
	
	@BeforeMethod
	     
	         public void login() {
		
		// open URL
	    driver.get(url);
		          
		Login_Page page=new Login_Page(driver);
		
		page.EnterEmail(Email);
		page.EnterPassword(password);
		page.ClickOnLoginButton();
			
	}
	
	
	@AfterMethod
	public void logout() throws Throwable {
		
		Homepage page=new Homepage(driver);
		
		Thread.sleep(2000);
		
		page.Logout();
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
	
	

	
	
	
}
