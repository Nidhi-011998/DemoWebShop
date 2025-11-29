package generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pom.DashBoardPage;
import pom.LoginPage;
import pom.ShoppingCartPage;

public class BaseClass {
public static WebDriver driver;
public FileLib f=new FileLib();
	@BeforeTest
	public void openBrowser() throws IOException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--incognito");
		driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String url = f.readPropertyData("url");
		driver.get(url);
//		driver.get("https://demowebshop.tricentis.com/");
	}	@BeforeMethod
	public void login() throws IOException {
		DashBoardPage d=new DashBoardPage(driver);
		d.setLoginLink();
//		driver.findElement(By.linkText("Log in")).click();
		LoginPage l=new LoginPage(driver);
		String un = f.readPropertyData("un");
		String pwd = f.readPropertyData("pwd");
		l.setLogin(un, pwd);
//		l.setLogin("admin123@email.com", "12345678");
//		driver.findElement(By.id("Email")).sendKeys("admin123@email.com");
//		driver.findElement(By.id("Password")).sendKeys("12345678");
//		driver.findElement(By.className("login-button")).click();
	}	@AfterMethod
	public void logout() {
		ShoppingCartPage s=new ShoppingCartPage(driver);
		s.setLogout();
//		driver.findElement(By.linkText("Log out")).click();
	}	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
}
