package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pomPages.CartPage;
import pomPages.LoginPage;
import pomPages.SkillraryDemoApp;
import pomPages.SkillraryLoginPage;

public class Testcase3 extends BaseClass{
	
	@Test
	public void TC3() throws IOException {
		
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillraryDemoApp();
		
		SkillraryDemoApp sd=new SkillraryDemoApp(driver);
		driverutilities.switchingTabs(driver);
		sd.login();
		
		LoginPage lp=new LoginPage(driver);
		String uname=pdata.getpropertyData("username");
		String pwd=pdata.getpropertyData("password");
		lp.username(uname);
		lp.password(pwd);
		lp.loginbtn();
		
		CartPage cp=new CartPage(driver);
		cp.checkout();
		driverutilities.switchFrames(driver);
		//cp.appstorelink();
		String amt=pdata.getpropertyData("amount");
		cp.paymentamt(amt);
		cp.pay();
		
	}

}
