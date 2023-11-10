package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import page.Homepage;

public class Tc002_Login extends ProjectSpecification{
	
	
	@BeforeTest
	public void setup() {
		
		Excelfile="Login";
	}	
	@Test(priority = 2,dataProvider = "getdata")
	public  void login(String mail,String pass) throws InterruptedException {
		
		
		new Homepage(driver)
		.clicklogin()
		.mail(mail)
		.password(pass)
		.loginclick();
	}
	

}
