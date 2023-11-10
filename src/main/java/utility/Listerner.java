package utility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.ProjectSpecification;

public class Listerner extends ProjectSpecification   implements ITestListener {

	
	ExtentTest Test;
	ExtentReports extents=ExtendReportdemoblaze.getreport();
	      
	
	
	public void onTestStart(ITestResult result) {
		Test=extents.createTest(result.getMethod().getMethodName());
	
		System.out.println("Test Start");
		
	}

	public void onTestSuccess(ITestResult result) {
		Test.log(Status.PASS, "Testpass");
		String filepath= null;
		try {
			filepath= getScreenshot(result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		Test.addScreenCaptureFromPath(filepath,result.getMethod().getMethodName());
		
		
	}
	public void onTestFailure(ITestResult result) {
		Test.fail(result.getThrowable());
		System.out.println("Test fail");
		
			
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test Skip");
		

	}

	public void onFinish(ITestContext context) {
		extents.flush();
		
	}
	
	

}
