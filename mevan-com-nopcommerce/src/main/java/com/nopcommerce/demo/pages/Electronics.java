package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Electronics extends Utility {
    By electronicsTab=By.xpath("//h1[text()='Electronics']");

    public String clickOnElectronics(){
        return getTextFromElement(electronicsTab);
    }
}
