package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.base;
import Pages.LoginPage;
import Utility.utility;

public class LoginPageTest extends base {

	public LoginPageTest() {

		super();
	}
	/**
	 *  To Run Initialize method before running each Testcases and To Open browser	 
	 */
	
	@BeforeMethod
	public void triggerDriver() {
		try {

			utility.intilization(prop.getProperty("browser"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@SuppressWarnings("static-access")
	@Test(priority = 1)
	public void ConfigDataTest() {

		loginpage = new LoginPage();
		loginpage.LoginUser();
	}
	/**
	 * To Run Terminate method after running each Testcases
	 */
	@SuppressWarnings("static-access")
	@AfterMethod
	public void terminateDriver() {
		try {

//			Thread.sleep(4000);
			utility.closedriver();

		} catch (Exception e) {

		}
	}
}
	