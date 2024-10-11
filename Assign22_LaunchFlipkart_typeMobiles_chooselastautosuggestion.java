package Basic_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign22_LaunchFlipkart_typeMobiles_chooselastautosuggestion {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");		
        driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.name("q"));
	    e1.sendKeys("Mobiles");
	    Thread.sleep(1000);
	    List <WebElement> li = driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
	    int count = li.size();
	    System.out.println(count);
	    Thread.sleep(5000);
	    li.get(7).click();
        //li.get(count-1).click();

	}

}
