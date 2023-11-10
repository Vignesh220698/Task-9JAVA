package utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class UtilityClass {
	
	public static WebDriver driver;
	public String Excelfile; 
	
	public void launchbrowser(String url ,String browser) {
		
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver(option);
		}else if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);

		
	}
	
	public void closebrowser() {
		driver.close();
	}
	
         public static Object[][] readExcel(String Excelfile) throws IOException {
		
		
		XSSFWorkbook book= new XSSFWorkbook("C:\\Users\\VIJAYAKUMAR P\\eclipse-workspace\\SeleniumGuvi\\FirstExcelafile.xlsx");
        XSSFSheet sheet = book.getSheet(Excelfile);
        
        int rowcount= sheet.getLastRowNum();
        
        int colcount = sheet.getRow(0).getLastCellNum();
        
        
        Object[][] data= new Object[rowcount][colcount];
        
        
        for(int i=1;i<=rowcount;i++) {
        	XSSFRow row = sheet.getRow(i);
        	 
        	for(int j=0;j<colcount;j++) {
        		XSSFCell cell= row.getCell(j);
        		
        		
        		data[i-1][j] = cell.getStringCellValue();
        		System.out.println(cell.getStringCellValue());
        	}        	
        }
        book.close();
		return data;       
	}
         
         public void click(WebElement element) {
        	 element.click();
         }
         
         public void sendkey(WebElement element,String value) {
        	 
        	 element.sendKeys(value);
        	 
         }
         
         public String getScreenshot(String Testmethodname) throws IOException {
        	 
        	 String path="./screenshot"+Testmethodname+".png";
        	 TakesScreenshot ss = ((TakesScreenshot) driver);
   		  File source= ss.getScreenshotAs(OutputType.FILE);
   		  File dest = new File(path);
   		  FileUtils.copyFile(source, dest);
   		  return path;
   		  
   		  
   		  
         }

	
		
	
}
