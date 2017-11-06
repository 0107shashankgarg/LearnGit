package com.Demo.DataGenerator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

public class ExcelDataConverter {
	int rowCount;
	int colCount;
	HSSFRow currentRow;
	Cell cell;
	HashMap excelLowData=new HashMap();
	String sheetName=null;
	String filePath=null;
	String workBookName=null;
	public  void setExcelData(String path,String sheet) {
		try {
			sheetName=sheet;
			filePath=path;
			FileInputStream fileInputStream = new FileInputStream(filePath);
			String FileName=filePath.substring(filePath.lastIndexOf("/")+1, filePath.lastIndexOf("."));
			HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);
			HSSFSheet worksheet = workbook.getSheet(sheetName);
			rowCount=worksheet.getLastRowNum();
			//System.out.println(rowCount);
			colCount=worksheet.getRow(0).getPhysicalNumberOfCells();
			//System.out.println(colCount);
			String[][] multi=new String[rowCount][colCount];
			for (int i = 0; i < rowCount; i++) {
				currentRow = worksheet.getRow(i);
				for (int j = 0; j < colCount; j++) {
					cell=currentRow.getCell(j);
					cell.setCellType(Cell.CELL_TYPE_STRING);					
					//System.out.print(currentRow.getCell(j).getStringCellValue()+ "\t\t");
					multi[i][j]=cell.getStringCellValue();
					
				}
				//System.out.println("");
				
			}
		
			excelLowData.put(sheetName, multi);
			TestData.pushData(FileName, excelLowData);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void setExcelData(String path,String sheet,int startRow,int endRow)
	{

		try {
			sheetName=sheet;
			filePath=path;
			FileInputStream fileInputStream = new FileInputStream(filePath);
			String FileName=filePath.substring(filePath.lastIndexOf("/")+1, filePath.lastIndexOf("."));
			HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);
			HSSFSheet worksheet = workbook.getSheet(sheetName);
			rowCount=worksheet.getLastRowNum();
			//System.out.println(rowCount);
			colCount=worksheet.getRow(0).getPhysicalNumberOfCells();
			//System.out.println(colCount);
			String[][] multi=new String[rowCount][colCount];
			for (int i = startRow; i <= endRow; i++) {
				currentRow = worksheet.getRow(i);
				for (int j = 0; j < colCount; j++) {
					cell=currentRow.getCell(j);
					cell.setCellType(Cell.CELL_TYPE_STRING);					
					//System.out.print(currentRow.getCell(j).getStringCellValue()+ "\t\t");
					multi[i][j]=cell.getStringCellValue();
					
				}
				//System.out.println("");
				
			}
		
			excelLowData.put(sheetName, multi);
			TestData.pushData(FileName, excelLowData);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	
	public void setExcelData(String path,String sheet,String dataSet)
	{
		sheetName=sheet;
		filePath=path;
		int count=0;
		String[] rows = dataSet.split(",");
		try {
			
			
			FileInputStream fileInputStream = new FileInputStream(filePath);
			String FileName=filePath.substring(filePath.lastIndexOf("/")+1, filePath.lastIndexOf("."));
			HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);
			HSSFSheet worksheet = workbook.getSheet(sheetName);
			rowCount=worksheet.getLastRowNum();
			//System.out.println(rowCount);
			colCount=worksheet.getRow(0).getPhysicalNumberOfCells();
			//System.out.println(colCount);
			String[][] multi=new String[rowCount][colCount];
			
			for (int i = 0; i< rows.length; i++) {
				currentRow = worksheet.getRow( Integer.parseInt(rows[i]));
				for (int j = 0; j < colCount; j++) {
					cell=currentRow.getCell(j);
					cell.setCellType(Cell.CELL_TYPE_STRING);					
					//System.out.print(currentRow.getCell(j).getStringCellValue()+ "\t\t");
					multi[Integer.parseInt(rows[i])][j]=cell.getStringCellValue();
					
				}
				//System.out.println("");
				
			}
		
			excelLowData.put(sheetName, multi);
			TestData.pushData(FileName, excelLowData);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}