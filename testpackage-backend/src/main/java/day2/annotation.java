package day2;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;


	public class annotation{
	
	  @Test
	  public void SearchCustomer() {
		  System.out.println("Search For customer");
	  }
	  @Test
	  public void SearchProduct() {
		  System.out.println("Product for customer");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("CSign In ");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("Sign Out");
	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("Open Test Application");
	  }
	  
	  

	  @AfterClass
	  public void afterClass() {
		  System.out.println("Close Test Application");
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("Open chrome");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("Close Chrome");
	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("chrome Set up property");
	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("Clean up all cookies");
	  }

	}
