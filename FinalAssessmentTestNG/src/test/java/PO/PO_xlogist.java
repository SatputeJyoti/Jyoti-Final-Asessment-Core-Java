package PO;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
	


	public class PO_xlogist {
		WebDriver driver;
		
		public PO_xlogist(WebDriver driver) {
			
			this.driver = driver;
		}
		
		
		@FindBy(how = How.XPATH, using = "//input[@ id='useremail']")
		WebElement Email_address;
		public void Emailaddress(String username) {
			Email_address.sendKeys(username);
			
		}
		
		@FindBy(how = How.XPATH, using = "//input[@ id='password']")
		WebElement Password;
		public void password(String passkey) {
			Password.sendKeys(passkey);
			

		}
		
		@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary btn-flat m-b-30 m-t-30']")
		WebElement SigninButton;
		public void pressSigninButton() {
			SigninButton.click();
			

		}
		
		@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/ul/li[8]/a")
		WebElement clickoncoupon;
		public void clickcoupon() {
			clickoncoupon.click();
			
		}
			
		@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a")
		WebElement clickaddcoupon;
		public void clickonaddcoupon() {
			clickaddcoupon.click();
			
		}
		@FindBy(how = How.XPATH, using = "//input[@id='coupon_name']")
		WebElement EnterCouponCode;
		public void enterCouponCode(String code) {
			EnterCouponCode.sendKeys(code);
			

		}
		
			
		@FindBy(how = How.XPATH, using = "//*[@id=\"addcategory\"]/div/div[2]/div/div/button")
		WebElement clickadd;
		public void clickonadd() {
			clickadd.click();
		}

		public void valid(String username , String passkey,String code) {
			try {
	
	        Emailaddress(username);
			password(passkey);
			pressSigninButton();
			clickcoupon();
			clickonaddcoupon();
			enterCouponCode(code);
			clickonadd();
			Thread.sleep(2000);
		}catch(Exception e )
			{
	          e.printStackTrace();
		    }

}
	
		public void invalid(String username , String passkey,String code) {
			try {
	
	        Emailaddress(username);
			password(passkey);
			pressSigninButton();
			clickcoupon();
			clickonaddcoupon();
			enterCouponCode(code);
			clickonadd();
			Thread.sleep(2000);
		}catch(Exception e )
			{
	          e.printStackTrace();
		    }

}
		public void Blank(String username , String passkey,String code) {
			try {
	
	        Emailaddress(username);
			password(passkey);
			pressSigninButton();
			clickcoupon();
			clickonaddcoupon();
			enterCouponCode(code);
			clickonadd();
			Thread.sleep(2000);
		}catch(Exception e )
			{
	          e.printStackTrace();
		    }

}
		public void asstringwithspaces(String username , String passkey,String code) {
			try {
	
	        Emailaddress(username);
			password(passkey);
			pressSigninButton();
			clickcoupon();
			clickonaddcoupon();
			enterCouponCode(code);
			clickonadd();
			Thread.sleep(2000);
		}catch(Exception e )
			{
	          e.printStackTrace();
		    }

}
		public void asinterger(String username , String passkey,String code) {
			try {
	
	        Emailaddress(username);
			password(passkey);
			pressSigninButton();
			clickcoupon();
			clickonaddcoupon();
			enterCouponCode(code);
			clickonadd();
			Thread.sleep(2000);
		}catch(Exception e )
			{
	          e.printStackTrace();
		    }

}
		public void specialsymbol(String username , String passkey,String code) {
			try {
	
	        Emailaddress(username);
			password(passkey);
			pressSigninButton();
			clickcoupon();
			clickonaddcoupon();
			enterCouponCode(code);
			clickonadd();
			Thread.sleep(2000);
		}catch(Exception e )
			{
	          e.printStackTrace();
		    }

}
		public void Maximumchar(String username , String passkey,String code) {
			try {
	
	        Emailaddress(username);
			password(passkey);
			pressSigninButton();
			clickcoupon();
			clickonaddcoupon();
			enterCouponCode(code);
			clickonadd();
			Thread.sleep(2000);
		}catch(Exception e )
			{
	          e.printStackTrace();
		    }

}
	
	
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	