package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage {
@FindBy(xpath = "//img[contains(@title,'category Cell phones')]")
private WebElement cellPhoneImage;

public ElectronicsPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void setCellPhone() {
	cellPhoneImage.click();
}
}
