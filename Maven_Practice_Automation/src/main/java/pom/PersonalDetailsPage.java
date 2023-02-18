package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PersonalDetailsPage {
	
	//  Variable Declaration.
	
	@FindBy(xpath="(//div[@role='radio'])[2]")   //is selected Method.
	private WebElement unmarried;
	
	
	@FindBy(xpath="//select[@formcontrolname='nationality']")
	private WebElement nationality;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement continuButton;
	
	// Constructor
	
	public void personalDetailsPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	// Methods
	
	public void clickOnRegister() throws InterruptedException {
		boolean result=unmarried.isSelected();
		System.out.println(result);
		if(result==false)
		{
			System.out.println("Unimarried is not Selected");
			Thread.sleep(2000);
			unmarried.click();
		}
		else
		{
			System.out.println("Unmarried is Selected");
		}
		
	}
	public void sendUserName() {
	
	Select t= new Select(nationality);
	t.selectByVisibleText("Afghanistan");
	}
	public void clickOnButton() {
		continuButton.click();
			
	}
		
	
	

}
