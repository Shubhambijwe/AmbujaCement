package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.AddressPage;
import pom.HomePageIRCTC;
import pom.PersonalDetailsPage;

public class TestClass {
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\NotePad\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		HomePageIRCTC t=new HomePageIRCTC();
		Thread.sleep(3000);
		
		t.clickOnRegister();
		
		t.sendUserName();
		Thread.sleep(3000);
		
		t.sendPassword();
		
		t.sendConfirmPass();
		Thread.sleep(3000);
		
		t.clickOnLanguage();
		
		t.clickOnEnglishLanguage();
		Thread.sleep(3000);
		t.clickOnContinueButton();
		
		PersonalDetailsPage s=new PersonalDetailsPage();
		s.clickOnButton();
		
		AddressPage p=new AddressPage();
		Thread.sleep(2000);
		p.sendBlockNo();
		p.clickOnContinue();
		
		
	}

}
