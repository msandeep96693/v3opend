package ObjectPage;

import org.openqa.selenium.WebDriver;					
import org.openqa.selenium.WebElement;					
import org.openqa.selenium.support.FindBy;					
					
public class Login1Page extends CommonBase {					
					
	WebDriver driver;				
					
	public Login1Page(WebDriver driver) {				
		super(driver);			
	}				
					
					
	@FindBy(xpath = "//input[@placeholder='Enter Email']") private WebElement EmailAddress;				
	@FindBy(xpath ="//input[@placeholder='Enter Password']") private WebElement password;				
	@FindBy(xpath ="//button[.='Sign In']") private WebElement Signin;
	
					
	public void Emailfield(String Mail) {				
		EmailAddress.clear();			
		EmailAddress.sendKeys(Mail);			
	}				
					
	public void Passwordfield(String Pass) {				
		password.clear();			
		password.sendKeys(Pass);			
	}				
					
	public void SigninButton() {				
		Signin.click();			
	}				
					
}					
						
						


