package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationTestIndexPage {

	WebDriver driver;
	
	By indexPageSignIn = By.xpath("//a[@class='login']");
	
public AutomationTestIndexPage(WebDriver driver){

	    this.driver = driver;}

public void clickindexPageSignIn() throws InterruptedException{

     driver.findElement(indexPageSignIn).click();
     Thread.sleep(3000);

   }

}
