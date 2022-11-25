package StepDefinations;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
public class StepDefination {
	public WebDriver driver;
	 @Given("^Initialize the chrome driver$")
	    public void initialize_the_chrome_driver() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\OneDrive\\Desktop\\Chrome Driver\\chromedriver_win32 (2)\\chromedriver.exe");
		  driver = new ChromeDriver(); 
	    }//"webdriver.chrome.driver", "C:\\Users\\User\\OneDrive\\Desktop\\Chrome Driver\\chromedriver_win32 (2)\\chromedriver.exe"

	    @When("^user navigates to \"([^\"]*)\"$")
	    public void user_navigates_to_something(String strArg1) throws Throwable {
	       driver.get(strArg1);
	    }

	    @And("^user enter (.+)and (.+)clicks on login button$")
	    public void user_enter_and_clicks_on_login_button(String username, String password) throws Throwable {
	    	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		      driver.findElement(By.xpath("//input[@name='pw']")).sendKeys(password);
		      driver.findElement(By.xpath("//input[@id='Login']")).click();  
	    }
	    @Then("^user should be able to login$")
	    public void user_should_be_able_to_login() throws Throwable {
	     System.out.println("hello");
	    }


	
	

	}
	
	
	


	
	



