package basic_program;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign33_LaunchAmazon_clickFirstshoe_clickAddtocart 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoe" + Keys.ENTER);
		WebElement e2 = driver.findElement(By.xpath("//a[@class='a-link-normal s-no-outline'][1]"));
		e2.click();
		Set<String> s1 = driver.getWindowHandles();
		System.out.println(s1);
		Iterator<String> i1 = s1.iterator();
		String parentid = i1.next();
		String childid = i1.next();
		System.out.println(parentid);
		System.out.println(childid);
		
		driver.switchTo().window(childid);
		Thread.sleep(2000);
		WebElement e3 = driver.findElement(By.name("submit.add-to-cart"));
		e3.click();
	}

}
