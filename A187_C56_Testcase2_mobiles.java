package testng_xml_reports;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

class A187_C56_Testcase2_mobiles extends A187_C56_AmazonLaunch_BM_AM
{
	@Test
	public void mobiles()
	{
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("mobiles" + Keys.ENTER);
	}

}
