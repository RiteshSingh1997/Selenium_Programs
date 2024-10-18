package Basic_Programs;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assign36_Screenshot_With_wronglocation_Exception {

	public static void main(String[] args) throws IOException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		TakesScreenshot ts = driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("D:\\OneDrive - Yethi consulting Pvt Ltd\\Desktop\\TakeScreenshot\\ClassName" +Math.random()+ ".png");
		FileHandler.copy(source, destination);
		
		//wrong location so getting FileNotFoundException
		

	}

}
