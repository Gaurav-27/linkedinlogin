package script;

import generic.BaseTest;
import generic.Excel;

import org.testng.annotations.Test;

import pom.ForgetPasswordPage;
import pom.LoginPage;

public class ForgetPassword  extends BaseTest{
	
	@Test(priority = 2)
	public void testForgetPassword()
	{
		ForgetPasswordPage f = new ForgetPasswordPage(driver);
		LoginPage l = new LoginPage(driver);
		String un = Excel.getCellValue(INPUT_PATH, "ForgetPassword", 1, 0);
		l.clickForgetPwd();
		f.forgetInputField(un);
		f.clickSubmit();
	}
	

}
