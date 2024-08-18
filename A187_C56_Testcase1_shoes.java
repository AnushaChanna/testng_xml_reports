package testng_xml_reports;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class A187_C56_Testcase1_shoes extends A187_C56_AmazonLaunch_BM_AM
{
	@Test
	public void searchshoes()
	{
		WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoes"+Keys.ENTER);
	}
	
	
	
	
	
}
