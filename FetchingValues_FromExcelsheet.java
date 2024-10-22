package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingValues_FromExcelsheet 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{   //step 1 - let java know where exactly the sheet is
		FileInputStream f1 = new FileInputStream("C:\\Users\\Ritesh.s\\eclipse-workspace\\Selenium\\Datadrivensheets\\FetchingSheets.xlsx");
        // step 2 - open the excel sheet
		Workbook w1 = WorkbookFactory.create(f1);
		//step 3 - Go to actual sheet in the file
		Sheet s1 = w1.getSheet("sheet1");
		Row r1 = s1.getRow(1);
		Cell c1 = r1.getCell(0);
		String un = c1.getStringCellValue();
		System.out.println(un);            // -- dont need to print , for our understanding purpose to check proper value is fetching
		Row r2 = s1.getRow(1);
		Cell c2 = r2.getCell(1);            // columns
		String pwd = c2.getStringCellValue();
		System.out.println(pwd);  
	}

}
