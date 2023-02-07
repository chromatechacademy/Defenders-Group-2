package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;
import com.chroma.web.JavascriptUtils;
import cucumber.api.java.en.Then;

public class RealEstateSoldByReservedByStepDef extends PageInitializer {

    @Then("agent scroll down to {string} and clicks on it")
    public void agent_scroll_down_to_and_clicks_on_it(String soldByMeButton) throws InterruptedException {

        JavascriptUtils.scrollIntoView(realEstateSoldByReservedByPage.soldByMeButton);
        realEstateSoldByReservedByPage.soldByMeButton.click();
        CommonUtils.sleep(2000);

    }

    @Then("a pop-up displays with the text: {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void a_pop_up_displays_with_the_text(String Id, String Project, String Price, String Beds,
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
    }

    @Then("agent clicks on close button on a pop-up display")
    public void agent_clicks_on_close_button_on_a_pop_up_display() {
        realEstateSoldByReservedByPage.closeButtonSoldBy.click();
    }

    @Then("clicks on {string}")
    public void clicks_on(String reservedBy) {
        realEstateSoldByReservedByPage.reservedByMeButton.click();
        CommonUtils.sleep(2000);
    }

    @Then("a pop-up displays with the text: {string}ID{string}PROJECT{string}PRICE{string}BEDS{string}BATHS{string}CARS{string}CAR LOTS{string}STORAGE LOTS{string}LEVEL{string}ASPECT{string}TOTAL ARIA{string}STATUS{string}RESERVED BY\"")
    public void a_pop_up_displays_with_the_text_ID_PROJECT_PRICE_BEDS_BATHS_CARS_CAR_LOTS_STORAGE_LOTS_LEVEL_ASPECT_TOTAL_AREA_STATUS_RESERVED_BY(
            String Id, String Project, String Price, String Beds, String Baths, String Cars,
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
    }

    @Then("agent clicks on close button on pop-up display")
    public void agent_clicks_on_close_button_on_pop_up_display() {
        realEstateSoldByReservedByPage.closeButtonReservedBy.click();
    }
}
