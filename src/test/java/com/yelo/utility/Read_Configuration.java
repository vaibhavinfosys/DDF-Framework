package com.yelo.utility;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_Configuration {
	
Properties prop;
	
	

	//constructor
	public Read_Configuration()  {
		try {
			 prop=new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\DELL PC\\eclipse-workspace\\Yelo\\configurations\\conf.properties");
		prop.load(fis);
		} 
		
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
	
	}
	
	 // getting base URL From properties file
	
	public String getBaseUrl() {
		String value = prop.getProperty("baseUrl");
		
		
			return value;
	}
	
	 // getting Browser From properties file
	
	public String getBrowser() {
		String value = prop.getProperty("browser");
		
		
			return value;
	}
	
	// Getting EmailID from properties File
	
	public String getEmailID() {
		String value = prop.getProperty("email");
		
		
			return value;
	}
	
	
	// Getting password from properties File
	
	public String getPassword() {
		String value = prop.getProperty("password");
		
		
			return value;
	}
	
	
	
}
