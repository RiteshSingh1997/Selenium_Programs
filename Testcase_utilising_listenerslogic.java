package TestNG_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNG_Programs.ITestListener_logic.class)
public class Testcase_utilising_listenerslogic extends ITestListener_logic
{  
	@Test
	public void search_amazon()
	{
	  driver = new EdgeDriver();
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
	  
	  WebElement search_shoe = driver.findElement(By.id("twotabsearchtextbox"));
	  search_shoe.sendKeys("shoes" + Keys.ENTER);
	}

}
