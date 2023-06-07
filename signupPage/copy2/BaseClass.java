package signupPage.copy2;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	File file=new File("C:\\Users\\PAVAN PULLAPALLY\\eclipse-workspace\\AUT5\\src\\test\\java\\seliniumProject\\BaseClass.java");
Properties prop =new Properties();
String url = "https://spiceclub.spicejet.com/";;
	String browser = "https://www.spicejet.com/";
	@BeforeMethod
	public void start() throws Exception {
		 FileInputStream fileInput= new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fileInput);
		browser = prop.getProperty("browser");
		url = prop.getProperty("url");
		
		 if(browser.contentEquals("chrome")) {https:
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://spiceclub.spicejet.com/signup");
	}
	else if(browser.contentEquals("edge")) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://spiceclub.spicejet.com/signup");
		
		
	}
	
		driver.manage().window().maximize();
		driver.get(url);
	}
	@AfterMethod
	public void closeUp() {
		driver.quit();
	}

}


