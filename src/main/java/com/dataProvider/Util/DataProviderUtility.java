package com.dataProvider.Util;

import java.util.ArrayList;

import ExcelReader.Xls_ReaderClass;

public class DataProviderUtility {
	static Xls_ReaderClass reader;
	public static ArrayList<Object[]> getDataFromExcelSheet(){
		ArrayList<Object[]> myTestData=new ArrayList<Object[]>();
		 try{
			 reader=new Xls_ReaderClass("C:\\1\\SureshSir1\\src\\main\\java\\TestData\\orangehrm.xlsx");
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		 int rowCount=reader.getRowCount("onlysheet");
		 for(int rowNum=2;rowNum<=rowCount;rowNum++) {
			 
			 String firstname=reader.getCellData("onlysheet", "firstname", rowNum);
			 System.out.println(firstname);
			 
			 String middlename=reader.getCellData("onlysheet", "middlename", rowNum);
			 System.out.println(middlename);
			 
			 String lastname=reader.getCellData("onlysheet", "lastname", rowNum);
			 System.out.println(lastname);
			Object ob[]= {firstname,middlename,lastname};
			myTestData.add(ob);
		 
		 
		
	}
		 return myTestData;

}
}
