package TestCase;

import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import PO.PO_Ecommerceupdate;

import Utility.BrowserManager;
import Utility.ExtentReportManager;

public class Ecommerce_TestCase {
	
	WebDriver driver;
	JSONObject JsonData;
	ExtentReports extentReports;
	ExtentTest extentTest;
	@BeforeClass
	public void beforeClassMethod() throws Exception {
		InputStream dataIs= null;
		
		try {
			String FileName = "Data/Ecommerce.json";
			dataIs = getClass().getClassLoader().getResourceAsStream(FileName);
			JSONTokener tokener = new JSONTokener(dataIs);
			JsonData = new JSONObject(tokener);
			System.out.println("Data:"+JsonData.toString());
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
	   ExtentReportManager.createReport("Ecommerce Update Test Report");
	}  
	 @BeforeMethod
	 @Parameters({"browser","url"})	 
	        public void beforeMethodSetup(String browser, String url ) throws Exception{
		
				driver = BrowserManager.getDriver(browser);
				Thread.sleep(1000);
				driver.get(url);
				Thread.sleep(1000);
				driver.manage().window().maximize();
				Thread.sleep(1000);
				driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
				Thread.sleep(1000);
			
		}
	  @Test(priority =0)
		public void validCouponLetters() {
		
	        ExtentReportManager.extentTest=ExtentReportManager.extentReport.startTest("Update Name And Image");
			String email = JsonData.getJSONObject("ValidSignIn").getString("Email");
			String Password = JsonData.getJSONObject("ValidSignIn").getString("Password");
			String categoryName = JsonData.getJSONObject("ValidUpdateData").getString("CategoryName"); 
			String newImage = JsonData.getJSONObject("ValidUpdateData").getString("NewImage"); 
			
			PO_Ecommerceupdate obj=PageFactory.initElements(driver, PO_Ecommerceupdate.class);
			obj.ValidSignIn(email, Password);
			obj.UpdateCategoryName(categoryName);
			obj.UpdateImage(newImage);
			
	  }
	  @AfterMethod
		public void tearDown() {
			driver.close();
			ExtentReportManager.extentReport.endTest(extentTest);
		}
		
		@AfterClass
		public void stopReport() {
		    ExtentReportManager.extentReport.flush();	
		}
		 
		 } 
		 
