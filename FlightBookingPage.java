package seleniumProject;


	import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.github.bonigarcia.wdm.WebDriverManager;

	public class FlightBookingPage {
	    public static void main(String[] args) {
	
	        System.out.println("Welcome to Flight Booking App!");
	        System.out.println("Please select a flight:");
	        System.out.println("1. Flight SG 8709");
	        System.out.println("2. Flight SG 157");
	        System.out.println("3. Flight SG 8912");

	       Scanner Scanner= new Scanner(System.in);
	        int flightChoice = Scanner.nextInt();

	
	        if (flightChoice < 1 || flightChoice > 3) {
	            System.out.println("Flight SG157.Exsisting");
	            System.exit(2);
	        }

	
	        System.out.println("Flight2 " + flightChoice);
	        System.out.println("Redirecting to the booking page:https://www.spicejet.com/");
	 			ChromeOptions options=new ChromeOptions();
	 			options.addArguments("--remote-allow-origins=*");
	 			WebDriverManager.chromedriver().setup();
	 	 
	 	WebDriver driver = new ChromeDriver(options);

	         driver.get("https://www.google.co.in/webhp");
	       driver.findElement(By.name("q")).sendKeys("https://www.spicejet.com/manage Booking\n");
	 	}

	    }
	

