package Testng_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assign53_searchMultipleDataOnGoogle_Dataprovider 
{
   @DataProvider(name="set1")
   public Object[][] method1()
   {
	return new Object[][] {{"India"},{"Srilanka"},{"Bangladesh"},{"America"}};   
   }
   @DataProvider(name="set2")
   public Object[][] method2()
   {
	return new Object[][] {{"Salman Khan"},{"Narendra Modi"},{"Amit shah"},{"Shahrukh Khan"}};   
   }
   @DataProvider(name="set3")
   public Object[][] method3()
   {
	return new Object[][] {{100},{200},{300},{400}};   
   }
   
   /*@Test(dataProvider="set3")
   public void Search(int input)
   {

		int sum = 100+input;
		Reporter.log("Addition is -> " +sum);
   }*/
	
	
   @Test(dataProvider="set2")
   public void Search(String input)
   {

		ChromeDriver driver = new ChromeDriver();
       driver.get("https://www.google.com/");		
       driver.manage().window().maximize();
       WebElement e1 = driver.findElement(By.name("q"));
       e1.sendKeys(input + Keys.ENTER);
       
   }
}
