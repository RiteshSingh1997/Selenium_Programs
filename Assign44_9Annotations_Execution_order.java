package Testng_Programs;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
public class Assign44_9Annotations_Execution_order 

{
	@Test
	public void Testcase1_Amazon_HomePage()
	{
		System.out.println("Home Page");
	}
	
	@BeforeSuite
	public void Testcase2_SearchShoe()
	{
		System.out.println("SearchingShoe");
	}
	
	@AfterSuite
	public void Testcase3_Addtocart()
	{
		System.out.println(" Add to cart");
	}
	@BeforeMethod
	public void Testcase4_Addtowishlist()
	{
		System.out.println("Add to wishlist");
	}
	@AfterMethod
	public void Testcase5_BuyButton()
	{
		System.out.println("Click Buy");
	}
	@BeforeClass
	public void Testcase6_AddAddress()
	{
		System.out.println("Address");
	}
	@AfterClass
	public void Testcase7_PaymentOptions()
	{
		System.out.println("Payment Options");
	}
	@BeforeTest
	public void Testcase8_UPI()
	{
		System.out.println("UPI");
	}
	@AfterTest
	public void Testcase9_ProceedButton()
	{
		System.out.println("ProceedButton");
	}
	
}
