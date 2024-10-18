package Basic_Programs;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Assignment37_Screenshot_With_DateTime_Amazon 
{

	public static void main(String[] args) throws IOException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		Date d1 = new Date();
		Date d2 = new Date(d1.getTime());
		System.out.println(d2);
		String s1 = d2.toString();
		String s2 = s1.substring(s1.length()-4).concat("_").concat(s1.substring(4, 19));
		String s3 = s2.replace(":", "");
		String s4 = s3.replace(" ", "_");
		System.out.println(s4);
		
		TakesScreenshot ts = driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("D:\\\\OneDrive - Yethi consulting Pvt Ltd\\\\Desktop\\\\TakeScreenshot_Selenium\\\\ClassName" +s4+ ".png");
		FileHandler.copy(source, destination);
		
	}

}
