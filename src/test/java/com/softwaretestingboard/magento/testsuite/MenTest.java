package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.MenPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {
    HomePage homePage = new HomePage();
    MenPage menPage = new MenPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart(){
        homePage.mouseHoverOnMenMenu();
        homePage.mouseHoverOnButton();
        homePage.clickOnPant();
        menPage.mouseHoverOnCronusYogaPant();
        menPage.clickOnSize();
        menPage.clickOnColor();
        menPage.clickOnAddToCart();
        Assert.assertEquals("You added Cronus Yoga Pant to your shopping cart.", menPage.getTextAfterAddToCart());
        menPage.clickOnShoppingCart();
        //Assert.assertEquals(shoppingCart.getShoppingCart(),"Cronus Yoga Pant");
        Assert.assertEquals(shoppingCartPage.getCronusYogaPantText(),"Cronus Yoga Pant");
        Assert.assertEquals(shoppingCartPage.getSizeText(), "32");
        Assert.assertEquals(shoppingCartPage.getColorText(), "Black");
    }
}
