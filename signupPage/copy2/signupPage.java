package signupPage.copy2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signupPage extends BaseClass {



	@FindBy(xpath = "//input[@name='display-name']")
	WebElement display_name;
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	@FindBy(xpath = "//input[@name='submit-button']")
	WebElement submit;
	
	public  void SignupPage() {
		
		PageFactory.initElements(driver, this);


		public void signup(String display_name , String email , String password){
			
		this.display_name.sendKeys(display_name);
	    this.email.sendKeys(email));
		this.password.sendKeys(password);
		submit.click();
			
		}

	}

}
