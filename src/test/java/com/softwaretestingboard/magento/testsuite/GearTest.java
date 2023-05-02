package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.GearPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.OverNightDuffel;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {

    HomePage homePage = new HomePage();
    GearPage gearPage = new GearPage();
    OverNightDuffel overNightDuffle = new OverNightDuffel();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() {
        homePage.mouseHoverOnGearMenu();
        homePage.clickOnBags();
        gearPage.clickOnOvernightDuffle();
        Assert.assertEquals(overNightDuffle.getOverNightDuffelText(), "Overnight Duffle");
        overNightDuffle.changeQuantityTo3("3");
        overNightDuffle.clickOnAddToCart();
        Assert.assertEquals(overNightDuffle.getAddToCartText(), "You added Overnight Duffle to your shopping cart.");
        overNightDuffle.clickOnShoppingCart();
        Assert.assertEquals(shoppingCartPage.getOverNightDuffleText(), "Overnight Duffle");
        Assert.assertEquals(shoppingCartPage.getQty(), "3");
        Assert.assertEquals(shoppingCartPage.getProductPrice(), "$135.00");
        shoppingCartPage.changeQtyOfOverNightDuffle("5");
        shoppingCartPage.clickOnUpdateShoppingCart();
        Assert.assertEquals(shoppingCartPage.getUpdatedProductPrice(), "$225.00");
    }
}
