package basic_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign17_Drag_nd_Drop {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.id("container-10"));
		WebElement e2 = driver.findElement(By.id("div2"));
		Actions a1 = new Actions(driver);
		a1.dragAndDrop(e1, e2).perform();

	}

}
