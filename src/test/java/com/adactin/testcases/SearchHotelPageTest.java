package com.adactin.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.adactin.base.TestBaseClass;
import com.adactin.pages.LoginPage;
import com.adactin.pages.SearchHotelPage;

public class SearchHotelPageTest extends TestBaseClass {
	LoginPage loginPage;
	SearchHotelPage searchHotelPage;
	
	public SearchHotelPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
		searchHotelPage=loginPage.validateLoginFunc(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test
	public void searchHotelPageTitleTest() {
		String title=searchHotelPage.verifySearchHotelPageTitle();
		Assert.assertEquals(title, "Adactin.com - Search Hotel");
	}
	@Test
	public void userNameLabelTest() {
		boolean flag=searchHotelPage.verifyHelloUserNameLabel();
	Assert.assertEquals(flag, true);
	}
	@Test
	public void logoutLinkTest() {
		searchHotelPage.clickOnLogoutLink();
	
	}
	@Test
	public void changePasswordLinkTest() {
		searchHotelPage.clickOnChangePasswordLink();
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
