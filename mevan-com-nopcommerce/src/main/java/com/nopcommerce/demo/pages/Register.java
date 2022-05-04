package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
//1. userShouldNavigateToRegisterPageSuccessfully
//
//        * click on the ‘Register’ link
//        * Verify the text ‘Register’
//
//        2. userSholdRegisterAccountSuccessfully
//
//        * click on the ‘Register’ link
//        * Select gender radio button
//        * Enter First name
//        * Enter Last name
//        * Select Day Month and Year
//        * Enter Email address
//        * Enter Password
//        * Enter Confirm password
//        * Click on REGISTER button
//
//        * Verify the text 'Your registration completed’

public class Register extends Utility {
    By Register=By.xpath("//a[contains(text(),'Register')]");
    By gender=By.xpath("//input[@id='gender-male']");
    By Firstname=By.xpath("//input[@id='FirstName']");
    By Lastname=By.xpath("//input[@id='LastName']");
    By dateOfBirthDay = By.xpath("//select[@name='DateOfBirthDay']");
    By monthOfBirthDay = By.xpath("//select[@name='DateOfBirthMonth']");
    By yearOfBirthDay = By.xpath("//select[@name='DateOfBirthYear']");
     By Emailaddress=By.xpath("//input[@id='Email']");
    By Password=By.xpath("//input[@id='Password']");
    By Confirmpassword=By.xpath("//input[@id='ConfirmPassword']");
    By REGISTERbutton=By.xpath("//button[@id='register-button']");
    By registrationMessage=By.xpath("//div[contains(text(),'Your registration completed')]");// Verify the text 'Your registration completed’

    public String registerLink(){
      return getTextFromElement(Register);
    }
    public void genderButton(){
       clickOnElement(gender);
    }
    public void firstname(String text){
        sendTextToElement(Firstname,text);
        }
        public void lastname(String text){
         sendTextToElement(Lastname,text);
        }
        public void birthdata(String text){
         selectByVisibleTextFromDropDown(dateOfBirthDay,text);
        }
        public void birthmonth(String text){
         selectByVisibleTextFromDropDown(monthOfBirthDay,text);
        }
        public void birthyear(String text){
        selectByVisibleTextFromDropDown(yearOfBirthDay,text);
        }
        public void emailaddress(String text){
         sendTextToElement(Emailaddress,text);
        }
        public void password(String text){
         sendTextToElement(Password,text);
        }
        public void confirmpassword(String text){
         sendTextToElement(Confirmpassword,text);
        }
        public void registerbutton(){
         clickOnElement(REGISTERbutton);
        }
        public String registrationcomplete(){
         return getTextFromElement(registrationMessage);
        }
}
