package basic_program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign30_print_attribute_values 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		List<WebElement> li = driver.findElements(By.tagName("a"));
		int count = li.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
		WebElement e1 = li.get(i);
		//String s1 = e1.getText();
		String s1 = e1.getAttribute("href");   //gives values of each href
		System.out.println(s1);
		}
	}

}
