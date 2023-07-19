package com.adactin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactin.base.TestBaseClass;

public class SearchHotelPage extends TestBaseClass{
	@FindBy(xpath="//input[@id='username_show']")
	WebElement  helloUserName;
	
	@FindBy(xpath="//td[text()='Welcome to Adactin Group of Hotels']")
	WebElement  WelcomeText;
	
	@FindBy(xpath="//a[text()='Search Hotel']")
	WebElement  searchHotelLink;
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	WebElement  bookedItineraryLink;
	
	@FindBy(xpath="//a[text()='Change Password']")
	WebElement  changePasswordLink;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement  logoutLink;
	
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifySearchHotelPageTitle() {
		return driver.getTitle();
	}
	public boolean  verifyHelloUserNameLabel() {
		return helloUserName.isDisplayed();
	}
	
	public boolean verifyWelcomeText() {
		return WelcomeText.isDisplayed();
	}
	
	public LogoutPage clickOnLogoutLink() {
		logoutLink.click();
		return new LogoutPage();
	}
	public ChangePasswordPage clickOnChangePasswordLink() {
		changePasswordLink.click();
		return new ChangePasswordPage();
	}
	
	
	

}
