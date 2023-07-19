package com.adactin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactin.base.TestBaseClass;

public class LoginPage extends TestBaseClass {
//PageFactory or Obj Repo
	@FindBy(xpath = "//input[@name='username']")
	WebElement username;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	@FindBy(xpath = "//input[@name='login']")
	WebElement loginBtn;

	@FindBy(xpath = "//a[text()='New User Register Here']")
	WebElement signupLink;

	@FindBy(xpath = "//img[@class='logo']")
	WebElement AdactinLogo;

	public LoginPage() {
		PageFactory.initElements(driver, this);

	}
	// Actions

	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean validateAdactinLogo() {
		return AdactinLogo.isDisplayed();

	}

	public SearchHotelPage validateLoginFunc(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new SearchHotelPage();
	}
	public RegistrationPage clickOnSignUpLink() {
		signupLink.click();
		return new RegistrationPage();
	}

}
