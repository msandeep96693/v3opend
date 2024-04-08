package ObjectPage;

import java.util.List;						

import org.openqa.selenium.WebDriver;						
import org.openqa.selenium.WebElement;						
import org.openqa.selenium.support.FindBy;						
						
import junit.framework.Assert;						
						
public class contactcreatepage extends CommonBase { 						
						
	public contactcreatepage(WebDriver driver){					
						
		super(driver);				
	}					
						
						
	@FindBy(xpath = "((//ul)[1]/li/a)[8]") private List<WebElement> contactmenu;					
	@FindBy(xpath = "(//ul)[1]/li/a") private List<WebElement> contactsidemenu;					
	@FindBy(xpath = "//button[.='New Contacts']") private WebElement newcontactbutton;					
	@FindBy(xpath = "//h1[.='Upload Contact']") private WebElement verifyuploadcontactText;	
	@FindBy(xpath = "(//ul)[1]/li") private List<WebElement> listofsidemenu;
	@FindBy(xpath = "(//select[@formcontrolname='DropdownControl'])[1]") private WebElement publisherDropdown;					
	@FindBy(xpath = "//input[@placeholder='Enter Business Name']") private WebElement contactlistname;					
	@FindBy(xpath = "//input[@placeholder='Please Select Audience Type']") private WebElement audiencetype;					
	@FindBy(xpath = "//input[@placeholder='Search']") private WebElement searchaudiencetype;					
	@FindBy(xpath = "//span[.='UK Consumer Data']") private WebElement ukconsumercheckbox;					
	@FindBy(xpath = "//button[.='Select']") private WebElement selectaudiencetypebutton;					
	@FindBy(xpath = "//input[@placeholder='Please Enter CPM payout price *']") private WebElement CPMpayoutpricefield;					
	@FindBy(xpath = "//input[@placeholder='Usage limit per day*']") private WebElement Usagelimitperdayfield;					
	@FindBy(xpath = "(//select[@formcontrolname='DropdownControl'])[2]") private WebElement countryDropdown;					
	@FindBy(xpath = "//input[@placeholder='Please Select Campaign Sub-Category']") private WebElement permittedsector;					
	@FindBy(xpath = "//label[@for='Upload File']/span/img") private WebElement uploadfilefield;					
	@FindBy(xpath = "//input[@placeholder='Enter default from name']") private WebElement defaultfromname;					
	@FindBy(xpath = "//button[.=' Add']") private WebElement Addbutton;		
	
	
						
	public void leftnavigationbar() {					
		List<WebElement> menu = contactsidemenu;				
		for(WebElement sidebar:menu) {				
			String Text = sidebar.getText();			
			if(Text.equalsIgnoreCase("Contacts")) {			
				sidebar.click();		
				break;		
			}			
		}				
	}					
						
	public void clickonNewcontact() {					
		newcontactbutton.click();				
	}					
						
	public void verifytextoncontact() {					
		WebElement uploadcontact = verifyuploadcontactText;				
		Assert.assertEquals(uploadcontact, "Upload Contact");
		System.out.println("Name of the text in contact page :-" +uploadcontact.getText());
						
	}					
						
	public void selectpublisher() {					
						
	}					
						
}						
						