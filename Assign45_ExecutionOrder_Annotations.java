package Testng_Programs;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;

public class Assign45_ExecutionOrder_Annotations 
{
  @Test
  public void Login_to_Amazon()
  {
	  System.out.println("Login");
  }
  
  @AfterMethod
  public void Search_Shoe()
  {
	  System.out.println("Searching shoe");
  }
  @AfterClass
  public void select_FirstShoe()
  {
	  System.out.println("First Shoe");
  }
}
