package org.pojoclass;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FogotPojo extends BaseClass{
	public FogotPojo() {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(css="#identify_email")
	private WebElement validEmail;
	
	@FindBy(css="#did_submit")
	private WebElement btnSearch;

	public WebElement getValidEmail() {
		return validEmail;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}
	

}



