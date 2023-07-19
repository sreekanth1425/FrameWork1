

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstClass {WebDriver driver;
@BeforeMethod
public void setUp() {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\user\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
       driver.get("http://www.google.com");
}
@Test(priority=1,invocationCount=2,groups="test")
public void googleTitleTest() {
String googleTitle=driver.getTitle();
System.out.println(googleTitle);
Assert.assertEquals(googleTitle,"Google");


}
@Test(priority=2,groups="test")
public void googleLogoTest() {
	boolean flag=driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
	Assert.assertEquals(flag, true);
	System.out.println(flag);
}
@AfterMethod
public void tearDown() {
driver.quit();
}
}
