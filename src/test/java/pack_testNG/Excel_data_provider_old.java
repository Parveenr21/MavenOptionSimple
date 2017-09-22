package pack_testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel_data_provider_old {
	String fileName = "ExcelRepo/Book1.xls";

	
@Test
	public void getData() throws IOException {
		
		Workbook workbook;
		
		InputStream inputStream = new FileInputStream(new File(fileName));
		
		
		if (fileName.toLowerCase().endsWith("xlsx") == true) {
			workbook = new XSSFWorkbook(inputStream);
			
			
			
		} else if (fileName.toLowerCase().endsWith("xls") == true) {
			workbook = new HSSFWorkbook(inputStream);
		
		
		/*//Get the workbook instance for XLS file 
		HSSFWorkbook workbook = new HSSFWorkbook(inputStream);
		
		//Get the workbook instance for XLSX file
		//I need to include the poi-ooxml jars to get the XSSF library. The poi jar only has the HSSF libraries.
		
		//XSSFWorkbook wBook = new XSSFWorkbook(inputStream); 
*/		
		
		//
		
		 //to get a sheet from workbook
			
		Sheet sheet=workbook.getSheet("Sheet1");
		
		
		//to get an iterator to iterate over the sheet-ROWS
		
		Iterator<Row> rowIterator=sheet.iterator();
		
		//This row iterator of sheet has next() method which returns next object of this iterator..so row iterator next() will return next row.
				
		
		while(rowIterator.hasNext())
			
		{
			
			Row row=rowIterator.next();
			
			System.out.println();
			
			Iterator<Cell> cellIterator=row.cellIterator();
			
					while(cellIterator.hasNext())
					{
						
						Cell cell=cellIterator.next();
						
						switch(cell.getCellType()) {
		                case Cell.CELL_TYPE_BOOLEAN:
		                    System.out.print(cell.getBooleanCellValue() + "\t\t");
		                    break;
		                case Cell.CELL_TYPE_NUMERIC:
		                    System.out.print(cell.getNumericCellValue() + "\t\t");
		                    break;
		                case Cell.CELL_TYPE_STRING:
		                    System.out.print(cell.getStringCellValue() + "\t\t");
		                    break;
						
						}
						
						
						
					}
					
				
		}
		
		
		inputStream.close();
		}
		


}

}