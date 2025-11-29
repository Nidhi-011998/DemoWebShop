package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhonesPage {
@FindBy(xpath = "//a[text()='Smartphone']/../..//input[@value='Add to cart']")
private WebElement addToCartBtn;
@FindBy(xpath = "//span[@class='cart-label' and text()='Shopping cart']")
private WebElement shoppingCartLink;

public CellPhonesPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void setAddToCart() {
	addToCartBtn.click();
}
public void setShoppingCart() {
	shoppingCartLink.click();
}

}
