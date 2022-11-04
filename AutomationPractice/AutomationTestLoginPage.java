package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationTestLoginPage {

	WebDriver driver;
	
	By username = By.xpath("//input[@id='email']");
	By Password = By.xpath("//input[@id='passwd']");
	By login = By.xpath("//body[@id='authentication']/div[@id='page']/div[@class='columns-container']/div[@id='columns']/div[@class='row']/div[@id='center_column']/div[@class='row']/div[@class='col-xs-12 col-sm-6']/form[@id='login_form']/div[@class='form_content clearfix']/p[@class='submit']/button[@id='SubmitLogin']/span[1]");
	
	public AutomationTestLoginPage(WebDriver driver){
        this.driver = driver;
    }
	
	//Set user name in textbox

    public void setUserName(String strUserName){
    driver.findElement(username).sendKeys(strUserName);
    }

    //Set password in password textbox

    public void setPassword(String strPasword){
    driver.findElement(Password).sendKeys(strPasword);
    }

    //Click on login button

    public void clickLogin() throws InterruptedException{
    driver.findElement(login).click();
    Thread.sleep(3000);
    }

    public void loginToAutomationTest(String strUserName,String strPasword) throws InterruptedException{
    //Fill user name
    this.setUserName(strUserName);
    //Fill password
    this.setPassword(strPasword);
    //Click Login button
    this.clickLogin(); 
    
    }
}
