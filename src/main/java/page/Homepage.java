package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class Homepage  extends ProjectSpecification{
	
	
	@FindBy(xpath="//a[text()='Register']")
	WebElement register;
	
	@FindBy(xpath="//a[text()='Log in']")
	WebElement login;
	
	public Homepage(WebDriver driver) {
		this .driver=driver;
		PageFactory.initElements(driver,this);
		
	}
			
	public SignupPage clickreg() throws InterruptedException {
		//Thread.sleep(4000);
		click(register);
		return new SignupPage(driver);
	}
	
	public Loginpage clicklogin() throws InterruptedException {
		//Thread.sleep(4000);
		click(login);
		return new Loginpage(driver);
	}

}
