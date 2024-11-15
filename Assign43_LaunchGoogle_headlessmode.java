package basic_program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assign43_LaunchGoogle_headlessmode 
{ 
	public static void main(String[] args) 
	{ 
		ChromeOptions c1 = new ChromeOptions();
		c1.addArguments("--headless");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("India" + Keys.ENTER);
		
	}
}
