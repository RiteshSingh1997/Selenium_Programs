package Testng_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assign62_Disable_Test 
{
	@Test(enabled=false,priority=2)                            //by enabled=false - testcase will not execute     
	  public void SearchonFlipkart()
	  {   
		ChromeDriver driver = new ChromeDriver();
		  WebElement e1 = driver.findElement(By.xpath("//input[@name='q']"));
			e1.sendKeys("iphone 16");
			e1.sendKeys(Keys.ENTER);
		  
	  }
}
