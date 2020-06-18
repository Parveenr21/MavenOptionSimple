package pack_testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Excel_data_provider_new {
	String fileName = "ExcelRepo/Book1.xls";



	@DataProvider(name = "dp")
	public Object[][] getData() throws IOException {

		Workbook workBook = createWorkbookInstance(fileName);




		ArrayList<List<String>> values = new ArrayList<List<String>>();
		ArrayList<String> rowValues ;


		Sheet sheet = workBook.getSheet("Sheet1");
		int rows = sheet.getPhysicalNumberOfRows();

		//first starts with 1
		for (int i = 1; i < rows; i++) {
			Row row = sheet.getRow(i);

			//System.out.println( "****" + row.getCell(0).getStringCellValue());
			//System.out.println( "****" + row.getCell(1).getStringCellValue());
			//System.out.println( "****" + row.getCell(3).getStringCellValue());
			//Numeric values can not be fetched only String values are getting fetched..
			//there should not be any Blank rows in the middle

			int totalColumns=row.getLastCellNum();
			//rowValues=null;//This wull return null pointer.. rather use .clear() method
			//rowValues.clear();  This will set up the values  list to null at each index.. so best way to create new list eveytime
			rowValues=new ArrayList<String>();

			for(int x=1;x<totalColumns;x++)
			{
				try {
					rowValues.add(row.getCell(x).getStringCellValue());
				}
				catch (IllegalStateException il)
				{
					rowValues.add(Double.toString(row.getCell(x).getNumericCellValue()));
				}
			}

			values.add(rowValues);





		}




		Object[][] returnValue = new Object[values.size()][values.get(0).size()];


		for(int i=0;i<values.size();i++)
		{

			for(int j=0;j<values.get(i).size();j++)
			{

				returnValue[i][j]=values.get(i).get(j);

			}
		}





		return returnValue;
	}

	private InputStream getInputFileStream(String fileName) throws FileNotFoundException {
		ClassLoader loader = this.getClass().getClassLoader();
		InputStream inputStream = loader.getResourceAsStream(fileName);
		if (inputStream == null) {
			inputStream = new FileInputStream(new File(fileName));
		}
		return inputStream;
	}



	public Workbook createWorkbookInstance(String fileName) throws IOException
	{
		Workbook workBook = null;
		FileInputStream fileInput_strema = new FileInputStream(fileName);
		if (fileName.toLowerCase().endsWith("xlsx") == true) {
			workBook = new XSSFWorkbook(fileInput_strema);
		} else if (fileName.toLowerCase().endsWith("xls") == true) {
			workBook = new HSSFWorkbook(fileInput_strema);
		}
		fileInput_strema.close();
		return  workBook;

	}


	@Test(dataProvider = "dp")
	public void testMethod(String comp, String name, String age, String sex) {
		System.out.println(comp);
		System.out.println(name);
		System.out.println(age);
		System.out.println(sex);

		System.out.println("###############");


	}

}