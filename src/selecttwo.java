import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selecttwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "G:\\testing\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		String st = "khush";
		driver.findElement(By.cssSelector(
				".text-field-container div.mt-2.row:nth-child(1) .col-md-9.col-sm-12 .mr-sm-2.form-control"))
				.sendKeys(st);
		driver.findElement(By.cssSelector(".btn-primary")).click();
		String st1 = driver.findElement(By.cssSelector(".mb-1")).getText();
//      

		String[] arrOfStr = st1.split(":");

		String k = arrOfStr[1];

		if (st.equals(k)) {
			System.out.println("hello");
		} else {
			System.out.println("a"+st+"a");
			System.out.println("a"+k+"a");
			System.out.println("a"+k.trim()+"a");
		}

		// WebElement element = driver.findElement(By.cssSelector(".text-field-container
		// div.mt-2.row:nth-child(1) .col-md-9.col-sm-12 .mr-sm-2.form-control"));
//		String text = element.getAttribute("khush");
//		System.out.println(text);

	}

}
