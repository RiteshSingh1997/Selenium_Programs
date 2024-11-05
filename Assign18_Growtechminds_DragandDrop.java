package Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign17_18_Growtechminds_DragandDrop {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.id("container-10"));
		WebElement e2 = driver.findElement(By.id("div2"));
		Actions a1 = new Actions(driver);
		a1.dragAndDrop(e1, e2).perform();
		Thread.sleep(3000);
		WebElement e3 = driver.findElement(By.id("div2"));
		WebElement e4 = driver.findElement(By.id("container-10"));
		Actions a2 = new Actions(driver);
		a2.dragAndDrop(e3, e4).perform();
		
	}

}
