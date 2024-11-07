package Execution;

import org.openqa.selenium.WebDriver;

import AllPages.LoginPage;
import BaseP.BaseC;

public class TC01_login  
{
	public static void main(String[] args) {		
			BaseC.Browser_launch();			
			LoginPage lp=new LoginPage();	
			lp.EnterEmailid("Naresh@gmail.com");
			lp.EnterPasswordID("P22322");
			lp.Submit_login();			

		}

}
