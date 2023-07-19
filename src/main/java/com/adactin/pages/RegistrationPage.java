package com.adactin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactin.base.TestBaseClass;

public class RegistrationPage extends TestBaseClass{
	@FindBy(xpath="//a[text()='Go back to Login page']")
WebElement goBackToLoginPageLink;
	
	@FindBy(xpath="//td[@class='login_title']")
	WebElement regPageHeading;

	@FindBy(xpath="//input[@name='username']")
	WebElement usernameField;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passwordField;
	
	@FindBy(xpath="//input[@name='re_password']")
	WebElement confPasswordField;
	
	@FindBy(xpath="//input[@name='full_name']")
	WebElement fullnameField;
	
	@FindBy(xpath="//input[@name='email_add']")
	WebElement emailField;
	
	//initialization
	public RegistrationPage() {
		PageFactory.initElements(driver, this);
	}
	public String verifyRegPageTitle() {
		return driver.getTitle();
	}
	public void verify
}
