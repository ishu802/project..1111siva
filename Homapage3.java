package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homapage3 {
	WebDriver driver;
	public Homapage3(WebDriver driver) {
		this.driver = driver;
	}

	By firstname = By.name("user[first_name]");
	By lastname = By.name("user[last_name]");
	By email = By.name("user[email]");
	By phone =  By.name("user[phone]");
	By address = By.name("user[address]");
	By nationality = By.name("user[nationality]");
	By currentcountry = By.xpath("//div[@class=\"dropdown bootstrap-select country w-100\"]");
	By gender = By.name("title_1");
	By firstname1 = By.name("first_name_1");
	By lastname1 = By.name("last_name_1");
	By nationality1 = By.name("nationality_1");
	By passport = By.name("passport_1");
    By innsuancedate = By.name("passport_issuance_month_1");
     
   /* public void invokepage1() throws InterruptedException {
    
    	driver.get("https://phptravels.net/flight/booking");
    	
    	System.out.println("invoking");
    }*/
    public void firstname() throws InterruptedException
    {
    	driver.findElement(firstname).sendKeys("siva");
    	Thread.sleep(1000);
    }
    public void lastname() throws InterruptedException
    {
    	driver.findElement(lastname).sendKeys("kumari");
    	Thread.sleep(1000);
    }
    public void email() throws InterruptedException
    {
    	driver.findElement(email).sendKeys("siva@gmail.com");
    	Thread.sleep(1000);
    }
    
    

}
