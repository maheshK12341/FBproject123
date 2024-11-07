import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class C1 {

	public static void main(String[] args) throws InterruptedException
	
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		
	List<WebElement> allframes=	driver.findElements(By.xpath("//iframe"));
	Thread.sleep(4000);
	System.out.print(allframes.size());
	
	for(int i=0;i<=allframes.size()-1;i++)
	{	
		driver.switchTo().frame(i);
		
		try
		{
		
			driver.findElement(By.xpath("//body/a/img"));
			break;
		}
		
		catch(Exception E)
		{
			
			driver.switchTo().defaultContent();
		}
		
	}
	
		driver.findElement(By.xpath("//body/a/img")).click();
		
	}

}
