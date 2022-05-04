package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By welcomeMessage=By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By userName=By.xpath("//input[@id='Email']");
    By passWord=By.xpath("//input[@id='Password']");
    By login=By.xpath("//button[contains(text(),'Log in')]");
    By logout=By.xpath("//a[contains(text(),'Log out')]");
    By errorMessage=By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]");

    public String welcomeMessage(){
        return getTextFromElement(welcomeMessage);
    }
    public void userName(String text){
        sendTextToElement(userName,text);
    }
    public void passWord(String text){
        sendTextToElement(passWord,text);

    }
    public void login(){

        clickOnElement(login);
    }
    public void logOut(){
        clickOnElement(logout);
    }
    public String errorMessage(){
        return getTextFromElement(errorMessage);
    }

}
