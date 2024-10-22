package Testng_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assign56_searchonAmazon_10Inputs_Dataprovider 
{
	 @DataProvider(name="set1")
	   public Object[][] method1()
	   {
		return new Object[][] {{"Shoe"},{"Shirts"},{"Trousers"},{"Gifts"},{"Slippers"},{"Washing Machine"},{"Fridges"},{"Books"},{"Bracelets"},{"Dresses"}};   
	   }	
		
	   @Test(dataProvider="set1")
	   public void Search(String input)
	   {

			ChromeDriver driver = new ChromeDriver();
	       driver.get("https://www.amazon.in/");		
	       driver.manage().window().maximize();
	       WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
	       e1.sendKeys(input + Keys.ENTER);
	   }
}
