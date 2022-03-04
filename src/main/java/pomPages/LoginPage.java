package pomPages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {
	
	@FindBy(id="email")
	private WebElement usernametb;
	
	@FindBy(id="password")
	private WebElement passwordtb;
	
	@FindBy(id="last")
	private WebElement loginbtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void username(String username) {
		usernametb.sendKeys(username);
	}

	public void password(String password){
		passwordtb.sendKeys(password);
	}
	
	public void loginbtn() {
		loginbtn.click();
	}

}
