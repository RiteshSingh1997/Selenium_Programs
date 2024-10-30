package parameter_anottation_programs;

import java.util.Iterator;
import java.util.Set;

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

public class Assign67_searchproduct_addtowishlistamazon_paralleltesting 
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
	
	@Test
	public void searchproduct()
	{
		 WebElement e2 = driver.findElement(By.id("twotabsearchtextbox"));
		  e2.sendKeys("shoe" + Keys.ENTER);
	}
	@Test
	public void addtowishlist()
	{
		WebElement e3 = driver.findElement(By.id("twotabsearchtextbox"));
		  e3.sendKeys("shoe" + Keys.ENTER);
		WebElement e4 = driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		e4.click();
		Set<String> s1 = driver.getWindowHandles();
		System.out.println(s1);
		Iterator<String> i1 = s1.iterator();
		String parentid = i1.next();
		String childid = i1.next();
		System.out.println(parentid);
		System.out.println(childid);
		driver.switchTo().window(childid);
		WebElement e5 = driver.findElement(By.id("wishListMainButton"));
		e5.click();
	}
	
	@AfterMethod
	public void quit() throws InterruptedException
	{   
		Thread.sleep(4000);
		driver.quit();
	}
}
