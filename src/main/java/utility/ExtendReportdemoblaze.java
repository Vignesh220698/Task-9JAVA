package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportdemoblaze {
	
    public static ExtentReports getreport() {
    	
    	ExtentSparkReporter report =  new ExtentSparkReporter("./report/reports.html");
    	report.config().setReportName("WebReport");
    	report.config().setDocumentTitle("Report title");
    	
    	ExtentReports extend = new ExtentReports();
    	extend.attachReporter(report);
    	
    	return extend;
    }

}
