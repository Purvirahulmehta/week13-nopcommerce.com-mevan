package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Jewelry extends Utility {
    By jewelryTab=By.xpath("//h1[text()='Jewelry']");

    public String clickOnJewelryTab(){
        return getTextFromElement(jewelryTab);
    }
}
