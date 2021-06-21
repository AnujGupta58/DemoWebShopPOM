package com.dws.utilities;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

public class TestUtil {

	private String path;
	private FileInputStream fis;
	private XSSFWorkbook workbook;
	private XSSFSheet sheet;
	private XSSFRow row;
	private XSSFCell cell;

	public TestUtil(String path) {
		try {
			fis = new FileInputStream(path);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheetAt(0);
			fis.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public int getRowCount() {
		int index = workbook.getSheetIndex(sheet);
		//System.out.println(index);
		if(index==-1) {
			return 0;
		}
		else {
			sheet = workbook.getSheetAt(index);
			//System.out.println(sheet);
			int rowNum = sheet.getLastRowNum()+1;
			return rowNum;
		}
	}
	
	public int getColumnCount() {
		int index = workbook.getSheetIndex(sheet);
		if(index==-1) {
			return 0;
		}
		else {
			sheet = workbook.getSheetAt(index);
			row = sheet.getRow(0);
			if(row==null) {
				return 0;
			}
			else {
				return row.getLastCellNum();
			}
		}
	}
	
	public String getCellData(String sheetName,int rowNum,int colNum) {
		int index = workbook.getSheetIndex(sheetName);
		if(index==-1) {
			return "sheet does not exist";
		}
		
		sheet = workbook.getSheetAt(index);
		row = sheet.getRow(rowNum-1);
		cell = row.getCell(colNum-1);
		
		if(row == null) {
			return "sheet is empty";
		}
		else if(cell == null){
			return "sheet is empty";
		}
		else {
			return cell.getStringCellValue();	
		}
	}
	

	
}
