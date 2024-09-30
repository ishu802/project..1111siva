package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage2 {
	
	@FindBy(id="direct")
	WebElement direct;
	@FindBy(xpath="//span[normalize-space()=\"Highest to Lower\"]")
	WebElement hightolow;
	@FindBy(xpath="(//button[@type='submit'][normalize-space()='Select Flight'])[1]")
	WebElement select;
	String url = "https://phptravels.net/flights/lhe/dxb/oneway/economy/01-10-2024/1/1/1";
	
	 @FindBy(name = "user[first_name]")
	    private WebElement firstName;

	    @FindBy(name = "user[last_name]")
	    private WebElement lastName;

	    @FindBy(name = "user[email]")
	    private WebElement email;

	    @FindBy(name="user[phone]")
	    private WebElement phone;

	    @FindBy(name = "user[address]")
	    private WebElement address;

	    @FindBy(name = "user[nationality]")
	    private WebElement nationality;

	    @FindBy(xpath = "//div[@class='dropdown bootstrap-select country w-100']")
	    private WebElement currentCountry;

	    @FindBy(xpath = "//select[@class=\"form-select\"]")
	    private WebElement gender;

	    @FindBy(name = "first_name_1")
	    private WebElement firstName1;

	    @FindBy(name = "last_name_1")
	    private WebElement lastName1;

	    @FindBy(name = "nationality_1")
	    private WebElement nationality1;

	    @FindBy(name = "passport_1")
	    private WebElement passport;

	    @FindBy(name = "passport_issuance_month_1")
	    private WebElement issuanceDate;
	    @FindBy(xpath="(//input[@class=\"form-check-input mx-auto\"])[3]")
	    private WebElement paylater;

	 public Homepage2(WebDriver driver) {
	        PageFactory.initElements(driver, this); // Initialize WebElements in this page object
	    }
	 public void navigating(WebDriver driver)
	 {
		 driver.get(url);
	 }
	public void direct() throws InterruptedException
	{
		Thread.sleep(1000);
		direct.click();
		Thread.sleep(1000);
	}
	public void high() throws InterruptedException
	{
		Thread.sleep(2000);
		hightolow.click();
	}
	public void select(	) throws InterruptedException
	{
		
		Thread.sleep(1000);
		select.click();
		Thread.sleep(1000);
		//driver.getCurrentUrl();
		Thread.sleep(1000);
	}
    public void firstname()
    {
    	firstName.sendKeys("siva");
    }
    public void lastname() throws InterruptedException
    {
    	lastName.sendKeys("kumari");
    	Thread.sleep(3000);
    }
    public void email() throws InterruptedException
    {
    	email.sendKeys("siva@1234");
    	Thread.sleep(1000);
    }
    public void phone()
    {
    	phone.sendKeys("9502452778");
    }
    public void address()
    {
    	address.sendKeys("pune");
    }
    public void nationality() throws InterruptedException
    {
    	nationality.click();
    	Thread.sleep(3000);
    	nationality.sendKeys("AF");
    	Thread.sleep(1000);
    }
    public void gender() throws InterruptedException
    {
    
    	gender.click();
    	Thread.sleep(2000);
    	Select s = new Select(gender);
    	s.selectByValue("Miss");
    	
    }
    public void paylater()
    {
    	paylater.click();
    }
}
