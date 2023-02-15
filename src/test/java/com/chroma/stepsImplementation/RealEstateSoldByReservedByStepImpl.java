package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;
import com.chroma.web.JavascriptUtils;

public class RealEstateSoldByReservedByStepImpl extends PageInitializer {

    /* Agent Scroll Down To Sold By Me And Clicks On It */
    public static void agentScrollDownAndClicksOnSoldByMeButton(String soldByMeButton) {
        JavascriptUtils.scrollIntoView(realEstateSoldByReservedByPage.soldByMeButton);
        realEstateSoldByReservedByPage.soldByMeButton.click();
        CommonUtils.sleep(2000);
        CommonUtils.nonMobileScreenshots();
    }

    /* Pop Up Displays Texts */
    public static void popUpDisplayFollowingText(String Id, String Project, String Price, String Beds,
            String Baths, String Cars, String CarLots, String StorageLots, String Level, String Aspect,
            String TotalArea, String Status, String SoldBy) {
        String actualIdText = realEstateSoldByReservedByPage.idText.getText();
        CommonUtils.assertEquals(Id, actualIdText);
        String actualProjectText = realEstateSoldByReservedByPage.projectText.getText();
        CommonUtils.assertEquals(Project, actualProjectText);
        String actualPriceText = realEstateSoldByReservedByPage.priceText.getText();
        CommonUtils.assertEquals(Price, actualPriceText);
        String actualBedsText = realEstateSoldByReservedByPage.bedsText.getText();
        CommonUtils.assertEquals(Beds, actualBedsText);
        String actualBathsText = realEstateSoldByReservedByPage.bathsText.getText();
        CommonUtils.assertEquals(Baths, actualBathsText);
        String actualCarsText = realEstateSoldByReservedByPage.carsText.getText();
        CommonUtils.assertEquals(Cars, actualCarsText);
        String actualCarLotsText = realEstateSoldByReservedByPage.carLotsText.getText();
        CommonUtils.assertEquals(CarLots, actualCarLotsText);
        String actualStorageLotsText = realEstateSoldByReservedByPage.storageLotsText.getText();
        CommonUtils.assertEquals(StorageLots, actualStorageLotsText);
        String actualLevelText = realEstateSoldByReservedByPage.levelText.getText();
        CommonUtils.assertEquals(Level, actualLevelText);
        String actualAspectText = realEstateSoldByReservedByPage.aspectText.getText();
        CommonUtils.assertEquals(Aspect, actualAspectText);
        String actualTotalAreaText = realEstateSoldByReservedByPage.totalAreaText.getText();
        CommonUtils.assertEquals(TotalArea, actualTotalAreaText);
        String actualStatusText = realEstateSoldByReservedByPage.statusText.getText();
        CommonUtils.assertEquals(Status, actualStatusText);
        String actualSoldByText = realEstateSoldByReservedByPage.soldByText.getText();
        CommonUtils.assertEquals(SoldBy, actualSoldByText);
        CommonUtils.nonMobileScreenshots();
    }

    /* Agent Clicks On Close Button On a Pop Up Display */
    public static void agentClicksCloseButtonOnPopUp() {
        realEstateSoldByReservedByPage.closeButtonSoldBy.click();
        CommonUtils.nonMobileScreenshots();
    }

    /* User Clicks On Reserved By */
    public static void userClicksOnReservedBy(String reservedBy) {
        realEstateSoldByReservedByPage.reservedByMeButton.click();
        CommonUtils.sleep(2000);
        CommonUtils.nonMobileScreenshots();
    }

    /*
     * A Pop Up Displays With Text Id Project Price Beds, Baths, Cars, Car Lots,
     * Storage Lots, Level, Aspect, Total Area, Status Reserved By
     */
    public void PopUpDisplayTexts( String Id, String Project, String Price, String Beds, String Baths, String Cars,
            String CarLots, String StorageLots, String Level, String Aspect, String TotalArea, String Status,
            String ReservedBy) {
        String actualIdText2 = realEstateSoldByReservedByPage.idText2.getText();
        CommonUtils.assertEquals(Id, actualIdText2);
        String actualProjectText2 = realEstateSoldByReservedByPage.projectText2.getText();
        CommonUtils.assertEquals(Project, actualProjectText2);
        String actualPriceText2 = realEstateSoldByReservedByPage.priceText2.getText();
        CommonUtils.assertEquals(Price, actualPriceText2);
        String actualBedsText2 = realEstateSoldByReservedByPage.bedsText2.getText();
        CommonUtils.assertEquals(Beds, actualBedsText2);
        String actualBathsText2 = realEstateSoldByReservedByPage.bathsText2.getText();
        CommonUtils.assertEquals(Baths, actualBathsText2);
        String actualCarsText2 = realEstateSoldByReservedByPage.carsText2.getText();
        CommonUtils.assertEquals(Cars, actualCarsText2);
        String actualCarLotsText2 = realEstateSoldByReservedByPage.carLotsText2.getText();
        CommonUtils.assertEquals(CarLots, actualCarLotsText2);
        String actualStorageLotsText2 = realEstateSoldByReservedByPage.storageLotsText2.getText();
        CommonUtils.assertEquals(StorageLots, actualStorageLotsText2);
        String actualLevelText2 = realEstateSoldByReservedByPage.levelText2.getText();
        CommonUtils.assertEquals(Level, actualLevelText2);
        String actualAspectText2 = realEstateSoldByReservedByPage.aspectText.getText();
        CommonUtils.assertEquals(Aspect, actualAspectText2);
        String actualTotalAreaText2 = realEstateSoldByReservedByPage.totalAreaText2.getText();
        CommonUtils.assertEquals(TotalArea, actualTotalAreaText2);
        String actualStatusText2 = realEstateSoldByReservedByPage.statusText2.getText();
        CommonUtils.assertEquals(Status, actualStatusText2);
        String actualReservedBy = realEstateSoldByReservedByPage.reservedBy.getText();
        CommonUtils.assertEquals(ReservedBy, actualReservedBy);
        CommonUtils.nonMobileScreenshots();
    }

    /* Agent Clicks On Close Button On Pop Up Display */
    public static void agentClicksCloseBtnOnPopUp() {
        realEstateSoldByReservedByPage.closeButtonReservedBy.click();
        CommonUtils.nonMobileScreenshots();
    }
}
