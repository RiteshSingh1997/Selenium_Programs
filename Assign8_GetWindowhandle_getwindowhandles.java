package basic_program;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assign8_GetWindowhandle_getwindowhandles 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getWindowHandle());  //to get browser id of parent tab/window
		System.out.println(driver.getWindowHandles());  //to get browser id of parent tab as well as child tab/window

	}

}
