package Flights.Flights;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Homepage1;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomepageFun {
			WebDriver 
	 driver= new ChromeDriver();
		Homepage1 pg = new Homepage1(driver);

	@Given("I want to in flight page")
	public void i_want_to_in_flight_page() {
		
		driver.get("https://phptravels.net/flights");
	}

	@And("I select the first box")
	public void i_select_the_first_box() throws InterruptedException {
		pg.scity1();
	   Thread.sleep(2000);
	   pg.scity1sendkeys();
	   Thread.sleep(2000);
	  pg.sel1reslt();
	  Thread.sleep(2000);
	  
		
		
	}

	@And("I select the second box")
	public void i_select_the_second_box() throws InterruptedException {
	pg.sel2clkfst();
	Thread.sleep(2000);
	pg.scity2sendkeys();
	Thread.sleep(2000);
	pg.select2rs();
	
	Thread.sleep(2000);
     
		
		    
	}
	@When("I select the Date")
	public void i_select_the_date() throws InterruptedException {
		pg.befor();
		Thread.sleep(2000);
		pg.datclick();
		Thread.sleep(4000);
	   pg.Monthsel(driver);
	   Thread.sleep(2000);
	   
		
	}

	@When("I select  the travellers")
	public void i_select_the_travellers() throws InterruptedException {
	    pg.travelclick();
	    Thread.sleep(2000);
	    pg.Adultclear();
	    Thread.sleep(2000);
	    pg.Adultsend();
	    Thread.sleep(2000);
	    pg.childsend();
	    Thread.sleep(2000);
	    pg.infantsend();
	    Thread.sleep(2000);
	    pg.enterkey(driver);
	    
	
	}

	@When("I search the flights")
	public void i_search_the_flights() {
		
	    
	}

	@Then("I will navigate to another page")
	public void i_will_navigate_to_another_page() throws InterruptedException {
	 pg.navigate(driver);
	}
	



}