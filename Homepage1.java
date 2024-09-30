package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
//Import Selenium WebDriver classes
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//Import the FindBy annotation for locating web elements
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Import other necessary Selenium support classes
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage1 {
	
	String cityName = "Mumbai";

	
	  @FindBy(xpath = "//span[@title='Select City'][1]")
	    private WebElement sel1; 
	  
	  @FindBy(xpath = "//*[@id=\"fadein\"]/span/span/span[1]/input")
	    private WebElement sel1send; 
	  
	  @FindBy(xpath = "//ul[@class='select2-results__options']/li[1]")
	    private WebElement sel1reslt;  
	 
	  
	  @FindBy(xpath = "//*[@id=\"onereturn\"]/div[2]/div[2]")
	    private WebElement sel2; 
	  
	  @FindBy(xpath = "//*[@id=\"fadein\"]/span/span/span[1]/input")
	    private WebElement sel2send; 
	  
	  @FindBy(xpath = "//ul[@class='select2-results__options']/li[1]")
	    private WebElement sel2reslt;

	  @FindBy(id = "departure")
	    private WebElement befordat;
	  
	  

	  @FindBy(xpath = "//*[@id=\"fadein\"]/div[5]/div[1]/table/thead/tr[1]/th[2]")
	    private WebElement dat;
	  
	  @FindBy(xpath = "(//span[@class='month active' and text()='Oct'])[1]")
	    private WebElement datmon;
	  
	  @FindBy(xpath = "//*[@id=\"onereturn\"]/div[4]/div")
	    private WebElement traveclk;
	  
	  
	
	  
	  
	  @FindBy(id = "fadults")
	    private WebElement adult;
	  
	  
	  @FindBy(id = "fchilds")
	    private WebElement child;
	  
	  
	  @FindBy(id ="finfant")
	    private WebElement infat;
	  

      @FindBy(id="direct")
      private WebElement Direct;
	  
	  @FindBy(xpath="(//button[@type=\"submit\"])[2]")
	  private WebElement select;
	  
	  public Homepage1(WebDriver driver) {
	        PageFactory.initElements(driver, this); // Initialize WebElements in this page object
	    }
	  
	  public void scity1(){
		  sel1.click();
	  }

	  public void scity1sendkeys(){
		  sel1send.sendKeys("BOM");;
	  }

	  public void sel1reslt(){
		  sel1reslt.click();
	  }

	  public void sel2clkfst(){
		  sel2.click();
	  }

	  public void scity2sendkeys(){
		  sel2send.sendKeys("DXB");;
	  }
	 
	  public void select2rs(){
		  sel2reslt.click();
	  }
	  
	  public void befor() {
			
		  befordat.click();
	  }
	  
	  public void datclick(){
		  dat.click();
	  }
	  
	  
	  
	  

	  public void Monthsel(WebDriver driver) throws InterruptedException{
		//  ((JavascriptExecutor) driver).executeScript("scroll(0,400);", datmon);  
		  Thread.sleep(2000);
		  datmon.click();
	  }
	  
	  
	  
	  public void travelclick() throws InterruptedException{
		  Thread.sleep(1000);
		  traveclk.click();
	  }
	  
	  public void Adultclear(){
		  adult.sendKeys(" ");
	  }	  
	  
	  
	  public void Adultsend(){
		  adult.sendKeys("");
	  }	  
	  
	  public void childsend(){
		  child.sendKeys("1");
	  }	  
	  
	  public void infantsend(){
		  infat.sendKeys("1");
	  }	  
	  


	  public void enterkey(WebDriver driver){
		 

		WebElement enter= driver.findElement(By.cssSelector("input[id=\"finfant\"]"));

		// Initialize Actions class
		Actions actions = new Actions(driver);

		// Move to the second element and perform down arrow key press followed by enter
		actions.moveToElement(enter).sendKeys(Keys.ENTER).perform();

		//driver.findElement(By.cssSelector("button[id=flights-search]")).click();	


	  }
	  public void navigate(WebDriver driver) throws InterruptedException
	  {
		   String  r = driver.getCurrentUrl();
		   System.out.println(r);
		   Thread.sleep(2000);
	  }
	  public void select()
	  {
		  select.click();
	  }
	  
	



		
		
	
}




