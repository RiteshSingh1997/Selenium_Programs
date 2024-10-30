package parameter_anottation_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Assign69_Testcases2_SearchProduct extends Launch_Logins
{   
	@Test
	public void searchproduct()
	{     WebElement e1 = driver.findElement(By.id("searchDropdownBox"));
	      Select shoes = new Select(e1);
	      shoes.selectByVisibleText("Shoes & Handbags");
		  WebElement e2 = driver.findElement(By.id("twotabsearchtextbox"));
		  e2.sendKeys("shoe" + Keys.ENTER);
	}
}
