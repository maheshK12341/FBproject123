package BaseP;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseC {
	
	public  static WebDriver driver;

	public static  void Browser_launch()
	{		
			WebDriverManager.chromedriver().setup();
			  	driver= new ChromeDriver();
				driver.get("https://www.fb.com");		

   }	
	
	public  void browser_close()
	{
		driver.close();
	}
	
	
}