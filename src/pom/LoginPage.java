package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class LoginPage extends BasePage {
	
	@FindBy(id ="login-email")
	private WebElement username;
	
	@FindBy(id = "login-password")
	private WebElement password;
	
	@FindBy(id = "login-submit")
	private WebElement login_Button;
	
	@FindBy(id="session_password-login-error")
	private WebElement errmsg;
	
	@FindBy(linkText = "Forgot password?")
	private WebElement forgetpwd_Button;
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}
	 public void setUserName (String un)
	 {
		 
		 username.sendKeys(un); 
	 }
	 
	 public void setPassword(String pw)
	 {
		 password.sendKeys(pw);
	 }
	 
	 public void clickLogin()
	 {
		 login_Button.click();
	 }
	 
	 public void clickForgetPwd()
	 {
		 forgetpwd_Button.click();
	 }
	 
	 public void verifyErrMsgDisplayed(){
		 WebDriverWait wait = new WebDriverWait(driver,5);
		 try{
			 wait.until(ExpectedConditions.visibilityOf(errmsg));
			 Reporter.log("pass: ErrMsg is Displayed",true);
		 }
		 catch(Exception e)
		 {
			 Reporter.log("fail: ErrMsg is Not Displayed",true);
		 }

		
		 
		 
			 
		
	 }
	

}
