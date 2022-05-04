package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class LogoutPage extends Utility {
    By logoutTab=By.xpath("//a[@contains(text(),'Log out')]");
    public String cliclOnLogoutTab(){
        return getTextFromElement(logoutTab);
    }
}
