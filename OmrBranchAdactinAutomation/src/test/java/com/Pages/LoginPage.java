package com.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPage extends BaseClass{
	public LoginPage() {
		
		
		PageFactory.initElements(driver, this);
	}
	

@FindBy(id = "username")
 private WebElement txtUserName;


@FindBy(id = "password")
 private WebElement txtPassWord;


@FindBy(id = "login")
 private WebElement btnLogin;


@FindBy(id = "auth_error")
 private WebElement textErrorMsg;


	
	
	public WebElement getTxtUserName() {
	return txtUserName;
}

public WebElement getTxtPassWord() {
	return txtPassWord;
}

public WebElement getBtnLogin() {
	return btnLogin;
}

public WebElement getTextErrorMsg() {
	return textErrorMsg;
}

	public void loginCommonStep(String username, String password) {
		
		elementSendkeys(getTxtUserName(),username);
		elementSendkeys(getTxtPassWord(),password);
		
		
	    
		
	}
	
	public void login(String username , String password) {
       loginCommonStep(username, password);
  
		
		}	
	
	public void loginWithEnterKey(String username, String password) throws AWTException {
    loginCommonStep(username , password);
		
		
		Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
     
	}
	
		
	}
	
	

