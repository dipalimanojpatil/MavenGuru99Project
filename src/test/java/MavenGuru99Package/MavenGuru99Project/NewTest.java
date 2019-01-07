package MavenGuru99Package.MavenGuru99Project;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;

	@BeforeSuite
	public void beforeSuite() {

		System.setProperty("webdriver.chrome.driver", "D://Advance Selenium Softwares1 (2)//chromedriver.exe");
		driver = new ChromeDriver();
	}

	@BeforeTest
	public void beforeTest() {

		driver.get("http://live.guru99.com/");
		driver.manage().window().maximize();

	}

	@Test(priority = 1)
	public void ClickOnAccount() {

		driver.findElement(By.xpath("//span[@class='label'][.='Account']")).click();
	}

	@Test(priority = 2)
	public void VarifyLogin() {

	
		driver.findElement(By.xpath("//a[@title='Log In']")).click();
		driver.findElement(By.xpath("//input[@name='login[username]']")).clear();
		driver.findElement(By.xpath("//input[@name='login[password]']")).clear();
		driver.findElement(By.xpath("//input[@name='login[username]']")).sendKeys("manoj@gmail.com");
		driver.findElement(By.xpath("//input[@name='login[password]']")).sendKeys("ManojP");
		driver.findElement(By.xpath("//button[@title='Login']")).click();
	}


	@Test(priority = 3)
	public void LogOut() {
		driver.findElement(By.xpath("//span[@class='label'][.='Account']")).click();
		driver.findElement(By.xpath("//a[.='Log Out']")).click();
	}

	@AfterSuite
	public void closewindow() {
		driver.close();
	}
}

