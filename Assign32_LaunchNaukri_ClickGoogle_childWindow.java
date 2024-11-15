package basic_program;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign32_LaunchNaukri_ClickGoogle_childWindow {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=16201&err=1");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.xpath("//span[.='Google']"));
		e1.click();
		Set<String> s1 = driver.getWindowHandles();
		System.out.println(s1);
		Iterator<String> i1 = s1.iterator();
		String parentid = i1.next();
		String childid = i1.next();
		System.out.println(parentid);
		System.out.println(childid);
		
		driver.switchTo().window(childid);
		Thread.sleep(3000);
		driver.close();
	}

}
