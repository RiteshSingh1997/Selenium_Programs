package Testng_Programs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assign63_Timeout_parameter 
{
	@Test(timeOut=10000)                                         //if execution will not complete within the time set then testcase will fail
	public void addWishList() throws InterruptedException
	{   ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in");
	    driver.manage().window().maximize();
		WebElement txtBox_search = driver.findElement(By.id("twotabsearchtextbox"));
		txtBox_search.sendKeys("Shoes"+Keys.ENTER);
		WebElement shoe1st = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
		shoe1st.click();
		Thread.sleep(3000);
		// add to wishlist
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> is1 = s1.iterator();
		String parentID = is1.next();
		String childID = is1.next();
		driver.switchTo().window(childID);
		WebElement btn_wishList = driver.findElement(By.id("wishListMainButton"));
		btn_wishList.click();
	}
	
}
