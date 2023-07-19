package DataProvider;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dataProvider.Util.DataProviderUtility;

public class DataProviderTestNG {
	WebDriver driver;

	@BeforeMethod
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\user\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[2][@class='oxd-main-menu-item-wrapper']/a[@class='oxd-main-menu-item']"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
		Thread.sleep(3000);
	}

	@DataProvider
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]> testData = DataProviderUtility.getDataFromExcelSheet();
		return testData.iterator();
	}

	@Test(dataProvider = "getTestData")
	public void amazonRegPageTest(String firstname, String middlename, String lastname) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstname);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys(middlename);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lastname);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
