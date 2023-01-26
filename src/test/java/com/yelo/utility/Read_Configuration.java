package com.yelo.utility;

import java.io.FileInputStream;
import java.util.Properties;

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
	
	public String getBaseUrl() {
		String value = prop.getProperty("baseUrl");
		
		
			return value;
		
		
		
	}
	
	public String getBrowser() {
		String value = prop.getProperty("browser");
		
		
			return value;
		
		
	}
	

}
