package testScriptForTestCase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.PropertyHandlerUtils;
import webPageUtility.RegisterPage;

public class RegisterTest extends BaseClass {
	
	@Test
	public void createAccountwithOnly2Char() throws IOException, InterruptedException {
		
		RegisterPage regisPage = new RegisterPage(driver);
		
		regisPage.enterUserName(PropertyHandlerUtils.propertyDataFetch("UserName"));
		regisPage.enterEmailAddress(PropertyHandlerUtils.propertyDataFetch("EmailAddress"));
		regisPage.enterPassWord(PropertyHandlerUtils.propertyDataFetch("PassWord"));
		regisPage.createAccount();
		regisPage.validateErrorMsg("Invalid Data");
		
		
//		js1.executeScript("arguments[0].click();", RegisterPage.createAccount);
//		try {
//			
//			driver.findElement(By.xpath("//button[@class ='base-button base-button--type-button button is-primary']")).click();
//		}
//		catch(Exception e){
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("arguments[0].click();", RegisterPage.createAccount);
//			regisPage.createAccount();
//			
//		}
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", RegisterPage.createAccount);
//		regisPage.createAccount();
//		
	}

}
