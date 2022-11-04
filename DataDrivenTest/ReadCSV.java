package DataDrivenTest;

import java.io.FileReader;
import java.io.IOException;
import java.rmi.AccessException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import au.com.bytecode.opencsv.CSVReader;

public class ReadCSV {


		static String driverPath = "C:\\Users\\HemanSharma\\Desktop\\Selenium\\Selenium Jars\\geckodriver-v0.32.0-win64\\geckodriver.exe";
		public static void main(String[] args) throws IOException, AccessException, InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.gecko.driver",driverPath);			
			WebDriver driver = new FirefoxDriver();
			driver.get("https://Automationpractice.com/index.php");
			
			
				
				CSVReader reader = new CSVReader(new FileReader("C:\\Users\\HemanSharma\\Desktop\\Selenium\\Maven Project\\TestResources\\Login.csv"));
				 
				 // this will load content into list
				  List<String[]> li=reader.readAll();
				  System.out.println("Total rows that we have is "+li.size());
				            
				 // create Iterator reference
				  Iterator<String[]>i1= li.iterator();
				    
				 // Iterate all values 
				 while(i1.hasNext()){
					 String[] str=i1.next();
				 
				
					 driver.findElement (By.xpath("//input[@id='search_query_top']")).sendKeys(str[0]);
					 driver.findElement(By.xpath("//form[@id='searchbox']")).click();
					 Thread.sleep(3000);
					 System.out.println(driver.getTitle());
					 
					 driver.navigate().back();					 
					 
				 }	   
				 driver.close();
				}
		}