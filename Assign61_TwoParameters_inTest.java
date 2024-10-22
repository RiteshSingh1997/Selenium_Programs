package Testng_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assign61_TwoParameters_inTest 

{   
	ChromeDriver driver = new ChromeDriver();

  @Test(priority=1,invocationCount=3)
  public void launchFlipkart()
  {
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	  
  }
  @Test(enabled=false,priority=2)                            //by enables=false - testcase will not execute     
  public void SearchonFlipkart()
  {
	  WebElement e1 = driver.findElement(By.xpath("//input[@name='q']"));
		e1.sendKeys("iphone 16");
		e1.sendKeys(Keys.ENTER);
	  
  }
	
}
