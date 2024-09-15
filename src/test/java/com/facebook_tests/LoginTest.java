package com.facebook_tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.facebook_base.Base_test;
import com.facebook_pages.LoginPage;
import com.facebook_utilities.TestReader;


public class LoginTest extends Base_test {

	LoginPage lp;
	TestReader tr;
	
	@BeforeMethod(groups= {"smoke","functional","regression"})
	public void openFacebook() {
		opneApplication();
		
	}
	
	@Test (groups= {"smoke","functional","regression"})
	public void validLoginTest() {
	lp = new LoginPage(driver);	
	tr = new TestReader();
	lp.userName(tr.readUsename());
	lp.password(tr.readPassword());
	lp.loginButton();
	
	}
	
	
	@Test(groups="functional")
	public void InvalidusernameLoginTest() {
	lp = new LoginPage(driver);	
	tr = new TestReader();
	lp.userName(tr.readUsename());
	lp.password(tr.readPassword());
	lp.loginButton();
	
	}
	
	
	@Test(groups="regression")
	public void invalidPasswordLoginTest() {
	lp = new LoginPage(driver);	
	tr = new TestReader();
	lp.userName(tr.readUsename());
	lp.password(tr.readPassword());
	lp.loginButton();
	
	}
	
	
	@AfterMethod(groups= {"smoke","functional","regression"})
	public void closeFacebook() {
		closeApplication();
		
	}
}
