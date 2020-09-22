package Automationframework;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

public class TestNGTestcases extends Mainclass {
	Mainclass webdriver = new Mainclass();
	Locators Loc = new Locators();
	
	/*TestNG will work on below mentioned way
	 @Beforesuit - This will run once before invoking the class
	 @Beforeclass - This will run only once before ivoking test method
	 @BeforeTest - This will run only once before invoking the method
	 @BeforeMethod - this beforemethod will run every time of each @test(each test case)
	 @Test - These are Test cases 
	 @Aftermethod - this aftermethod will run every time of each @test after end of test case (each test case)
	 @Aftertest
	 @Afterclass
	 @Aftersuit
	 
	 TestNG - NG means Next generation , which will be similar to Nunit
	 */
	
	//Reports u can see on test-output folder 
	
	//need more help contact me on linkedin - Jayanth sunkari(sunkari27@gmail.com)
	

  @BeforeMethod
  public void Test() {
	  webdriver.launchwebapp(Loc.URL);
	  
  }
  @Test(priority=0) // user can set the priority of the test case @Test means it is a test case 
  public void test1() {
	  webdriver.sendkeys(Loc.test, "Testing new now");
	  String Actual = webdriver.Gettext(Loc.Loctest);
	  String Expected = "Sign in";
	  Assert.assertEquals(Actual, Expected);
  }
  @Test(priority=1)
  public void test2() {
	  webdriver.click(Loc.Loctest);
  }
  @Test(priority=2)
  public void test3() {
	  webdriver.sendkeys(Loc.usernameGmail, "Testgmail");
	  webdriver.click(Loc.GmailNext);
  }
  @AfterMethod
  public void close() {
	  //Thread.sleep(300);
	  webdriver.driverquit();
	  
  }
}
