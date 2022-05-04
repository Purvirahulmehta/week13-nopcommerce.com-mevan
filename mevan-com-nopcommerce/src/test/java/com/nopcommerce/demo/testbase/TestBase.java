package com.nopcommerce.demo.testbase;

import com.nopcommerce.demo.propertyreader.PropertyReader;
import com.nopcommerce.demo.utility.Utility;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public class TestBase extends Utility {
    String browser= PropertyReader.getInstance().getProperty("browser");
    @BeforeTest
    public void setUp(){
        selectBrowser(browser);
    }
    @AfterClass
    public void tearDown(){
        closeBrowser();
    }
}
