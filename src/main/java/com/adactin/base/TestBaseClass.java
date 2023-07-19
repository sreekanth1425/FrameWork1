package com.adactin.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBaseClass {
	public static WebDriver driver;
	public static Properties prop;

	public TestBaseClass(){
		try {
			prop = new Properties();

			FileInputStream fis = new FileInputStream(
					"C:\\1\\SureshSir1\\src\\main\\java\\com\\adactin\\util\\config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\\\Users\\\\user\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Desktop\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
	}

}
