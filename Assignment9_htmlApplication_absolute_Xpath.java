package Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment9_htmlApplication_absolute_Xpath 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Ritesh.s/Downloads/Html%20File.html");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.xpath("/html/body/input[1]"));
		e1.sendKeys("Ritesh@123");
		Thread.sleep(1000);
		WebElement e2 = driver.findElement(By.xpath("/html/body/input[2]"));
		e2.sendKeys("mother name");
		Thread.sleep(1000);
		WebElement e3 = driver.findElement(By.xpath("/html/body/input[3]"));
		e3.sendKeys("Anita@0689");
		Thread.sleep(1000);
		WebElement e4 = driver.findElement(By.xpath("/html/body/form[1]/input[1]"));
		e4.sendKeys("Ritesh");
//		WebElement e5 = driver.findElement(By.xpath("/html/body/form[1]/input[3]"));
//		e5.click();
		WebElement e6 = driver.findElement(By.xpath("/html/body/form[2]/input[1]"));
     	e6.click();
     	WebElement e7 = driver.findElement(By.xpath("/html/body/form[2]/input[2]"));
     	e7.click();
     	WebElement e8 = driver.findElement(By.xpath("/html/body/form[2]/input[3]"));
     	e8.click();
     	WebElement e9 = driver.findElement(By.xpath("/html/body/input[4]"));
     	e9.click();
     	WebElement e10 = driver.findElement(By.xpath("/html/body/input[5]"));
     	e10.click();
     	WebElement e11 = driver.findElement(By.xpath("/html/body/input[6]"));
     	e11.click();
     	WebElement e12 = driver.findElement(By.xpath("/html/body/select"));
     	Select s1 = new Select(e12);
     	s1.selectByVisibleText("Hindu");
     	
		
		
	}

}
