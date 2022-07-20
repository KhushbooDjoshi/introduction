import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class expath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			System.setProperty("webdriver.chrome.driver", "G:\\testing\\selenium\\chromedriver.exe" );
			WebDriver driver = new ChromeDriver(); 
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://demoqa.com/text-box");
			driver.findElement(By.xpath("//input[contains(@id,`'userName')]")).sendKeys("abs");
			
			
			//                (By.xpath("//input[contains(@id, 'userN')]"))
			//driver.findElement(By.xpath("//label[text()='Sports']")).click();

	}

}
