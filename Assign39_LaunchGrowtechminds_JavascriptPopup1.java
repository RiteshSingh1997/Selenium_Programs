package Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign39_LaunchGrowtechminds_JavascriptPopup1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/javascript-popup//");
		WebElement e1 = driver.findElement(By.xpath("//button[.='Click ']"));
		e1.click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}

}
