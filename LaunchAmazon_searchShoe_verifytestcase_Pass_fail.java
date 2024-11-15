package TestNG_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LaunchAmazon_searchShoe_verifytestcase_Pass_fail 
{     
	  @Test
	  public void Search() throws InterruptedException
	  {
		  ChromeDriver driver = new ChromeDriver();
		  driver.get("https://www.amazon.in/");
		  driver.manage().window().maximize();
		  
		  WebElement search_shoe = driver.findElement(By.id("twotabsearchtextbox"));
		  search_shoe.sendKeys("shoes" + Keys.ENTER);
		  Thread.sleep(3000);
		    List <WebElement> li = driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
		   int countofshoes = li.size();
		    System.out.println(countofshoes);
		    Assert.assertEquals(true, countofshoes>50);
		  ;
	  }

}
