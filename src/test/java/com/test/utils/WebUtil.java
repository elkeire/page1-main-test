package com.test.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.test.pageobjects.SignInPage;

public class WebUtil {

	public static SignInPage goToSignInPage(WebDriver driverc) {
		driverc.get("http://gmail.com");
		return PageFactory.initElements(driverc, SignInPage.class);
	}
	

}
