package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {

	WebDriver driver;
	
	@Given("I want to Launch the browser")
	public void i_want_to_launch_the_browser() 
	{
	   driver = new FirefoxDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Given("Load the URL")
	public void load_the_url() 
	{
	   driver.get("https://www.saucedemo.com/");
	}
	
	@When("Login page is displayed enter the credentials")
	public void login_page_is_displayed_enter_the_credentials()
	{
	   driver.findElement(By.id("user-name")).sendKeys("standard_user");
	   driver.findElement(By.id("password")).sendKeys("secret_sauce");
	}
	
	@When("Click on login button")
	public void click_on_login_button()
	{
	    driver.findElement(By.id("login-button")).click();
	}
	
	@Then("Validate for home page")
	public void validate_for_home_page() 
	{
	String currentURL = driver.getCurrentUrl();
	if(currentURL.contains("inventory"))
	{
		System.out.println("Home page displayed");
		System.out.println(currentURL);
	}
	}
}
