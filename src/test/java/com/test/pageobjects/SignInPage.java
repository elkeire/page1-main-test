package com.test.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

	public void fillInUserName(WebDriver d, String s) {
		WebElement usrname = d.findElement(By.id(""));
		usrname.clear();
		usrname.sendKeys("");
	}

	public void fillInPassword(WebDriver d, String s) {
		WebElement psswd = d.findElement(By.id(""));
		psswd.clear();
		psswd.sendKeys("");
	}

	public EmailHomePage clickSignIn(WebDriver d) {
		WebElement signIn = d.findElement(By.id(""));
		signIn.click();
		
		return PageFactory.initElements(d, EmailHomePage.class);
	}

}
