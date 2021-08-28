package testngpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGweek7 {

	@Test
	  public void f() {
		  System.out.println("Hello 1");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("Hello 2");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("Hello 3");
	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("Hello 4");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("Hello 5");
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("Hello 6");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("Hello 7");
	  }
}
