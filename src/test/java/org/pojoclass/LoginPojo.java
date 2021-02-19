package org.pojoclass;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement user;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement btnClick;
	
	@FindBy(xpath="//a[text()='Forgotten password?'] ")
	private WebElement forgetLink;

	public WebElement getUser() {
		return user;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}

	public WebElement getForgetLink() {
		return forgetLink;
	}
	
	
	
	
}

	


