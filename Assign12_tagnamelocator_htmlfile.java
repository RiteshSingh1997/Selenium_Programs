package Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign12_tagnamelocator_htmlfile 
{

	public static void main(String[] args) 
	{ 
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Ritesh.s/Downloads/Html%20File.html");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.tagName("a"));      //tagname should be unique on that page then only it will work
		e1.click();
		

	}

}
