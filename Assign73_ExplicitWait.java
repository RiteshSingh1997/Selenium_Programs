package basic_program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assign73_ExplicitWait 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebDriverWait w1 = new WebDriverWait(driver,Duration.ofSeconds(10));   //it will wait for 10 sec if condition is not matching and then it will throw timeout exception
		//w1.until(ExpectedConditions.titleIs("Google"));  //if condition is matching it will execute direvtly,it will not wait 10 sec.
		w1.until(ExpectedConditions.titleContains("Goo"));
		WebElement e1 = driver.findElement(By.name("q"));
		e1.sendKeys("India" + Keys.ENTER);
		

	}

}
