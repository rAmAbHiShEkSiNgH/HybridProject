package genericLibraries;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	public PropertyFile pdata=new PropertyFile();
	//base class is extended in test cases so to use WebDriverUtilities class methods we can create object of
	//WebDriverUtilities and access it in test cases without need of creating objects in every test cases
	public WebDriverUtilities driverutilities=new WebDriverUtilities();
	
	@BeforeMethod
	public void openApp() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getpropertyData("url"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	//just before closing the application we need to take the screenshot
	//ItestResult is an interface having different methods of screenshot getStatus returns 1=pass 2=fail 3=skip
	public void closeApp(ITestResult res) throws IOException {
		int status=res.getStatus();
		String name=res.getName();
		if(status==2) {
			Screenshot s=new Screenshot();
			s.getPhoto(driver, name);
		}
		driver.quit();
	}
}
