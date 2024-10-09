package basic_program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign5_Searching_on_youtube_by_id 

{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("search_query")).sendKeys("growtechminds");
		 driver.findElement(By.id("search-icon-legacy")).click();
	}

}
