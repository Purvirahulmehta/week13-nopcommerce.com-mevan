package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By logInLike=By.xpath("//a[contains(text(),'Log in')]");
    By registerLink=By.xpath("//a[contains(text(),'Register')]");
    By computer=By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]");
    By electronics=By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]");
    By apparel=By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/a[1]");
    By digitalDownload=By.xpath("//body/div[6]/div[2]/ul[1]/li[4]/a[1]");
    By books=By.xpath("//body/div[6]/div[2]/ul[1]/li[5]/a[1]");
    By jewerly=By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]");
    By giftCards=By.xpath("//body/div[6]/div[2]/ul[1]/li[7]/a[1]");

    public void clickOnLogin(){
        clickOnElement(logInLike);
    }

    public void clickOnRegister(){
        clickOnElement(registerLink);
    }
    public void clickOnComputer(){
        clickOnElement(computer);
    }
    public void clickOnElectronics(){
        clickOnElement(electronics);
    }
    public void clickOnApparel(){
        clickOnElement(apparel);
    }

    public void clickOnDigitalDownload(){
        clickOnElement(digitalDownload);
    }
    public void clickOnBooks(){
        clickOnElement(books);
    }
    public void clickOnJewerly(){
        clickOnElement(jewerly);
    }
    public void clickOnGiftCard(){
        clickOnElement(giftCards);
    }


}
