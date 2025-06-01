package day12;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		/*
		 * Apache POI - library for reading data from excel 
		 * .xlsx
		 * XSSFWorkbook
		 * XSSFSheet
		 * XSSFRow
		 * XSSFCell
		 * 
		 * .xls
		 * HSSFWorkbook
		 * HSSFSheet
		 * HSSFRow
		 * HSSFCell
		 * 
		 */
	String filePath="./src/day12/testdata.xlsx";	
		
	XSSFWorkbook wb = new XSSFWorkbook(filePath);
	XSSFSheet sheetName=wb.getSheet("data");
	
	int noOfRows=sheetName.getPhysicalNumberOfRows();//3
	int noOfCols=sheetName.getRow(0).getLastCellNum();//2
	System.out.println("Row Count: "+noOfRows);//3
	System.out.println("Col Count: "+noOfCols);//2
	for(int row=0;row<noOfRows;row++) {
		for(int col=0;col<noOfCols;col++) {
			System.out.println(sheetName.getRow(row).getCell(col).getStringCellValue());
		}
	}
	/*
	 * System.out.println(sheetName.getRow(0).getCell(0).getStringCellValue());
	 * System.out.println(sheetName.getRow(0).getCell(1).getStringCellValue());
	 * System.out.println(sheetName.getRow(1).getCell(0).getStringCellValue());
	 * System.out.println(sheetName.getRow(1).getCell(1).getStringCellValue());
	 */
	}

}
