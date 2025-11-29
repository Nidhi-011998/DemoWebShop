package testscript;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseClass;
import pom.CellPhonesPage;
import pom.ElectronicsPage;
import pom.HomePage;
import pom.ShoppingCartPage;
@Listeners(generic.ListenerImplementation.class)
public class CartModule extends BaseClass{
	@Test
public void addToCart() throws InterruptedException {
HomePage h=new HomePage(driver);
h.setElectronics();
//driver.findElement(By.xpath("//ul[@class='list']//a[contains(text(),'Electronics')]")).click();Thread.sleep(2000);
ElectronicsPage e=new ElectronicsPage(driver);
e.setCellPhone();
//driver.findElement(By.xpath("//img[contains(@title,'category Cell phones')]")).click();Thread.sleep(2000);
CellPhonesPage c=new CellPhonesPage(driver);
c.setAddToCart();
//driver.findElement(By.xpath("//a[text()='Smartphone']/../..//input[@value='Add to cart']")).click();Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,-100)");Thread.sleep(2000);
c.setShoppingCart();
//driver.findElement(By.xpath("//span[@class='cart-label' and text()='Shopping cart']")).click();Thread.sleep(2000);
ShoppingCartPage s=new ShoppingCartPage(driver);
boolean res = s.getSmartPhoneIsDisplayed();
//boolean res = driver.findElement
//(By.xpath("//table[@class='cart']/descendant::a[text()='Smartphone']")).isDisplayed();
Assert.assertTrue(res);
s.removeItem();
//driver.findElement(By.xpath("//a[text()='Smartphone']/.././..//input[@type='checkbox']")).click();Thread.sleep(2000);
//driver.findElement(By.name("updatecart")).click();Thread.sleep(2000);
		
}
}
