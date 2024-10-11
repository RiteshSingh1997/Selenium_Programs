package Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign16_Hoverover_Growtechminds {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/hoverover/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.xpath("//div[@class='has_eae_slider elementor-element elementor-element-1857001 e-con-full e-flex e-con e-child']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(e1).perform();
		WebElement e2 = driver.findElement(By.xpath("//div[@class='popup4']"));
		e2.click();
		
		

		
	}

}
