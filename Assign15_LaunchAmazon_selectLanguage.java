package Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign15_LaunchAmazon_selectLanguage {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.xpath("//span[@class='nav-icon nav-arrow']"));
        Actions a1 = new Actions(driver);
        a1.moveToElement(e1).perform();
        Thread.sleep(3000);
        WebElement e2 = driver.findElement(By.xpath("(//a[@class='nav-link                                    nav-item'])[3]"));
        e2.click();
    
        
	}

}
