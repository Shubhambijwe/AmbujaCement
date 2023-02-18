package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddressPage {
	
	//  Variable Declaration.
	
	@FindBy(xpath="//input[@id='resAddress1']")   //is selected Method.
	private WebElement resAddress1;
	
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement submitButton;
	
	// Constructor
	
	public void addressPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	// Methods
	
	public void sendBlockNo() {
		resAddress1.sendKeys("Block-01");
		
	}
	public void clickOnContinue() {
		submitButton.click();

	}
	
}
