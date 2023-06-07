package seleniumProject;


	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class SeleniumProject {
		@Test
       public void testcase() {
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
	 
	WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.google.co.in/webhp");
      driver.findElement(By.name("q")).sendKeys("(https://www.spicejet.com/\n)");
	    }
	}

