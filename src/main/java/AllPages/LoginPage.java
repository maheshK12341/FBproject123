package AllPages;

import BaseP.BaseC;
import Genericmethod.Genericmethods;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class LoginPage  extends BaseC
{	
	Genericmethods obj= new Genericmethods();
	public  WebElement Emailinput= driver.findElement(By.xpath("//input[@id='email']"));
	public  WebElement Passwordinput= driver.findElement(By.xpath("//input[@id='pass']"));
	public  WebElement Login= driver.findElement(By.xpath("//button[@name='login']"));

	public   void EnterEmailid(String Emailid)
	{
		Emailinput.sendKeys(Emailid);
	}
	
	public   void EnterPasswordID(String PasswordID)
	{
		Passwordinput.sendKeys(PasswordID);
	}
	public  void Submit_login()
	{
		
		obj.javaSCriptExecutor_click(driver, Login);
		
	}
	
//	public void Select_creditcard()
//	{
//		obj.Switch_FrameWebElement(driver, FrameElement);
//		obj.Selectby_VisibleText("CreditCard", CreditDropdownElement);
//	}
	
}
