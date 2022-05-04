package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Books extends Utility {
    By booksTab=By.xpath("//h1[text()='Books']");
    public String clickOnBooksTab(){
        return getTextFromElement(booksTab);
    }
}
