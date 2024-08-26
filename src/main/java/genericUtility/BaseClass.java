package genericUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
public static WebDriver driver;
	
	@BeforeMethod
	public void configBeforeMethod() throws IOException {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(PropertyHandlerUtils.propertyDataFetch("URL"));
		}
	
//	@AfterMethod
	public void browserQuitAfterTestExecution() {
		driver.quit();
	}

}
