package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.LogoutPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginPageTest extends TestBase {
    LoginPage loginPage=new LoginPage();
    HomePage homepage=new HomePage();
    LogoutPage account=new LogoutPage();


    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        homepage.clickOnLogin();
        String expectedMessage="Welcome, Please Sign In!";
        String actualMessage=loginPage.welcomeMessage();
        Assert.assertEquals(actualMessage,expectedMessage,"Welcome message is not in displayed");
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        homepage.clickOnLogin();
        loginPage.userName("Prime123@gmail.com");
        loginPage.passWord("Prime123");
        loginPage.login();
        String expectedMessage = "Log out";
        //String actualMessage = loginPage.logOut();
       // Assert.assertEquals(actualMessage, expectedMessage, "Wrong message displayed");
    }
    @Test
    public void verifyTheErrorMessage(){
        homepage.clickOnLogin();
        loginPage.userName("Prime123@gmai.com");
        loginPage.passWord("Prime");
        loginPage.login();
        String expectedMessage="Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualMessage=loginPage.errorMessage();
        Assert.assertEquals(actualMessage,expectedMessage,"Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found");





    }


}
