package PO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



import com.relevantcodes.extentreports.LogStatus;
import Utility.ExtentReportManager;

public class PO_Ecommerceupdate {
	

	WebDriver driver;
	
	public PO_Ecommerceupdate(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	@FindBy(how = How.XPATH, using = "//input[@id = 'username']")
	WebElement SignInEmail;
	
	@FindBy(how = How.XPATH, using = "//input[@id = 'password']")
	WebElement SignInPassword;
	
	@FindBy(how = How.XPATH, using = "//form/button")
	WebElement SignInBtn;
	
	
	public void ValidSignIn(String email,String password) {
		SignInEmail.sendKeys(email);
		ExtentReportManager.extentTest.log(LogStatus.INFO, "Entered email:"+email);
		SignInPassword.sendKeys(password);
		ExtentReportManager.extentTest.log(LogStatus.INFO, "Entered pass:"+password);
		SignInBtn.click();
		ExtentReportManager.extentTest.log(LogStatus.INFO, "Clicked  Sign In:");
       try {
    	   Thread.sleep(1000);
       }catch(InterruptedException e) {
    	   e.printStackTrace();
       }
	
		
	}
	@FindBy(how = How.XPATH, using = "((//u1)[1]/li[3]")
	WebElement Product;
	@FindBy(how = How.XPATH, using = "(((//u1)[1]/li[3]/u1/li)[1]")
	WebElement CategoryTab;
	@FindBy(how = How.XPATH, using = "((//table/tbody/tr)[1]/td)[6]/a[@href='https://products.pisystindia.com/Ecommerce/admin/catergory/edit/10']")
	WebElement updateCategory;
	
	@FindBy(how = How.XPATH, using = "((//table/tbody/tr)[1]/td)[6]/a[@href='https://products.pisystindia.com/Ecommerce/admin/catergory/edit/10']")
	WebElement updateCategoryImage;
	
	@FindBy(how = How.XPATH, using = "//input[@id='category_name']")
	WebElement updateCategoryInput;
	
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	WebElement updateCategoryUpdateBtn;
	
	@FindBy(how = How.XPATH, using = "//input[@id='inputFile-2']")
	WebElement updateCategoryImageInput;
	
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	WebElement updateCategoryImageUpdateBtn;
	
	public void navigateToCategory() {
		try {
			Product.click();
			ExtentReportManager.extentTest.log(LogStatus.INFO, "Clicked On Products");
			Thread.sleep(500);
			
			CategoryTab.click();
			ExtentReportManager.extentTest.log(LogStatus.INFO, "Clicked On Category");
			Thread.sleep(500);
			
		}catch(InterruptedException e) {
	    	   e.printStackTrace();
	       }
	}
    public void UpdateCategoryName(String category) { 
			navigateToCategory();
			updateCategory.click();
			ExtentReportManager.extentTest.log(LogStatus.INFO, "Clicked On update");
		try {
			Thread.sleep(500);
		}catch(InterruptedException e) {
	    	   e.printStackTrace();
			
		}
		updateCategoryInput.clear();
		updateCategoryInput.sendKeys(category);
		ExtentReportManager.extentTest.log(LogStatus.INFO, "Enter In Category Name:"+category);
		
		updateCategoryUpdateBtn.click();
		ExtentReportManager.extentTest.log(LogStatus.INFO, "Clicked On Update");
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
	    	   e.printStackTrace();
				
		}
    }
		
		public void UpdateImage(String Image) { 
			navigateToCategory();
			updateCategoryImage.click();
			ExtentReportManager.extentTest.log(LogStatus.INFO, "Clicked On Update Image");
		
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
	    	   e.printStackTrace();
				
		}
		updateCategoryImageInput.sendKeys(Image);
		ExtentReportManager.extentTest.log(LogStatus.INFO, "Given Image:"+Image);
		updateCategoryImageUpdateBtn.click();;
		ExtentReportManager.extentTest.log(LogStatus.INFO, "Clicked On Update");
	
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
	    	   e.printStackTrace();
				
		}
	
    }
	
	

    }

