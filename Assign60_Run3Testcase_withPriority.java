package Testng_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assign60_Run3Testcase_withPriority 
{
  ChromeDriver driver = new ChromeDriver();
	
  @Test(priority=1)
  public void LaunchingAmazon()
  {
      driver.get("https://www.amazon.in/");		
      driver.manage().window().maximize();
  }
  
  @Test(priority=2)
  public void SearchingOnAmazon()
  {
      WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
      e1.sendKeys("shoe" + Keys.ENTER);  
  }
  
  @Test(priority=3)
  public void ClosingBrowser()
  {
      driver.quit();;
  }
}
