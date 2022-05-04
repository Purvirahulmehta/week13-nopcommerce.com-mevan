package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class DigitalDownloads extends Utility {
    By digitalDownloadsTab=By.xpath("//h1[text()='Digital downloads']");

    public String clickOnDigitalDownloads(){
        return getTextFromElement(digitalDownloadsTab);
    }
}
