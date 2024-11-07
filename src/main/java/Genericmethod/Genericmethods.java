package Genericmethod;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseP.BaseC;

public class Genericmethods 
{
	public void javaSCriptExecutor_click(WebDriver driver,WebElement link)
	{
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", link);	
		
	}
	
	public void Selectby_VisibleText(String CC, WebElement DropdownElement)
	{
		Select dropdown= new Select(DropdownElement);
		dropdown.selectByVisibleText(CC);
	}	
	public void  Switch_FrameWebElement(WebDriver driver,WebElement frameelement)
	{
	driver.switchTo().frame(frameelement);	
	}
	
	public static   String Takescreenshot() throws IOException
	{
		TakesScreenshot tc=((TakesScreenshot)BaseC.driver);
		File scrfile=tc.getScreenshotAs(OutputType.FILE);
		File destfile=new File("D://KPHP//"+"ScreenCaptue"+System.currentTimeMillis()+".png");
		FileUtils.copyFile(scrfile, destfile);
		String srcpath=destfile.getAbsolutePath();
		
		return srcpath;
	}
	
	
}
