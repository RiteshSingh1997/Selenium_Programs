package Testng_Programs;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assign51_ExecutionOrder 
{
  @BeforeMethod
  public void launch_browser()
  {
	  ChromeDriver driver = new ChromeDriver();
	  System.out.println("BeforeMethod");
		
  }
  @Test
  public void launchamazon()
  {
	  ChromeDriver driver = new ChromeDriver();
		driver.get("https:\\www.amazon.in");
		driver.manage().window().maximize();
		System.out.println("LaunchAmazon");
  }
  @Test
  public void closetab() throws InterruptedException
  {
	  ChromeDriver driver = new ChromeDriver();
		driver.get("https:\\www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.close();
		System.out.println("TabsClosed");
  }
}
