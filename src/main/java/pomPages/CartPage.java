package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	@FindBy(xpath="//button[text()='Checkout']")
	private WebElement checkoutbtn;
	
	@FindBy(xpath="//img[@src='https://www.skillrary.com/assets/skillrary/images/app-android.png']")
	private WebElement appstore;
	
	@FindBy(id="pay")
	private WebElement paytb;
	
	@FindBy(xpath="(//button[text()='Payment'])[2]")
	private WebElement paymentbtn;
	
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void checkout() {
		checkoutbtn.click();
	}

	public void appstorelink() {
		appstore.click();
	}
	
	public void paymentamt(String amt) {
		paytb.sendKeys(amt);
	}
	
	public void pay() {
		paymentbtn.click();
	}
}
