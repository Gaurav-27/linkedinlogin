package pom;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetPasswordPage extends BasePage {
	
	@FindBy(name = "username")
	private WebElement forget_pwd_button;
	
	@FindBy(id ="btnSubmitResetRequest")
	private WebElement submit_button;
	
	
	
	public ForgetPasswordPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}

	public void forgetInputField(String un)
	{
		forget_pwd_button.sendKeys(un);
		
	}
	
	public void clickSubmit()
	{
		submit_button.click();
		
	}
	
}
