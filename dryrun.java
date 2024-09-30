package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dryrun {

	public static void main(String[] args) throws InterruptedException {
		 //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Initialize WebDriver
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        // Navigate to the desired URL
	        driver.get("https://phptravels.net/flights/lhe/dxb/oneway/economy/01-10-2024/1/1/1");

	        // Create an instance of Homepage2
	        Homepage2 homepage = new Homepage2(driver);

	        // Execute methods
	    //  homepage.direct();
	        homepage.high();
	        homepage.select();

	        // Close the browser
	     //   driver.quit();
	        
		
		// TODO Auto-generated method stub
	        homepage.firstname();
	        homepage.lastname();
	        homepage.email();
	        homepage.phone();
	        homepage.address();
	        homepage.nationality();
	       
	        homepage.gender();
	        homepage.paylater();
	}
	

}
