package TestNG_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Using_IRetryLogic_here 
{   
	@Test(retryAnalyzer=TestNG_Programs.IRetryAnalyzer_logic.class)
	public void search_google()
	{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	driver.findElement(By.name("qa")).sendKeys("India");
    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

}
