package Testng_Programs;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign48_Check_Execution_Order 
{
  @BeforeMethod
  public void launch_Growtechminds()
  {
	  ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/hoverover/");
		driver.manage().window().maximize();
		System.out.println("BeforeMethod");
		
  }
  @Test
  public void Hoverover_Growtechminds()
  {
	  ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/hoverover/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.xpath("//div[@class='has_eae_slider elementor-element elementor-element-1857001 e-con-full e-flex e-con e-child']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(e1).perform();
		WebElement e2 = driver.findElement(By.xpath("//div[@class='popup4']"));
		e2.click();
		System.out.println("TestCase");
  }
  @AfterMethod
  public void launch_growtchmindregistration()
  {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		System.out.println("AfterMethod");
  }
  
}
