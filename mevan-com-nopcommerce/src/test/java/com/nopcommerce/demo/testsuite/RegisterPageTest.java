package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.Register;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {
    HomePage homePage=new HomePage();
    Register register=new Register();

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        homePage.clickOnRegister();
        String expectedMessage="Register";
        String actualMessage=register.registerLink();
        Assert.assertEquals(actualMessage,expectedMessage,"Register page is not in displayed");
        register.genderButton();
        register.firstname("Pooja");
        register.lastname("Shah");
        register.birthdata("10");
        register.birthmonth("April");
        register.birthyear("1982");
        register.emailaddress("Poojashah@gmail.com");
        register.password("Pooja123");
        register.confirmpassword("Pooja123");
        register.registerbutton();
        String expectedMessage1="Your registration completed";
        String actualMessage1=register.registrationcomplete();
        Assert.assertEquals(actualMessage,expectedMessage,"Registration page is not in displayed");

    }
}
