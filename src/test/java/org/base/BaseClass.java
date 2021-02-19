package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static  WebDriver driver;
	public static void loadBrowser() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();

	}

	public static void launchurl(String url) {
		driver.get(url);
	}
	
	public static void maximise() {
		driver.manage().window().maximize();

	}

	public static void closebrowser() {
		driver.quit();

	}
	public static void fill(WebElement element,String txt) {
		element.sendKeys(txt);
		
	}
	public static void btnclick(WebElement element) {
		element.click();
	}




}
