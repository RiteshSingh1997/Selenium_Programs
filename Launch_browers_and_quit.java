package parameter_anottation_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Launch_browers_and_quit
{   
	WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
    public void testcase(String nameofbrowser)
    {
		if(nameofbrowser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		if(nameofbrowser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		if(nameofbrowser.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");	
    }
	
	@AfterMethod
	public void quit() throws InterruptedException
	{   
		Thread.sleep(3000);
		driver.quit();
	}
	

}
