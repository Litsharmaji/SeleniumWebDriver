package PracticeAP;

	import java.io.FileInputStream;
	import java.io.IOException;
	import java.time.Duration;

	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class Search {
	         
		WebDriver driver;
		By searchtype = By.id("search_query_top");
		By submitbutton = By.xpath("//form[@id='searchbox']//button[@type='submit']");
		
		public Search(WebDriver driver) {
			this.driver = driver;}
		
	

		public void searchproduct() throws IOException, Exception {
			 
		 
		        FileInputStream fis = new FileInputStream("C:\\Users\\HemanSharma\\Desktop\\Selenium\\Test Data\\AutomationPractice.xlsx");
		        XSSFWorkbook workbook = new XSSFWorkbook(fis);
		        XSSFSheet wbst = workbook.getSheetAt(0);
		        int rownum= wbst.getLastRowNum();
		        int colnum = wbst.getRow(0).getPhysicalNumberOfCells();
		        System.out.println(rownum);
		        System.out.println(colnum);
		        XSSFCell Search;
		       // XSSFCell Size;
		        //XSSFCell color;
		        //XSSFCell Quantity;
		        for(int i=1;i<=rownum;i++) {
		            Search =wbst.getRow(i).getCell(0);
		          //  Size =wbst.getRow(i).getCell(1);
		            //color =wbst.getRow(i).getCell(3);
		         //   Quantity =wbst.getRow(i).getCell(2);
		            // search product
		            
		            driver.findElement(searchtype).sendKeys(Search.toString());
		            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		           driver.findElement(submitbutton)	.click();          
		      /*      clickPdt.click();
		        Thread.sleep(2000);
		            if(textpdt.isDisplayed()) {
		                System.out.println(textpdt.getText());*/
		}
		        }}

