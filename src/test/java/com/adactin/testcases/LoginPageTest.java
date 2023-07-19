package com.adactin.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.adactin.base.TestBaseClass;
import com.adactin.pages.LoginPage;
import com.adactin.pages.RegistrationPage;
import com.adactin.pages.SearchHotelPage;

public class LoginPageTest extends TestBaseClass {
	SearchHotelPage searchHotelPage;
	LoginPage loginPage;
	RegistrationPage registrationPage;

	public LoginPageTest() {
		super();

	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}

	@Test

	public void loginFuncTest() {
		searchHotelPage = loginPage.validateLoginFunc(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Test
	public void loginTitleTest() {
		String s1 = loginPage.validateLoginPageTitle();
		Assert.assertEquals(s1, "Adactin.com - Hotel Reservation System");
	}

	@Test
	public void adactinLogoTest() {
		boolean flag = loginPage.validateAdactinLogo();
		Assert.assertEquals(flag, true);
	}

	@Test
	public void registrationLinkTest() {
		registrationPage = loginPage.clickOnSignUpLink();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

}
