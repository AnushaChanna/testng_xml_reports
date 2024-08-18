package testng_xml_reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class A189_C56_CrossBrowsingTesting 
{
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void crossbrowsetest(String nameofbrowser)
	{
		if (nameofbrowser.equals("chrome"))
		{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		}
		if (nameofbrowser.equals("edge"))
		{
		driver=new EdgeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		}
		if (nameofbrowser.equals("firefox"))
		{
		driver=new FirefoxDriver();
		driver.get("https://www.myntra.com");
		driver.manage().window().maximize();
		}
		if (nameofbrowser.equals("chrome"))
		{
	
			driver=new ChromeDriver();
			driver.get("https://www.nykaa.com");
			driver.manage().window().maximize();
		}
		if (nameofbrowser.equals("edge"))
		{
		
			driver=new ChromeDriver();
			driver.get("https://www.hotstar.com/in/home?ref=%2Fin");
			driver.manage().window().maximize();
		}
			
	
			
	}
}
