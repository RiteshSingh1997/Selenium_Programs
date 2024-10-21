package Testng_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assign54_DoRegistration_multiplefields_dataprovider 
{
 @Test(dataProvider="Registration")
 public void Registration(String FirstName, String LastName, String DOB, String Gender, String Email)
 {
	 ChromeDriver driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/r.php?locale=en_GB");
	 driver.manage().window().maximize();
	 WebElement e1 = driver.findElement(By.name("firstname"));
	 e1.sendKeys(FirstName);
	 WebElement e2 = driver.findElement(By.name("lastname"));
	 e2.sendKeys(LastName);
	 WebElement e3 = driver.findElement(By.name("birthday_day"));
	 e3.sendKeys(DOB);
	 WebElement e4 = driver.findElement(By.id("sex"));
	 e4.sendKeys(Gender);
	 WebElement e6 = driver.findElement(By.name("reg_email__"));
	 e6.sendKeys(Email);
 } 
	 @DataProvider(name="Registration")
	 public Object[][] Method1()
	 {
		 Object data[][] =  new Object[10][5];
		 //1 row
		 data[0][0] = "Ritesh";
		 data[0][1] = "Singh";
		 data[0][2] = "07/07/1997";
		 data[0][3] = "Male";
		 data[0][4] = "riteshsingh@gmail.com";
		 //2row
		 data[1][0] = "Hitesh";
		 data[1][1] = "Singh";
		 data[1][2] = "07/08/1999";
		 data[1][3] = "Male";
		 data[1][4] = "Hiteshsingh@gmail.com";
		 //3 row
		 data[2][0] = "Mohini";
		 data[2][1] = "Singh";
		 data[2][2] = "07/08/1996";
		 data[2][3] = "Female";
		 data[2][4] = "Mohinisingh@gmail.com";
		 //4 row
		 data[3][0] = "Rohit";
		 data[3][1] = "Singh";
		 data[3][2] = "07/08/1995";
		 data[3][3] = "Male";
		 data[3][4] = "Rohitsingh@gmail";
		 //5 row
		 data[4][0] = "Mitesh";
		 data[4][1] = "Singh";
		 data[4][2] = "09/08/1999";
		 data[4][3] = "Male";
		 data[4][4] = "Miteshsingh@gmail.com";
		 // 6 row
		 data[5][0] = "Naresh";
		 data[5][1] = "Singh";
		 data[5][2] = "01/08/1999";
		 data[5][3] = "Male";
		 data[5][4] = "Nareshsingh@gmail.com";
		 //7 row
		 data[6][0] = "Jayesh";
		 data[6][1] = "Singh";
		 data[6][2] = "06/08/1999";
		 data[6][3] = "Male";
		 data[6][4] = "Jayeshsingh@gmail.com";
		 //8 row
		 data[7][0] = "Jitesh";
		 data[7][1] = "Singh";
		 data[7][2] = "07/08/1999";
		 data[7][3] = "Male";
		 data[7][4] = "Jiteshsingh@gmail.com";
		 // 9 row
		 data[8][0] = "Rohini";
		 data[8][1] = "Singh";
		 data[8][2] = "07/08/2000";
		 data[8][3] = "Female";
		 data[8][4] = "Rohinisingh@gmail.com";
		 //10row
		 data[9][0] = "Rohan";
		 data[9][1] = "Singh";
		 data[9][2] = "07/08/1993";
		 data[9][3] = "Male";
		 data[9][4] = "Rohansingh@gmail.com";
		 
	 	return data;
		 
	 }
	
}
