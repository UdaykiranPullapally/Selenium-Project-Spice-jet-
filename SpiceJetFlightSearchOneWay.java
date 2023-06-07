package seleniumProject;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class SpiceJetFlightSearchOneWay {
	    public static void main(String[] args) {

	        System.setProperty("webdriver.chrome.driver", ": C:\\Users\\PAVAN PULLAPALLY\\eclipse-workspace\\AUT5\\: C:\\AUT5\\src\\test\\java\\seleniumProject\\SpiceJetFlightSearch.java");

	
	        WebDriver driver = new ChromeDriver();

	
	        driver.get("https://www.spicejet.com/");

	
	        if (driver.findElement(By.id("cookiePolicyPopup")) != null) {
	        driver.findElement(By.id("cookiePolicyPopup")).click();
	        }


	        driver.findElement(By.id("one-way-radio-button")).click();

	
	        driver.findElement(By.id("to-testID-origin")).click();
	        driver.findElement(By.xpath("//a[text()='Delhi (DEL)']")).click();


	        driver.findElement(By.id("to-testID-destination\"")).click();
	        driver.findElement(By.xpath("//a[text()='Mumbai (BOM)']")).click();


	        driver.findElement(By.id("departure-date-dropdown-label-test-id")).click();
	        driver.findElement(By.xpath("//div[contains(@class,'ui-datepicker-group-first')]//a[text()='1']")).click();

	        driver.findElement(By.id("home-page-flight-cta")).click();

	        
	        driver.quit();
	    }
	
	}

