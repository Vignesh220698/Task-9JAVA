package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class SignupPage extends ProjectSpecification {
	
	@FindBy(id="gender-male")
	WebElement gender;
	
	@FindBy(id="FirstName")
	WebElement FirstName;
	
	@FindBy(id="LastName")
	WebElement LastName;
	
	@FindBy(id="Email")
	WebElement Email;
	
	@FindBy(id="Password")
	WebElement Password;
	
	@FindBy(id="ConfirmPassword")
	WebElement ConfirmPassword;
	
	
	@FindBy(id="register-button")
	WebElement Registerbutton;
		
	public SignupPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public SignupPage gender() {
		
		click(gender);
		return this ;
	}
   public SignupPage Firstname(String firstname) {
	   sendkey(FirstName,firstname);
	   return this ;
   }
   
   public SignupPage LastName(String lastname) {
	   sendkey(LastName,lastname);
	   return this ;
   }
   
   public SignupPage Email(String email) {
	   sendkey(Email,email);
	   return this ;
   }
   
   public SignupPage Password(String pass) {
	   sendkey(Password,pass);
	   return this ;
   }
   
   public SignupPage ConfirmPassword(String confpass) {
	   sendkey(ConfirmPassword,confpass);
	   return this ;
   }
   
   public SignupPage Registerclick() {
	   click(Registerbutton);
	   return this ;
   }
   
}
