package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign59_LoginAmazon_AddnewAddress_DDT {

	public static void main(String[] args) throws IOException 
	{
		 FileInputStream f1 = new FileInputStream("C:\\Users\\Ritesh.s\\eclipse-workspace\\Selenium\\Datadrivensheets\\FetchingSheets.xlsx");
			Workbook w1 = WorkbookFactory.create(f1);
			String un = w1.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
			System.out.println(un);            // -- dont need to print , for our understanding purpose to check proper value is fetching
			String pwd = w1.getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
			System.out.println(pwd);
			String pincode = NumberToTextConverter.toText(w1.getSheet("sheet1").getRow(1).getCell(2).getNumericCellValue());   // to handle IllegalException
			System.out.println(pincode); 
			String Addressline1 = w1.getSheet("sheet1").getRow(1).getCell(3).getStringCellValue();
			System.out.println(Addressline1);
			String Addressline2 = w1.getSheet("sheet1").getRow(1).getCell(4).getStringCellValue();
			System.out.println(Addressline2);
			String TownCity = w1.getSheet("sheet1").getRow(1).getCell(5).getStringCellValue();
			System.out.println(TownCity);
			
			
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
		  WebElement e5 = driver.findElement(By.xpath("//span[.='Hello, ritesh']"));
		  Actions a2 = new Actions(driver);
		  a2.moveToElement(e5).perform();
		  WebElement e6 = driver.findElement(By.xpath("//span[.='Your Account']"));
		  e6.click();
		  WebElement e7= driver.findElement(By.xpath("//span[.='Edit addresses for orders and gifts']"));
		  e7.click();
		  WebElement e8= driver.findElement(By.xpath("//div[.='Add address']"));
		  e8.click();
		  WebElement e9= driver.findElement(By.id("address-ui-widgets-enterAddressFullName"));
		  e9.sendKeys("Ritesh Singh");
		  WebElement e10= driver.findElement(By.id("address-ui-widgets-enterAddressPhoneNumber"));
		  e10.sendKeys("7021511364");
		  WebElement e11= driver.findElement(By.id("address-ui-widgets-enterAddressPostalCode"));
		  e11.sendKeys(pincode);
		  WebElement e12= driver.findElement(By.id("address-ui-widgets-enterAddressLine1"));
		  e12.sendKeys(Addressline1);
		  WebElement e13= driver.findElement(By.id("address-ui-widgets-enterAddressLine2"));
		  e13.sendKeys(Addressline2);
		  WebElement e14= driver.findElement(By.id("address-ui-widgets-enterAddressCity"));
		  e14.sendKeys(TownCity);
		  WebElement e15= driver.findElement(By.id("address-ui-widgets-form-submit-button"));
		  e15.click();
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  

	}

}
