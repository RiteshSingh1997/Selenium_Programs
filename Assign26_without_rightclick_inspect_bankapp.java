package basic_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign26_without_rightclick_inspect_bankapp 
{ 
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://my.idfcfirstbank.com/login");
		Thread.sleep(5000);
		
		WebElement e1=driver.findElement(By.name("mobileNumber"));
		e1.sendKeys("3456789211");
		Thread.sleep(2000);
		
		WebElement e2=driver.findElement(By.xpath("//span[.='Proceed to login']"));
		e2.click();
		Thread.sleep(2000);
		
		WebElement e3=driver.findElement(By.id("login-password-input"));
		e3.sendKeys("password");
		Thread.sleep(2000);
		
		WebElement e4=driver.findElement(By.xpath("//span[.='Login securely']"));
		e4.click();

	}


}
