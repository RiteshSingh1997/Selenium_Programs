package parameter_anottation_programs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Assign69_Testcases3_Addingtowishlist extends Launch_Logins
{
		@Test
		public void addtowishlist()
		{
			WebElement e2 = driver.findElement(By.id("twotabsearchtextbox"));
			  e2.sendKeys("shoe" + Keys.ENTER);
			WebElement e3 = driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
			e3.click();
			Set<String> s1 = driver.getWindowHandles();
			System.out.println(s1);
			Iterator<String> i1 = s1.iterator();
			String parentid = i1.next();
			String childid = i1.next();
			System.out.println(parentid);
			System.out.println(childid);
			driver.switchTo().window(childid);
			WebElement e4 = driver.findElement(By.id("wishListMainButton"));
			e4.click();

		}
		
}
