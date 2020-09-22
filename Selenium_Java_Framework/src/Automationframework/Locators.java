package Automationframework;
import org.openqa.selenium.By;

public class Locators extends Mainclass {
	
	//User can keep all the locators here in locator class to access them anywhere from the solution 
	
	By test = (By.xpath("//*[@id='tsf']/div[2]/div[1]/div[1]/div/div[2]/input"));
    By signin = (By.name("Sign in"));
    By Loctest = (By.xpath("//*[text()='Sign in']"));
    By username = (By.id("okta-signin-username"));
    By Password = (By.id("passwordInput"));
    By Submit = (By.id("okta-signin-submit"));
    By usernameGmail = (By.id("identifierId"));
    By GmailNext = (By.xpath("//*[text()='Next']"));
    String URL = "https://google.com";

}
