package webPageUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RegisterPage {
	
	private WebDriver driver ;
	
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

    @FindBy(css ="div.control input#username") WebElement userName;
    public void enterUserName(String un) {
    	userName.sendKeys(un);
    }
    
    @FindBy(css = "div.control input#email") WebElement emailAddress;
    public void enterEmailAddress(String email) {
    	emailAddress.sendKeys(email);
    }
    
    @FindBy(css = "input#password") WebElement passWord;
    public void enterPassWord(String pwd) {
    	passWord.sendKeys(pwd);
    }
    
    @FindBy(id = "register-submit") WebElement createAccount;
    public void createAccount() {
    	JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView();", createAccount);
    	createAccount.click();
    }
    
    @FindBy(css = "div.message.danger") WebElement errorMsg;
    public void validateErrorMsg(String expectedMsg) {
    	Assert.assertEquals(errorMsg.getText(), expectedMsg);
    }
}
