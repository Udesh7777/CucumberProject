package org.stepdefinition;

import org.base.BaseClass;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooksclass extends BaseClass {
	@Before
	public void beforeExecution() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		maximise();

	}

	@After
	public void afterExecution() {
		closebrowser();
	}


}
