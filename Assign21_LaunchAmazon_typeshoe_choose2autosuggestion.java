package Basic_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign21_LaunchAmazon_typeshoe_choose2autosuggestion {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");		
        driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
	    e1.sendKeys("shoe");
	    Thread.sleep(1000);
	    List <WebElement> li = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
	    int count = li.size();
	    System.out.println(count);
	    Thread.sleep(5000);
	    li.get(1).click(); //for second option selection


	}

}
