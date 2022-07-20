import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class firstprogram{

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:\\testing\\selenium\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver(); 
		
	
//		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.cssSelector(".text-field-container div.mt-2.row:nth-child(1) .col-md-9.col-sm-12 .mr-sm-2.form-control")).sendKeys("Khush");
		driver.findElement(By.cssSelector("form div.mt-2.row:nth-child(2) div.col-md-9.col-sm-12 input.mr-sm-2.form-control")).sendKeys("abc@MAIL.COM");
	    driver.findElement(By.cssSelector(".text-field-container div:nth-child(3).mt-2 .col-md-9.col-sm-12 .form-control")).sendKeys("xtys");
		driver.findElement(By.cssSelector(".text-field-container div:nth-child(4).mt-2 .col-md-9.col-sm-12 .form-control")).sendKeys("abs");
		driver.findElement(By.cssSelector(".btn-primary")).click();
		
	
	
		
//		Thread.sleep(3000);	
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,350)", "");

		//driver.close();
		
		
		
	}
}
