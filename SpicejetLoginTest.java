package seleniumProject;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class SpicejetLoginTest{
	    public void SpicejetLogin(){
	
	       System.setProperty("webdriver.chrome.driver", "https://www.google.co.in/webhp\n");

	        WebDriver driver = new ChromeDriver();

	        driver.get("https://www.spicejet.com/profile/sign-in\n");

	
	       if (driver.findElement(By.id("q")) != null) {
	         driver.findElement(By.id("cookiePolicyPopup")).click();


	        driver.findElement(By.id("login<div>")).click();

	
	        driver.switchto().frame("modal_window");
	        driver.findElement(By.id("user-mobileno-input-box")).sendKeys("kittu@gmail.com");
	        driver.findElement(By.id("password-input-box-cta")).sendKeys("7207201129");

	        driver.findElement(By.id("login-cta")).click();

	
	
	        driver.switchTo().defaultContent();

	
	 driver.quit();
	    }
	    }
	}

S
