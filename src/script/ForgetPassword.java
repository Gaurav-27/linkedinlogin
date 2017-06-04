package script;

import generic.BaseTest;
import generic.Excel;

import org.testng.annotations.Test;

import pom.ForgetPasswordPage;

public class ForgetPassword  extends BaseTest{
	
	@Test(priority = 2)
	public void testForgetPassword()
	{
		ForgetPasswordPage f = new ForgetPasswordPage(driver);
		String un = Excel.getCellValue(INPUT_PATH, "ForgetPassword", 1, 0);
		f.forgetInputField(un);
		f.clickSubmit();
	}
	

}
