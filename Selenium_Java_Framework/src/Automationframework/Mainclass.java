
package Automationframework;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.beust.jcommander.Parameters;
import com.google.common.primitives.Chars;
//import time;

public class Mainclass {
	public String text;
	public String observed ="";
	WebDriver driver = new ChromeDriver();
	//public static void main(String[] args) {
		//Mainclass obj = new Mainclass();
		//Locators Loc = new Locators();
		//obj.launchwebapp("https://google.com");
		//obj.click(Loc.Loctest);
		//obj.sendkeys(Loc.test, "Test");
		//obj.sendkeys(Loc.test, "test");	
			
	//}
	
	public void launchwebapp(String URL) {
		//This method will help user to launch the web application
		try {
			driver.get(URL);
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	       	
		
	}
    public void click(By Locator) {
    	//this method will allow user to click on web element using locator 
    	
    	try {
    		driver.findElement(Locator).click();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	  
	}
	
	
   public void sendkeys(By Locator, String userinput) {
	 //this method will allow user to clear and enter the data on web element using locator
	   try {
		   driver.findElement(Locator).clear();
		   driver.findElement(Locator).sendKeys(userinput);
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	  
	   		
	}
   public String Gettext(By Locator) {
	   //this method will help user to get the text of a web element using the locator 
	   
	   text = driver.findElement(Locator).getText();
	   System.out.print(text);
	   return text;
	       
   }
   
   public void Isvisable(By Locator) {
	 //this method will help user to validate whether the web element is visible or not
	   try {
		   driver.findElement(Locator).isDisplayed();
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
	   
   }
   
   public void Scroll(By Locator) {
	   //This method will help driver to scrill until a web element;
	   try {
		   WebElement element = driver.findElement(Locator);
		   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
   }
   public void Wait(int time) {
	   //User defined time - standard wait 
	   try {
		driver.wait(time);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
   }
   public void switchtomframe(String framename) {
	   //This method will help driver to switch to the frame
	   try {
		   driver.switchTo().frame(framename);
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
   }
   public void driverquit() {
	   //Driver quit
	   try {
		   driver.quit();
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
	   
   }
   public void driverclose() {
	   //driver close
	   try {
		   driver.close();
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
	   
   }
   public void Rightclick(By Locator) {
	   //This method will help user to right click on a web element 
	   try {
		   Actions actions = new Actions(driver);
		   WebElement elementLocator = driver.findElement(Locator);
		   actions.contextClick(elementLocator).perform();
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
   }
   
   public void Doubleclick(By Locator) {
	 //This method will help user to double click on a web element 
	   try {
		   Actions actions = new Actions(driver);
		   WebElement elementLocator = driver.findElement(Locator);
		   actions.doubleClick(elementLocator).perform();
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }   
	   
   }
   public void switchtodefault(String framename) {
	   //Switching to the default content
	   try {
		   driver.switchTo().defaultContent();
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
   }
   public void switchtowindow(String window) {
	   //Switching to the sub window
	   try {
		   driver.switchTo().window(window);
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
   }
   public void Acceptalert(String window) {
	   //This method is to accept the alert on web application;
	   try {
		   driver.switchTo().alert().accept();
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
   }
   public void Dismissalert(String window) {
	 //This method is to dismiss the alert on web application;
	   try {
		   driver.switchTo().alert().dismiss();
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
   }
   public String Readalerttext() {
	 //This method is tor read the alert text for web application;
	   text = driver.switchTo().alert().getText();
	   System.out.print(text);
	   return text;
   }	

}
