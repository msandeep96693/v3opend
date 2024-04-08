package StepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Hooks.Myhooks;
import ObjectPage.Login1Page;
import ObjectPage.createcampaignpage;
import io.cucumber.java.en.*;

public class Creationcampaign {
	
	WebDriver driver;
	Login1Page login;
	createcampaignpage campaign;
	
	
	@Given("Admin navigate to the opend application")
	public void admin_navigate_to_the_opend_application() {
		Myhooks.setup();
		login = new Login1Page(driver);
		campaign = new createcampaignpage(driver);
	}

	@When("Admin Enter url as {string}")
	public void admin_enter_url_as(String URL) {
	    driver.get(URL);
	}

	@And("Admin Enter email address {string} and password {string}")
	public void admin_enter_email_address_and_password(String email, String passwrd) {
		login.Emailfield(email);
		login.Passwordfield(passwrd);
	    
	}

	@And("click on login button")
	public void click_on_login_button() {
	    login.SigninButton();
	}

	@Then("admin should be redirected to the dashboard page")
	public void admin_should_be_redirected_to_the_dashboard_page() {
		List<WebElement> sidemenu = driver.findElements(By.xpath("(//ul)[1]/li"));
		for(WebElement menu:sidemenu) {
			String nameofsidemenu=menu.getText();
			System.out.println("Name of side menu :- "+nameofsidemenu);
		}
	  
	}

	@When("click on campaign from left navigation bar")
	public void click_on_campaign_from_left_navigation_bar() {
	    campaign.Leftnavigationbar();
	}

	@And("scroll the page into downward direction")
	public void scroll_the_page_into_downward_direction() {
	   
	}

	@And("click on advertiser from advertiser dropdown")
	public void click_on_advertiser_from_advertiser_dropdown() {
	    
	}

	@And("Enter a campaign name")
	public void enter_a_campaign_name() {
	    
	}

	@And("select a campaign group")
	public void select_a_campaign_group() {
	   
	}

	@And("select a advertiser cost type radio button")
	public void select_a_advertiser_cost_type_radio_button() {
	    
	}

	@And("select a country from campaign country dropdown")
	public void select_a_country_from_campaign_country_dropdown() {
	    
	}

	@And("select a audience type from audience type dropdown")
	public void select_a_audience_type_from_audience_type_dropdown() {
	  
	}

	@And("select a campaign sector from campaign sector dropdown")
	public void select_a_campaign_sector_from_campaign_sector_dropdown() {
	   
	}

	@And("select a publisher from publisher dropdown")
	public void select_a_publisher_from_publisher_dropdown() {
	    
	}

	@And("select a publisher cost type radio button")
	public void select_a_publisher_cost_type_radio_button() {
	   
	}

	@And("select a suppression from suppression dropdown")
	public void select_a_suppression_from_suppression_dropdown() {
	    
	}

	@And("click on proceed button for next page")
	public void click_on_proceed_button_for_next_page() {
	   
	}

	@Then("validate the second page by Name of a page")
	public void validate_the_second_page_by_name_of_a_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Enter name into subject textfield")
	public void enter_name_into_subject_textfield() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("scroll the page1")
	public void scroll_the_page1() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("Enter name into preheader textfield")
	public void enter_name_into_preheader_textfield() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("scroll the page2")
	public void scroll_the_page2() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("click on creative button")
	public void click_on_creative_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("wait and select first template from a list and wait")
	public void wait_and_select_first_template_from_a_list_and_wait() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("scroll the page3")
	public void scroll_the_page3() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("click on save creative checkbox")
	public void click_on_save_creative_checkbox() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("select group from creative group dropdown")
	public void select_group_from_creative_group_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("Enter creative name")
	public void enter_creative_name() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("click on next button")
	public void click_on_next_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should validate the third page by name of a page")
	public void admin_should_validate_the_third_page_by_name_of_a_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("scroll the page into upward direction")
	public void scroll_the_page_into_upward_direction() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("Enter min age as {int}")
	public void enter_min_age_as(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("Enter max ae as {int}")
	public void enter_max_ae_as(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("select location from location dropdown")
	public void select_location_from_location_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("select region from region dropdown")
	public void select_region_from_region_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("select email domains randomly")
	public void select_email_domains_randomly() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("select include email domain from dropdown")
	public void select_include_email_domain_from_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("select advance option randomly")
	public void select_advance_option_randomly() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("select email status dropdown")
	public void select_email_status_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("click and select month, year and day \\({int} days)")
	public void click_and_select_month_year_and_day_days(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("fetch the CPM Cost, Age group, Gender")
	public void fetch_the_cpm_cost_age_group_gender() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("clikc on Next button")
	public void clikc_on_next_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("validate the fourth page by name of a page")
	public void validate_the_fourth_page_by_name_of_a_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("wait initially")
	public void wait_initially() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Enter open data into textfield")
	public void enter_open_data_into_textfield() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("Enter other data into textfield")
	public void enter_other_data_into_textfield() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("select a email deliverability")
	public void select_a_email_deliverability() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("select a Email scheduling")
	public void select_a_email_scheduling() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("select a start date and end date")
	public void select_a_start_date_and_end_date() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("select a start time")
	public void select_a_start_time() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("select a selected days checkbox")
	public void select_a_selected_days_checkbox() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("click on Start campaign or scheduled campaign")
	public void click_on_start_campaign_or_scheduled_campaign() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should verify the response message")
	public void admin_should_verify_the_response_message() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("click on admin person")
	public void click_on_admin_person() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("click on logout and close the browser")
	public void click_on_logout_and_close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
