package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import page.Homepage;

public class Tc001_Register extends ProjectSpecification {
	
	@BeforeTest
	public void setup() {
		
		Excelfile="signup";
	}
	
	@Test(priority = 1, dataProvider="getdata")
	public  void register(String firstname , String lastname,String email,String pass,String confpass) throws InterruptedException {
		
		new Homepage(driver)
		.clickreg()
		.gender()
		.Firstname(firstname)
		.LastName(lastname)
		.Email(email)
		.Password(pass)
		.ConfirmPassword(confpass)
		.Registerclick(); 
		
	}

}
