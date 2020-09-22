

package Automationframework;



public class Testscripts extends Mainclass {
	
	
	public static void main(String[] args) {
		testcase1();
	}
	
    public static void testcase1() {
    	//This is a sample method which will run without TestNG
    
    	Mainclass method = new Mainclass();
		Locators Loc = new Locators();
		method.launchwebapp("https://google.com");
		method.sendkeys(Loc.test, "Java Test");
		method.Gettext(Loc.signin);
		method.click(Loc.signin);
		//method.sendkeys(Loc.username, "sunkarj@carcgl.com");
		//method.click(Loc.Submit);
		//method.sendkeys(Loc.Password, "Password@123");
		//method.click(Loc.Submit);
		//method.click(Loc.Loctest);
		//method.sendkeys(Loc.test, "Test");
		//String Actual = method.Gettext(Loc.signin);
		//String expected = "sign in";
		
		
	}
}
