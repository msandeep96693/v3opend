package StepDefinitions;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Hooks.Myhooks;
import ObjectPage.Login1Page;
import ObjectPage.contactcreatepage;
import io.cucumber.java.en.*;						

public class createcontact  {						

		WebDriver driver;					
		Login1Page login;	
		contactcreatepage contact;
		
		@Given("The admin launches the Chrome browser")					
       public void the_admin_launches_the_chrome_browser() {					
			Myhooks.setup();
			contact = new contactcreatepage(driver);
		}					

		@And("The admin enters the URL as {string}")					
		public void the_admin_enters_the_url_as(String URL) {					
			driver.get(URL);					
		}					

		@And("The admin enters valid email as {string} and password as {string}")					
		public void the_admin_enters_valid_email_as_and_password_as(String email, String passwrd) 		          {					
			login = new Login1Page(driver);				
			login.Emailfield(email);				
			login.Passwordfield(passwrd);				
		}					

		@When("Clicks the login button")					
		public void clicks_the_login_button() {					
			login.SigninButton();
		}					
		
		@Then("The admin should be redirected to the dashboard page")					
		public void the_admin_should_be_redirected_to_the_dashboard_page() {					
			List<WebElement> sidemenu = driver.findElements(By.xpath("(//ul)[1]/li"));
			for(WebElement menu:sidemenu) {
				String nameofsidemenu=menu.getText();
				System.out.println("Name of side menu :- "+nameofsidemenu);
			}
		}					
		
		@When("click contact on Left navigation bar")					
		public void click_contact_on_left_navigation_bar() {					
			contact.leftnavigationbar();
		}					
		
		@And("click on New contact button")					
		public void click_on_new_contact_button() {					
			contact.clickonNewcontact();
		}					
		
		@Then("verify the create contact page")					
		public void verify_the_create_contact_page() {					
			contact.verifytextoncontact();
		}					
		
		
		@And("select publisher from dropdown")					
		public void select_publisher_from_dropdown() {					
							
		}					
		
		@And("Enter contact list name into textfield")					
		public void enter_contact_list_name_into_textfield() {					
		// Write code here that turns the phrase above into concrete actions					
		throw new io.cucumber.java.PendingException();					
		}					
		
		@And("select Audience type from audience type dropdown")					
		public void select_audience_type_from_audience_type_dropdown() {					
		// Write code here that turns the phrase above into concrete actions					
		throw new io.cucumber.java.PendingException();					
		}					
		
		@And("Enter CPM payout price into textfield")					
		public void enter_cpm_payout_price_into_textfield() {					
		// Write code here that turns the phrase above into concrete actions					
		throw new io.cucumber.java.PendingException();					
		}					
		
		@And("Enter Usage limit per day into textfield")					
		public void enter_usage_limit_per_day_into_textfield() {					
		// Write code here that turns the phrase above into concrete actions					
		throw new io.cucumber.java.PendingException();					
		}					
		
		@And("select permitter sector from permitter sector dropdown")					
		public void select_permitter_sector_from_permitter_sector_dropdown() {					
		// Write code here that turns the phrase above into concrete actions					
		throw new io.cucumber.java.PendingException();					
		}					
		
		@And("upload a CSV file into a field")					
		public void upload_a_csv_file_into_a_field() {					
		// Write code here that turns the phrase above into concrete actions					
		throw new io.cucumber.java.PendingException();					
		}					
		
		@And("Enter Default from name into textfield")					
		public void enter_default_from_name_into_textfield() {					
		// Write code here that turns the phrase above into concrete actions					
		throw new io.cucumber.java.PendingException();					
		}					
		
		@And("click on add button")					
		public void click_on_add_button() {					
		// Write code here that turns the phrase above into concrete actions					
		throw new io.cucumber.java.PendingException();					
		}					
		
		@Then("The admin should be redirected to the contact homepage")					
		public void the_admin_should_be_redirected_to_the_contact_homepage() {					
		// Write code here that turns the phrase above into concrete actions					
		throw new io.cucumber.java.PendingException();					
		}					
		
		@Then("verify the created contact should be present")					
		public void verify_the_created_contact_should_be_present() {					
		// Write code here that turns the phrase above into concrete actions					
		throw new io.cucumber.java.PendingException();					
		}					
		
		
		}						
