package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class SignInPage extends BasePage {
	
	@FindBy(id = "session_key-login")
	private WebElement un_one;
	
	@FindBy(id = "session_password-login")
	private WebElement pw_one;

	@FindBy(id ="btn-primary")
	private WebElement lb_one;
	
	public SignInPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void setMail( String unone)
	{
		un_one.clear();
		un_one.sendKeys(unone);
	}
	
	public void setPw(String pwone)
	{
		pw_one.sendKeys(pwone);
	}
	
	public void pressLoginButton()
	{
		lb_one.click();
	}
}
