package basic_program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign13_Amazon_Dropdown_book_powerofminds {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.id("searchDropdownBox"));
		e1.click();
		Select s1 = new Select(e1);
		//s1.selectByIndex(10);
		//s1.selectByValue("search.alias=stripbooks");
		s1.selectByVisibleText("Books");
		WebElement e2 = driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']"));
		e2.sendKeys("Powerofminds");
		e2.sendKeys(Keys.ENTER);		
	}

}
