package Testng_Programs;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assign46_Check_Execution_Order 

{   @BeforeTest
	public void login_to_Flipkart()
	{
		System.out.println("login");
	}
	@BeforeClass
	public void selectMobile()
	{
		System.out.println("Mobile");
	}
	@BeforeMethod
	public void SearchIphone16()
	{
		System.out.println("Iphone 16");
	}
	 @AfterMethod
	  public void Select_FirstPhone()
	  {
		  System.out.println("First Phone");
	  }
	
	@Test
	  public void Close_Alltabs()
	  {
		  System.out.println("Close Tabs");
	  }
//	@Test                                                        //Both @Test will have BeforeMethod and AfterMethod
//	public void quit_tabs()
//	{
//		System.out.println("Quit");
//	}
	  
}

	
	

