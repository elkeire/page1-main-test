package com.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class GmailSignInTest {
//		Go to Gmail wbsite
	WebDriver driverc = new org.openqa.selenium.chrome.ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driverc, 20);
	
	
	@Test
	public void gmailLoginShouldBeSuccessful(){
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
//		verify iser did sign in
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
		WebElement composeButton = driverc.findElement(By.cssSelector(""));
		composeButton.click();
		//3. Fill in recipient
		WebElement toTextArea = driverc.findElement(By.cssSelector(""));
		toTextArea.clear();
		toTextArea.sendKeys("");
		//Fill in Subject
		WebElement subjectTextArea = driverc.findElement(By.cssSelector(""));
		final String sbj = "Hello Good Morning!";
		subjectTextArea.clear();
		subjectTextArea.sendKeys(sbj);
		//4. Fill in email body
		WebElement bodyTextArea = driverc.findElement(By.id(""));
		bodyTextArea.clear();
		bodyTextArea.sendKeys("");
		//5. Click send
		WebElement sendButton = driverc.findElement(By.cssSelector(""));
		sendButton.click();
		//6. Click inbox again
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("")));
		WebElement inboxLink = driverc.findElement(By.linkText(""));
		inboxLink.click();
		
		//8. Click email
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("")));
		WebElement newMail = driverc.findElement(By.cssSelector(""));
		newMail.click();
		//9. Verify the email subject and email body is correct
		//10. Sign out
	}
	

}
