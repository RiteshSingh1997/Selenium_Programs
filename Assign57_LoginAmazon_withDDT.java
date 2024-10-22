package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign57_LoginAmazon_withDDT 
{
  public static void main(String[] args) throws IOException 
  { 
	  FileInputStream f1 = new FileInputStream("C:\\Users\\Ritesh.s\\eclipse-workspace\\Selenium\\Datadrivensheets\\FetchingSheets.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		String un = w1.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(un);            // -- dont need to print , for our understanding purpose to check proper value is fetching
		String pwd = w1.getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(pwd); 
	  
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
	  WebElement e1 = driver.findElement(By.xpath("//div[@class='nav-line-1-container']"));
	  Actions a1 = new Actions(driver);
	  a1.moveToElement(e1).perform();
	  WebElement e2 = driver.findElement(By.xpath("//span[.='Sign in']"));
	  e2.click();
	  WebElement un1 = driver.findElement(By.name("email"));
	  un1.sendKeys(un);
	  WebElement e3 = driver.findElement(By.id("continue"));
	  e3.click();
	  WebElement pwd1 = driver.findElement(By.name("password"));
	  pwd1.sendKeys(pwd);
	  WebElement e4 = driver.findElement(By.id("signInSubmit"));
	  e4.click();  
	 
  }
}
