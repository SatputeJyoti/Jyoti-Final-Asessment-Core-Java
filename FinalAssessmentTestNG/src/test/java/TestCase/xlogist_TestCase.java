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
import PO.PO_xlogist;
import Utility.BrowserManager;


	
	 public class xlogist_TestCase { 
		WebDriver driver;
		JSONObject jsonData;
		
		@BeforeClass
		public void beforeClass() throws Exception {
			InputStream datais= null;
			
			try {
				String fileName = "data/xlogist.json";
				datais = getClass().getClassLoader().getResourceAsStream(fileName);
				JSONTokener tokener = new JSONTokener(datais);
				jsonData = new JSONObject(tokener);
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				if(datais != null) {
					datais.close();
				}
			}
		}
		
		@BeforeMethod
		@Parameters({"browser","url"})
		public void setup(String browser, String url) throws InterruptedException
		{
				driver = BrowserManager.getDriver(browser);
				Thread.sleep(1000);
				driver.get(url);
				Thread.sleep(1000);
				driver.manage().window().maximize();
				Thread.sleep(1000);
				driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
				Thread.sleep(1000);
			
		}
		
		
		@Test(priority =1)
		public void valid() {
			String username = jsonData.getJSONObject("valid").getString("username");
			String passkey = jsonData.getJSONObject("valid").getString("passkey");
			String enterCouponCode = jsonData.getJSONObject("valid").getString("enterCouponCode"); 
			PO_xlogist obj = PageFactory.initElements(driver, PO_xlogist.class);
			obj.valid(username, passkey ,enterCouponCode);
		}
		
		@Test(priority =2)
		public void invalid() {
			String username = jsonData.getJSONObject("invalid").getString("username");
			String passkey = jsonData.getJSONObject("invalid").getString("passkey");
			String enterCouponCode = jsonData.getJSONObject("invalid").getString("enterCouponCode"); 
			PO_xlogist obj = PageFactory.initElements(driver, PO_xlogist.class);
			obj.invalid(username, passkey ,enterCouponCode);
		}
		@Test(priority =3)
		public void Blank() {
			String username = jsonData.getJSONObject("Blank").getString("username");
			String passkey = jsonData.getJSONObject("Blank").getString("passkey");
			String enterCouponCode = jsonData.getJSONObject("Blank").getString("enterCouponCode"); 
			PO_xlogist obj = PageFactory.initElements(driver, PO_xlogist.class);
			obj.Blank(username, passkey ,enterCouponCode);
		}
		@Test(priority =4)
		public void asstringwithspaces() {
			String username = jsonData.getJSONObject("asstringwithspaces").getString("username");
			String passkey = jsonData.getJSONObject("asstringwithspaces").getString("passkey");
			String enterCouponCode = jsonData.getJSONObject("asstringwithspaces").getString("enterCouponCode"); 
			PO_xlogist obj = PageFactory.initElements(driver, PO_xlogist.class);
			obj.asstringwithspaces(username, passkey ,enterCouponCode);
		}
		@Test(priority =5)
		public void asinterger() {
			String username = jsonData.getJSONObject("asinterger").getString("username");
			String passkey = jsonData.getJSONObject("asinterger").getString("passkey");
			String enterCouponCode = jsonData.getJSONObject("asinterger").getString("enterCouponCode"); 
			PO_xlogist obj = PageFactory.initElements(driver, PO_xlogist.class);
			obj.asinterger(username, passkey ,enterCouponCode);
		}
		
		@Test(priority =6)
		public void specialsymbol() {
			String username = jsonData.getJSONObject("specialsymbol").getString("username");
			String passkey = jsonData.getJSONObject("specialsymbol").getString("passkey");
			String enterCouponCode = jsonData.getJSONObject("specialsymbol").getString("enterCouponCode"); 
			PO_xlogist obj = PageFactory.initElements(driver, PO_xlogist.class);
			obj.specialsymbol(username, passkey ,enterCouponCode);
		}
		@Test(priority =7)
		public void Maximumchar() {
			String username = jsonData.getJSONObject("Maximumchar").getString("username");
			String passkey = jsonData.getJSONObject("Maximumchar").getString("passkey");
			String enterCouponCode = jsonData.getJSONObject("Maximumchar").getString("enterCouponCode"); 
			PO_xlogist obj = PageFactory.initElements(driver, PO_xlogist.class);
			obj.Maximumchar(username, passkey ,enterCouponCode);
		}
	@AfterMethod
	public void StopTest() {
		
	}
	
	@AfterClass
	public void stopReport() {
		
	}
	 
	 } 
	 
	 
	 
	 
	 
	 
		
		
		
