package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Apparel extends Utility {
    By apparelTab=By.xpath("//h1[text()='Apparel']");

    public String clickOnApparelTab(){

        return getTextFromElement(apparelTab);
    }
}
