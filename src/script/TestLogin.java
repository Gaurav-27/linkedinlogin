package script;


import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.LoginPage;
import pom.SignInPage;

public class TestLogin extends BaseTest {	
	String aTitle = " ";
	@Test(priority = 1)
	public void ValidLogin() throws InterruptedException {
		
		
		
		LoginPage l = new LoginPage(driver);	
		 SignInPage s = new SignInPage(driver);
		 
	
		
		
			
	    String un = Excel.getCellValue(INPUT_PATH,"TestLogin", 1, 0);
	    String pw = Excel.getCellValue(INPUT_PATH,"TestLogin", 1, 1);
	
	  
	   l.setUserName(un);
	   l.setPassword(pw);
	   l.clickLogin();
	    Thread.sleep(1000);
	  aTitle = driver.getTitle();
	  System.out.println(aTitle);
	   if(aTitle .equals("Sign In to Linkedin"))
	   {
		   String u = Excel.getCellValue(INPUT_PATH, "TestLogin", 2, 0);
		   String p = Excel.getCellValue(INPUT_PATH, "TestLogin", 2, 1);
	  
	   s.setMail(u);
	   s.setPw(p);
	   s.pressLoginButton();
	   Thread.sleep(1000);
	   
	   String uone = Excel.getCellValue(INPUT_PATH, "TestLogin", 3, 0);
	   String pone = Excel.getCellValue(INPUT_PATH, "TestLogin", 3, 1);
	   s.setMail(uone);
	   s.setPw(pone);
	   s.pressLoginButton();
	   }
	   
	}
	
	}




	

