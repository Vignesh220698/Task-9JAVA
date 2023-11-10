package page;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class Loginpage  extends ProjectSpecification{
	
	@FindBy(id="Email")
	WebElement mail;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Log in']")
	WebElement loginclick;
	
	public Loginpage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public Loginpage mail(String Email) {
		sendkey(mail,Email);
		return this;
	}
   public Loginpage password(String pass) {
	   sendkey(password ,pass);
	   return this;
   }
   
   public void loginclick() {
	   click(loginclick);
   }
}
