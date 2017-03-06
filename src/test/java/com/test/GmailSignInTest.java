package com.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.pageobjects.EmailHomePage;
import com.test.pageobjects.SignInPage;
import com.test.utils.WebUtil;

import junit.framework.Assert;

public class GmailSignInTest {
//		Go to Gmail wbsite
	WebDriver driverc = new org.openqa.selenium.chrome.ChromeDriver();
	
	
	@Test
	public void gmailLoginShouldBeSuccessful(){
		
		
		//SignIn first wrote this line then generated the code for the pieces
		SignInPage signInPage = WebUtil.goToSignInPage(driverc);
			// So driverc get page and return from a page factory initialiseElements()
			// This next bit is done by the SignInPage
//		Fill in username
		signInPage.fillInUserName(driverc, "");
//		Fill in password
		signInPage.fillInPassword(driverc, "");
//		click sign in
		EmailHomePage emailHomePage = signInPage.clickSignIn(driverc);
		
//		verify iser did sign in
		WebDriverWait wait = new WebDriverWait(driverc, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("")));
		Assert.assertTrue("", driverc.findElements(By.cssSelector("")).size()>0);
//		sign out
		WebElement profileButton = driverc.findElement(By.cssSelector(""));
		profileButton.click();
//		verified user did sign out
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("")));
		Assert.assertTrue("", driverc.findElements(By.cssSelector("")).size()>0);
//		
	}
	
	@Test
	public void gmailSendAndReceiveEmailTest()
	{
		//1. Click signin
		driverc.get("http://gmail.com");
//		Fill in username
		WebElement usrname = driverc.findElement(By.id(""));
		usrname.clear();
		usrname.sendKeys("");
//		Fill in password
		WebElement psswd = driverc.findElement(By.id(""));
		psswd.clear();
		psswd.sendKeys("");
//		click sign in
		WebElement signIn = driverc.findElement(By.id(""));
		signIn.click();
		//2. Click compose
		
		//3. Fill in recipient
		WebElement toTextArea = driverc.findElement(By.cssSelector(""));
		toTextArea.clear();
		toTextArea.sendKeys("");
		//4. Fill in email body
		WebElement bodyTextArea = driverc.findElement(By.id(""));
		bodyTextArea.clear();
		bodyTextArea.sendKeys("");
		//5. Click send
		WebElement sendButton = driverc.findElement(By.cssSelector(""));
		sendButton.click();
		//6. Click inbox again
		
		
		//8. Click email
		//9. Verify the email subject and email body is correct
		//10. Sign out
	}
	

}
