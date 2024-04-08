package Hooks;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseDriver;
import Config.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Myhooks  {
	
	public WebDriver driver;
	
//	public Myhooks() {
//		super();
//	}

	@Before
	public static void setup() {
		
		BaseDriver.initialiseBrowser("chrome");
//		driver=BaseDriver.getDriver();
//		driver.get("https://v3opend.tech-active.com/auth/admin_login");
		
		
		
//		driver = new ChromeDriver();
//		driver.get("https://campaignsopend.tech-active.com/#/admin_login");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@After
	public void TearDown() {
		driver.close();
	}
}
