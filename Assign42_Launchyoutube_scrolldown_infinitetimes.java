package basic_program;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign42_Launchyoutube_scrolldown_infinitetimes 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
        driver.manage().window().maximize();
        
        WebElement e1=  driver.findElement(By.xpath("//input[@name='search_query']"));
        e1.sendKeys("india" + Keys.ENTER);
          
       //using while loop for continues scrolling
        int i = 10;
        while (i>5)
        {
             
          Point p1 =      e1.getLocation();   //it is an abs method of WebElement interface
          int x=    p1.getX();               // it is Point method and help to find you the coordinate of X
          int y =   p1.getY();               // it is Point method and help to find you the coordinate of y
        
          System.out.println(x);
          System.out.println(y);

        
       
          Thread.sleep(2000);
          JavascriptExecutor js = driver;         //upcasting driver to JavascriptExecutor
          js.executeScript("window.scrollBy(0,  "+y+")"); //utilizing a method called executeScript
          System.out.println(y);
          y++;
        
        
        }
    }

}
