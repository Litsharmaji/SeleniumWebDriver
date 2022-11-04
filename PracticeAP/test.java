package PracticeAP;


import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test{

	String driverPath = "C:\\Users\\HemanSharma\\Desktop\\Selenium\\Selenium Jars\\geckodriver-v0.32.0-win64\\geckodriver.exe";
	
	 WebDriver driver;
     Search objsearch;
	 
	 @BeforeTest

	    public void setup(){

		System.setProperty("webdriver.gecko.driver", driverPath);
	        
	        driver = new FirefoxDriver();

	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

	        driver.get("http://automationpractice.com/index.php");}
	 

@Test
public void testrun() throws IOException, Exception {
	
	 
	 objsearch=new Search(driver);
	 objsearch.searchproduct();

}}
