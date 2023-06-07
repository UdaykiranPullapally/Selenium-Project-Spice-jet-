package testcase.copy;

import org.testng.Assert;
import org.testng.annotations.Test;

import signupPage.BaseClass;
import signupPage.signupPage;

public class SignUpTestCase extends BaseClass {

	@Test
public void tc001_validate_Signup_Flow() {
	signupPage  sp = new signupPage();
	sp.signupPage("uday", "udaykiran.1129@gmail.com","test@1129");
	
	Assert.assertEquals("HomePage",driver.getTitle());
	
	}
	}

