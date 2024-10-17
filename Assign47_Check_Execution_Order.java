package Testng_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
public class Assign47_Check_Execution_Order 
{
  @Test
  public void launch_flipkart()
  {
	  ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		System.out.println("Test");
  }
  @AfterMethod
  public void search_iphone16()
  {
	  ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.xpath("//input[@name='q']"));
		e1.sendKeys("iphone 16");
		e1.sendKeys(Keys.ENTER);
		System.out.println("AfterMethod");
  }
  @BeforeSuite
  public void select_2iphone()
  {
	  ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.xpath("//input[@name='q']"));
		e1.sendKeys("iphone 16");
		e1.sendKeys(Keys.ENTER);
		WebElement e2 = driver.findElement(By.xpath("(//a[@class='CGtC98'])[2]"));
		e2.click();
		System.out.println("BeforeSuite");
  }
  @AfterClass
  public void Launch_google()
  {
	  ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		System.out.println("AfterClass");
	
  }
	
}
