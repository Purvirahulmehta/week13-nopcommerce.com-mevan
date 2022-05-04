package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class GiftCards extends Utility {
    By giftCardsTab=By.xpath("//h1[text()='Gift Cards']");

    public String clickOnGiftCardsTab(){
        return getTextFromElement(giftCardsTab);
    }
}
