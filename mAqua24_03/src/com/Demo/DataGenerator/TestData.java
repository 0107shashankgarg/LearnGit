package com.Demo.DataGenerator;
import java.util.ArrayList;
import java.util.HashMap;


public class TestData {

	public static HashMap<String,HashMap> data=new HashMap();
	public static void pushData(String Key,HashMap dataset)
	{
		
		data.put(Key, dataset);
		/* retrive format for excel
		 singleCollection=(String[][]) data.get("test1").get("Sheet1");
	*/
		// String singleCollection[][]=(String[][]) data.get("test1").get("Sheet1");
		// System.out.println(singleCollection[1][1]);
	
	}
	
	public static String[][] getExcelData(String fileName,String sheetName)
	{
		return (String[][]) data.get(fileName).get(sheetName);
	}
}
