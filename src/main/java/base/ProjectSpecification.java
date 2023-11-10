package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;


import utility.UtilityClass;

public class ProjectSpecification extends UtilityClass {

	@Parameters({"url","browser"})
	@BeforeMethod

	public void browserlaunch(String url ,String browser) {

		launchbrowser( url ,browser);

	}

	@DataProvider(name="getdata")
	public Object[][] getdata() throws IOException {

		Object[][] data= readExcel(Excelfile);
		return data;
	}

	@AfterMethod
	public void close() {
		
	    closebrowser();
	}

}
