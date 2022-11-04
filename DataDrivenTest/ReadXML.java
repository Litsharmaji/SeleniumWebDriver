package DataDrivenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ReadXML {

static String driverPath = "C:\\\\Users\\\\HemanSharma\\\\Desktop\\\\Selenium\\\\Selenium Jars\\\\geckodriver-v0.32.0-win64\\\\geckodriver.exe";
WebDriver driver ;

@Test
@Parameters({"sProdName"})

public void login(@Optional("Blouse")String sProdName) throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver",driverPath);			
	WebDriver driver = new FirefoxDriver();
	driver.get("https://Automationpractice.com/index.php");
	

	 driver.findElement (By.xpath("//input[@id='search_query_top']")).sendKeys(sProdName);
	 driver.findElement(By.xpath("//form[@id='searchbox']")).click();
	 System.out.println(driver.getTitle());
	 Thread.sleep(3000);
	 System.out.println(driver.getTitle());
	 driver.close();
	 
}


	

}
