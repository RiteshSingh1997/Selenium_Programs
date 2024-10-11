package Basic_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign25_LaunchFlipkart_typeMobiles_Printallautosuggestion {

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
	    Thread.sleep(3000);
	    for(int i=0;i<count;i++)
	    {
	    	 WebElement w1=li.get(i);
	    	   String str=w1.getText();
	           System.out.println(str);
	    }
	}

}
