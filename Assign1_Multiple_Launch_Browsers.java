package basic_program;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Assign1_Multiple_Launch_Browsers 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		FirefoxDriver driver1=new FirefoxDriver();
		EdgeDriver driver2=new EdgeDriver();
		SafariDriver driver3=new SafariDriver();
		InternetExplorerDriver driver4=new InternetExplorerDriver();
	}

}
