package StepDefinitions;
	
import java.time.Duration;						
	
import org.openqa.selenium.By;						
import org.openqa.selenium.WebDriver;						
import org.openqa.selenium.chrome.ChromeDriver;							
import Base.BaseDriver;

import ObjectPage.Login1Page;
						
import io.cucumber.java.After;						
import io.cucumber.java.Before;						
import io.cucumber.java.en.*;					
	
	public class OpendLogin {						
	
	WebDriver driver;					
	Login1Page login;					
	
	@Given("user should navigate to the login page")					
	public void user_should_navigate_to_the_login_page() {	
		driver = BaseDriver.getDriver();
		login = new Login1Page(driver);
	
	System.out.println("User navigated to login page");				
	
	}					
	
	@When("user should enter valid email address {string}")					
	public void user_should_enter_valid_email_address(String email) {					
	login.Emailfield(email);				
	}					
	
	@And("user should enter valid password {string}")					
	public void user_should_enter_valid_password(String password) {					
	login.Passwordfield(password);				
	}					
	
	@And("user click on login button")					
	public void user_click_on_login_button() {					
	login.SigninButton();				
	}					
	
	@Then("user should sucessfully logged in and close the browser")					
	public void user_should_sucessfully_logged_in_and_close_the_browser() {					
	//driver.findElement(By.xpath(""));				
	System.out.println("Successfully logged in");				
	}					
	
	//@When("user should enter invalid email address {string}")					
	//public void user_should_enter_invalid_email_address(String email) {					
	//driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys(email);				
	//}					
	//
	//@And("user should enter invalid password {string}")					
	//public void user_should_enter_invalid_password(String password) {					
	//driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys(password);				
	//}					
	//
	//@Then("user should have response message as {string} and close the browser")					
	//public void user_should_have_response_message_as_and_close_the_browser(String string) {					
	////driver.findElement(By.xpath(""));				
	//System.out.println("Sucess");				
	//}					
	//
	//@Then("user should get response message as {string} and close the browser")					
	//public void user_should_get_response_message_as_and_close_the_browser(String string) {					
	////driver.findElement(By.xpath(""));				
	//System.out.println("Sucess");				
	//}					
	//
	//@When("user donot enter email address {string}")					
	//public void user_donot_enter_email_address(String email) {					
	//driver.findElement(By.xpath("//input[@placeholder='Enter Email']"));				
	//}					
	//
	//@And("user donot enter password {string}")					
	//public void user_donot_enter_password(String password) {					
	//
	//driver.findElement(By.xpath("//input[@placeholder='Enter Password']"));				
	//}					
	//
	}						
	
	
	
	
	
	
						
	
	
	
	
	
	
