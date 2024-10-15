package Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign31_Growtechmind_RegistrationPage {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.id("fname"));
		e1.sendKeys("Ritesh");
		Thread.sleep(3000);
		WebElement e2 = driver.findElement(By.id("lname"));
		e2.sendKeys("Singh");
		Thread.sleep(3000);
		WebElement e3 = driver.findElement(By.id("email"));
		e3.sendKeys("riteshsingh0689@gmail.com");
		Thread.sleep(2000);
		WebElement e4 = driver.findElement(By.id("password"));
		e4.sendKeys("Sonali@0689");
		Thread.sleep(2000);
		WebElement e5 = driver.findElement(By.name("gender"));
		e5.click();
		Thread.sleep(2000);
		WebElement e6 = driver.findElement(By.name("Skills"));
		e6.click();
		Select s1 = new Select(e6);
		//s1.selectByValue("select1");
		s1.selectByIndex(1);
		Thread.sleep(2000);
		WebElement e11 = driver.findElement(By.name("Country"));
		e11.click();
		Select s2 = new Select(e11);
		s2.selectByValue("India");
		Thread.sleep(2000);
		WebElement e7 = driver.findElement(By.id("Present-Address"));
		e7.sendKeys("Flat no 312, 3 floor shivparvati heights rabale");
		Thread.sleep(2000);
		WebElement e8 = driver.findElement(By.id("Permanent-Address"));
		e8.sendKeys("Room no 1 shukladevi chawl nehrunagar kanjurmarg east");
		Thread.sleep(2000);
		WebElement e9 = driver.findElement(By.name("Pincode"));
		e9.sendKeys("400701");
		WebElement e10 = driver.findElement(By.id("Relegion"));
		e10.click();
		Select s3 = new Select(e10);
		s3.selectByValue("Hindu");
		WebElement e14 = driver.findElement(By.id("file"));
		e14.sendKeys("C:\\Users\\Ritesh.s\\Downloads\\SAVE_20230717_135607.jpg");
		WebElement e12 = driver.findElement(By.name("relocate"));
		e12.click();
		WebElement e13 = driver.findElement(By.name("Submit"));
		e13.click();
		
	}

}
