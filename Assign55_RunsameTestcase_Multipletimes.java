package Testng_Programs;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assign55_RunsameTestcase_Multipletimes 
{
  @Test(invocationCount=5)
  public void Method4()
  {
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
	  
  }
}
