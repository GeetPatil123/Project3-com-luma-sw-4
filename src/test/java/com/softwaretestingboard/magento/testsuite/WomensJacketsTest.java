package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.WomensJacketsPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomensJacketsTest extends BaseTest {

    HomePage homePage = new HomePage();
    WomensJacketsPage womensPage = new WomensJacketsPage();

    @Test
    public void verifyTheSortByProductNameFilter() {
        homePage.mouseHoverOnWomenMenu();
        homePage.mouseHoverOnTops();
        homePage.clickOnJackets();
        womensPage.selectProductNameFilter("Product Name");
        Assert.assertEquals(womensPage.getProductList1(), womensPage.getProductList2());
    }

    @Test
    public void verifyTheSortByPriceFilter() {
        homePage.mouseHoverOnWomenMenu();
        homePage.mouseHoverOnTops();
        homePage.clickOnJackets();
        womensPage.selectProductNameFilter("Price");
        Assert.assertEquals(womensPage.getPriceList1(), womensPage.getPriceList2());
    }
}
