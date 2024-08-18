package testng_xml_reports;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class A187_C56_AmazonLaunch_BM_AM 
{
ChromeDriver driver;
	
	@BeforeMethod
	public void launchamazon()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void closeamazon() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
}
