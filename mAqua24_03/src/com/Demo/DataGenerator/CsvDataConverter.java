package com.Demo.DataGenerator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

import com.opencsv.CSVReader;

public class CsvDataConverter {
	public  void setCsvData(String path) {
		int countElement=0;
		int count=0;
		String key=null;
		HashMap excelLowData=new HashMap();
		try {
			String csvFilename =path;
			//String csvFilename = "src/Estimataion details - Sheet1.csv";
			key=csvFilename.substring(csvFilename.lastIndexOf("/"),csvFilename.indexOf("."));
			CSVReader csvReader = new CSVReader(new FileReader(csvFilename));
			String[] row = null;
			//countElement=csvReader.readNext().;
			countElement=csvReader.readNext().length;
			List<String[]> dataList=csvReader.readAll();
			csvReader=new CSVReader(new FileReader(csvFilename));
			
			String lowData[][]=new String[dataList.size()+1][countElement];
			while((row = csvReader.readNext()) != null) {
				for (int i = 0; i < countElement; i++) {
					// System.out.print( " # " +row[i]);
					 lowData[count][i]=row[i];
				}
				count++;
				//System.out.println(" ");
			 
			}
			//...
			excelLowData.put("csv", lowData);
			TestData.pushData(key, excelLowData);
			csvReader.close();	
			
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
}
}