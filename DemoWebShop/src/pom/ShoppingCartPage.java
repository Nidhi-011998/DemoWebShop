package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
@FindBy(xpath = "//table[@class='cart']/descendant::a[text()='Smartphone']")
private WebElement smartPhoneInCart;
@FindBy(xpath = "//a[text()='Smartphone']/.././..//input[@type='checkbox']")
private WebElement removeCheckbox;
@FindBy(name="updatecart")
private WebElement updatecart;
@FindBy(linkText = "Log out")
private WebElement logoutLink;
public ShoppingCartPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}public boolean getSmartPhoneIsDisplayed() {
	return smartPhoneInCart.isDisplayed();
}public void removeItem() {
	removeCheckbox.click();
	updatecart.click();
}public void setLogout() {
	logoutLink.click();
}
}
