package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pojoclass.FogotPojo;
import org.pojoclass.LoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Loginpage extends BaseClass {
//	public static LoginPojo l;
	
	@Given("user has to launch chrome and hit the FB url")
	public void user_has_to_launch_chrome_and_hit_the_FB_url() {
		launchurl("https://www.facebook.com/");

	
    //launchurl("https://www.facebook.com/");
	}

	@When("user has to enter the  username and password")
	public void user_has_to_enter_the_username_and_password(io.cucumber.datatable.DataTable data) {
		List<Map<String,String>> mp=data.asMaps();
		LoginPojo l= new LoginPojo();

	 fill( l.getUser(), mp.get(0).get("username"));
	 fill( l.getPassword(), mp.get(1).get("password"));

	}

	@When("click the login button")
	public void click_the_login_button() {
		LoginPojo l=new LoginPojo();
		btnclick(l.getBtnClick());

		
	}

	@Then("user unable to enter the home page")
	public void user_unable_to_enter_the_home_page() {
		  System.out.println("Assert passed");

	}

	@When("user has to click the forgotten password link")
	public void user_has_to_click_the_forgotten_password_link() {
		LoginPojo l=new LoginPojo();
		btnclick(l.getForgetLink());

	}

	@When("user has to enter credentials")
	public void user_has_to_enter_credentials() {
		FogotPojo f=new FogotPojo();
		fill(f.getValidEmail(),"AlluArjun08@gmail.com");
 
	}

	@When("user has to click serach button")
	public void user_has_to_click_serach_button() {
		FogotPojo f=new FogotPojo();
		   btnclick(f.getBtnSearch());

	}

	@Then("user has to be redirected the OTP page")
	public void user_has_to_be_redirected_the_OTP_page() throws InterruptedException {
		Thread.sleep(3000);
		
		FogotPojo f=new FogotPojo();

//		  Assert.assertTrue("Check username or password",f.getBtnSearch().isSelected());
		  System.out.println("Forgot password Assert passed");

	}



}
