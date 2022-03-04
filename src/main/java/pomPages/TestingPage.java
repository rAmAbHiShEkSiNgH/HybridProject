package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	
	@FindBy(xpath="//img[@id='Selenium Training']")
	private WebElement seleniumcourse;
	
	@FindBy(id="Selenium Training")
	private WebElement seleniumtraining;
	
	@FindBy(id="cartArea")
	private WebElement mycart;
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[1]")
	private WebElement facebookicon;
	
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSeleniumcourse() {
		return seleniumcourse;
	}
	
	
	
	public WebElement getMycart() {
		return mycart;
	}

	public WebElement getSeleniumtraining() {
		return seleniumtraining;
	}

	public void facebook() {
		facebookicon.click();
	}

	public WebElement getFacebookicon() {
		return facebookicon;
	}
	

}
