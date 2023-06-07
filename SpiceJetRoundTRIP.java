package seleniumProject;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJetRoundTRIP {
  @Test
  public void f() {
		ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
	 
	WebDriver driver = new ChromeDriver(options);

     driver.get("https://www.google.co.in/webhp");
   driver.findElement(By.name("q")).sendKeys("https://www.spicejet.com/manage Booking\n");
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Welcome to Flight Search!");
    System.out.print("Enter departure city:DELHI ");
    String departureCity = scanner.nextLine();
    
    System.out.print("Enter destination city:MUMBAI ");
    String destinationCity = scanner.nextLine();
    
    System.out.print("Enter departure date (2023-06-08): ");
    String departureDate = scanner.nextLine();
    
    System.out.print("Enter return date (2023-06-14): ");
    String returnDate = scanner.nextLine();
    
   
    searchFlights(departureCity, destinationCity, departureDate, returnDate);
    
    scanner.close();
}

private static void searchFlights(String departureCity, String destinationCity, String departureDate, String returnDate) {
   
    System.out.println(" SG 8709/n");
    System.out.println("Departure City:DELHI" + departureCity);
    System.out.println("Destination City: MUMBAI" + destinationCity);
    System.out.println("Departure Date:08/06/2023" + departureDate);
    System.out.println("Return Date: 14/06/2023" + returnDate);
    
    // Example: Dummy flight results
    System.out.println("\nFlight Results:sg8710");
    System.out.println("Flight 1: Departure -08/06/2023 " + departureDate + ", Return -14/06/2023 " + returnDate);
    System.out.println("Flight 2: Departure -10/06/2023 " + departureDate + ", Return -18/06/2023 " + returnDate);
    



  }
}
