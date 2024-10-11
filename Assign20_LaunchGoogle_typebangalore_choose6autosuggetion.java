package Basic_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign20_LaunchGoogle_typebangalore_choose6autosuggetion {

	public static void main(String[] args) throws InterruptedException 
	{

		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");		
        driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.name("q"));
	    e1.sendKeys("bangalore");
	    Thread.sleep(1000);
	    List <WebElement> li = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
	    int count = li.size();
	    System.out.println(count);
	    Thread.sleep(5000);
	    //li.get(5).click();
        li.get(count-1).click();
	}

}
