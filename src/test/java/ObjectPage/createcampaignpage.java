package ObjectPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class createcampaignpage  extends CommonBase {
	
	WebDriver driver;
	
	public createcampaignpage(WebDriver driver) {
		super(driver);
	}

	/* ------------------- Define Campaign page ----------------------------------------*/
	
	@FindBy(xpath = "(//ul)[1]/li/a") private List<WebElement> sidemenu;	
	@FindBy(xpath = "//button[.='New Campaign']") private WebElement newcontactbutton;
	@FindBy(xpath = "(//select[@formcontrolname='DropdownControl'])[1]") private WebElement Advertiserdrop;
	@FindBy(xpath = "(//input[@placeholder='Max 100 Characters'])[1]") private WebElement campaignName;
	@FindBy(xpath = "(//select[@formcontrolname='DropdownControl'])[2]") private WebElement campaignGroupDrop;
	@FindBy(xpath = "(//input[@formcontrolname='radio'])[3]") private WebElement advertiserFreeCostType;
	@FindBy(xpath = "(//input[@formcontrolname='radio'])[4]") private WebElement advertiserPaidCostType;
	@FindBy(xpath = "(//select[@formcontrolname='DropdownControl'])[3]") private WebElement countryDrop;
	@FindBy(xpath = "(//select[@formcontrolname='DropdownControl'])[4]") private WebElement audiencetypeDrop;
	@FindBy(xpath = "//input[@placeholder='Select Campaign Sector']") private WebElement campaignsector;
	@FindBy(xpath = "//input[@placeholder='Search']") private WebElement searchcampaignsector;
	@FindBy(xpath = "//label[.='Select All']") private WebElement selectallcheckbox;
	@FindBy(xpath = "//button[.='Select']") private WebElement selectbutton;
	@FindBy(xpath = "//input[@placeholder='Select Publisher']") private WebElement publisher;
	@FindBy(xpath = "//input[@placeholder='Search']") private WebElement searchpublisher;
	@FindBy(xpath = "//label[.='Select All']") private WebElement selectallcheckbox1;
	@FindBy(xpath = "//button[.='Select']") private WebElement selectbutton1;
	@FindBy(xpath = "(//input[@formcontrolname='radio'])[8]") private WebElement publisherFreeCostType;
	@FindBy(xpath = "(//input[@formcontrolname='radio'])[9]") private WebElement publisherPaidCostType;
	@FindBy(xpath = "//input[@placeholder='Select Suppression List']") private WebElement suppressionList;
	@FindBy(xpath = "//input[@placeholder='Search']") private WebElement searchsuppression;
	@FindBy(xpath = "//label[.='Select All']") private WebElement selectallcheckbox2;
	@FindBy(xpath = "//button[.='Select']") private WebElement selectbutton2;
	@FindBy(xpath = "//button[.=' Proceed ']") private WebElement proceedbutton;
	
	
	/*---------------------------Define Template -----------------------------------*/
	
	
	
	
	
	
	
	
	public void leftnavigationbar() {					
		List<WebElement> menu = sidemenu;				
		for(WebElement sidebar:menu) {				
			String Text = sidebar.getText();			
			if(Text.equalsIgnoreCase("Campaigns")) {			
				sidebar.click();		
				break;		
			}			
		}				
	}			
	
	public void clickNewcampaign() {
		newcontactbutton.click();
	}
	
	public void advertiserDropdown() {
		Select sel = new Select(Advertiserdrop);
		sel.deselectByVisibleText("Known ltd(lukefairbrass36@hotmail.com) ");
		List<WebElement> listofOptions = sel.getOptions();
		for(WebElement option:listofOptions) {
			String text = option.getText();
			if(text.equals("Known ltd(lukefairbrass36@hotmail.com) ")) {
				System.out.println("Selected Advertiser is Correct");
			}
		}
	}
	
	public void EntercampaignNameintofield() {
		campaignName.sendKeys("Create campaign");
	}
	
	public void campaigngroupDropdown() {
		Select sel1 = new Select(campaignGroupDrop);
		sel1.selectByVisibleText("Default ");
	}
	
	
}
