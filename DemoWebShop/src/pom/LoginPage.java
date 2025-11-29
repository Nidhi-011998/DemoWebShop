package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(id="Email")
private WebElement emailTbx;
@FindBy(id="Password")
private WebElement passwordTbx;
@FindBy(className = "login-button")
private WebElement loginBtn;
public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void setLogin(String un,String pwd) {
	emailTbx.sendKeys(un);
	passwordTbx.sendKeys(pwd);
	loginBtn.click();
}
}
