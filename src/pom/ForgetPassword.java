package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetPassword extends BasePage {
	
	@FindBy(name = "userName")
	private WebElement forget_Mail;

	public ForgetPassword(WebDriver driver)
	{
		super.driver = driver;
		PageFactory.initElements(driver,this);
	}
}
