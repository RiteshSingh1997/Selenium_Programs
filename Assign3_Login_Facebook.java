package basic_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign3_Login_Facebook {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("stdbynkt@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("suijoy");
		driver.findElement(By.name("login")).click();
//		driver.get("https://www.flipkart.com");
//		driver.findElement(By.id("container")).click();
//		WebElement e1 = driver.findElement(By.linkText("Login"));
//		e1.click();
	
	}

}
