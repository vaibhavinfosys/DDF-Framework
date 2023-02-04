package com.yelo.utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_ExcellData {

	public static String getSignUpData(int rowindex,int colindex) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\DELL PC\\Desktop\\java tutorial\\Yelo Sign Up Data.xlsx");
		  Sheet sh = WorkbookFactory.create(fis).getSheet("SignUp");
		           String data = sh.getRow(rowindex).getCell(colindex).getStringCellValue();
		           return data;
       }
	
	public static String getAddProductData(int rowindex,int colindex) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\DELL PC\\Desktop\\java tutorial\\Yelo Sign Up Data.xlsx");
		  Sheet sh = WorkbookFactory.create(fis).getSheet("AddProduct");
		           String data = sh.getRow(rowindex).getCell(colindex).getStringCellValue();
		           return data;
       }

	
	
	
}
