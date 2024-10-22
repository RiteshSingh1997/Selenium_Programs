package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign58_searchonAmazon_DDT {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{ 
	  FileInputStream f1 = new FileInputStream("C:\\Users\\Ritesh.s\\eclipse-workspace\\Selenium\\Datadrivensheets\\FetchingSheets.xlsx");
	  Workbook w1 = WorkbookFactory.create(f1);
	  String search = w1.getSheet("sheet2").getRow(0).getCell(0).getStringCellValue();
	  System.out.println(search); 
		  
		ChromeDriver driver = new ChromeDriver();
		  driver.get("https://www.amazon.in/");
		  driver.manage().window().maximize();
		  WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		  e1.sendKeys(search + Keys.ENTER);
		  

	}

}
