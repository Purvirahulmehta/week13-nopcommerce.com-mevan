package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopManuPageTest extends TestBase {
    HomePage homePage=new HomePage();
    Computers computers=new Computers();
    Electronics electronics=new Electronics();
    Books books=new Books();
    Apparel apparel=new Apparel();
    DigitalDownloads digitalDownloads=new DigitalDownloads();
    Jewelry jewelry=new Jewelry();
    GiftCards giftCards=new GiftCards();

    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        homePage.clickOnComputer();
        String expectedMessage="Computers";
        String actualMessage=computers.clickonComputerTab() ;
        Assert.assertEquals(actualMessage,expectedMessage,"page is not in displayed");
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        homePage.clickOnDigitalDownload();
        String expectedMessage="Digital downloads";
        String actualMessage=digitalDownloads.clickOnDigitalDownloads() ;
        Assert.assertEquals(actualMessage,expectedMessage,"page is not in displayed");
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully (){
        homePage.clickOnApparel();
        String expectedMessage="Apparel";
        String actualMessage=apparel.clickOnApparelTab() ;
        Assert.assertEquals(actualMessage,expectedMessage,"page is not in displayed");
    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        homePage.clickOnElectronics();
        String expectedMessage="Electronics";
        String actualMessage=electronics.clickOnElectronics() ;
        Assert.assertEquals(actualMessage,expectedMessage,"page is not in displayed");
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        homePage.clickOnBooks();
        String expectedMessage="Books";
        String actualMessage=books.clickOnBooksTab() ;
        Assert.assertEquals(actualMessage,expectedMessage,"page is not in displayed");
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        homePage.clickOnJewerly();
        String expectedMessage="Jewelry";
        String actualMessage=jewelry.clickOnJewelryTab() ;
        Assert.assertEquals(actualMessage,expectedMessage,"page is not in displayed");
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        homePage.clickOnGiftCard();
        String expectedMessage="Gift Cards";
        String actualMessage=giftCards.clickOnGiftCardsTab() ;
        Assert.assertEquals(actualMessage,expectedMessage,"page is not in displayed");
    }

}
