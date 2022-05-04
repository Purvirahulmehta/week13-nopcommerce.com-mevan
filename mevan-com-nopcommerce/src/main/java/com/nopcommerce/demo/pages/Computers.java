package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Computers extends Utility {
   // By computerTab=By.xpath("//a[@xpath='1' and contains(text(),'Computers')]");
    By computerTab=By.xpath("//h1[text()='Computers']");
    public String clickonComputerTab(){
        return getTextFromElement(computerTab);
    }
}
