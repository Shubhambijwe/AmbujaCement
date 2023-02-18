package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePageIRCTC {
	
	//  Variable Declaration.
	
	@FindBy(xpath="//a[@aria-label='Click here to register your account with I.R.C.T.C.']")
	private WebElement regiter;
	
	
	@FindBy(xpath="//input[@formcontrolname='userName']")
	private WebElement userName;
	
	@FindBy(xpath="(//input[@type='password'])[1]")
	private WebElement password;
	
	@FindBy(xpath="(//input[@type='password'])[2]")
	private WebElement confirmPassword;
	

	@FindBy(xpath="//p-dropdown[@formcontrolname='prefLang']")
	private WebElement language;
	
	

	@FindBy(xpath="(//li[@role='option'])[1]")
	private WebElement englishLanguage;
	
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement continueButton;
	
	
	// Constructor
	
	public void homePageIRCTC(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	// Methods
	
	public void clickOnRegister() {
		regiter.click();	
	}
	public void sendUserName() {
		userName.sendKeys("arjunreddy@12345");
			
	}
	public void sendPassword() {
		userName.sendKeys("Pass@12345");
			
	}
	
	public void sendConfirmPass() {
		userName.sendKeys("arjunreddy@1567");
			
	}
	
	public void clickOnLanguage() {
		language.click();
			
	}
	
	
	public void clickOnEnglishLanguage() {
		englishLanguage.click();
			
	}
	public void clickOnContinueButton() {
		continueButton.click();
			
	}
	
	
	
	
	
	
	
}

