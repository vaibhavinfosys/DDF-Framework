package com.yelo.testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.yelo.utility.Read_Configuration;

import io.github.bonigarcia.wdm.WebDriverManager;





public class Base_Class {
	Read_Configuration readConfig= new Read_Configuration();
	String url=readConfig.getBaseUrl();
	String browser=readConfig.getBrowser();
	
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// maximize the windows
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
	
	

	
	
	
}
