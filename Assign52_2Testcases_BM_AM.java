package Testng_Programs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assign52_2Testcases_BM_AM 
{
    ChromeDriver driver;
	
	@BeforeMethod                                                              //1st execution
	public void LaunchAmazon()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	}
	@Test
	public void searchProd()                                                  //2nd execution due to alphabetical order after BeforeMethod
	{   
		WebElement txtBox_search = driver.findElement(By.id("twotabsearchtextbox"));
		txtBox_search.sendKeys("Shoes"+Keys.ENTER);
	}
	@Test
	public void addWishList() throws InterruptedException                      //1st execution due to alphabetical order after BeforeMethod
	{
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
	
	@AfterMethod                                                              //3 execution
	public void closeBrowser() throws InterruptedException
	{   Thread.sleep(3000);
		driver.quit();
	}
	
}