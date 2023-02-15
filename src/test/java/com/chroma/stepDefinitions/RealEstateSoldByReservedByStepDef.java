package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.RealEstateSoldByReservedByStepImpl;
import cucumber.api.java.en.Then;

public class RealEstateSoldByReservedByStepDef extends PageInitializer {

    @Then("agent scroll down to {string} and clicks on it")
    public void agent_scroll_down_to_and_clicks_on_it(String soldByMeButton) {
        RealEstateSoldByReservedByStepImpl.agentScrollDownAndClicksOnSoldByMeButton(soldByMeButton);
    }

    @Then("a pop-up displays with the text: {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void a_pop_up_displays_with_the_text(String Id, String Project, String Price, String Beds,
            String Baths, String Cars, String CarLots, String StorageLots, String Level, String Aspect,
            String TotalArea, String Status, String SoldBy) {
        RealEstateSoldByReservedByStepImpl.popUpDisplayFollowingText(
                Id, Project, Price, Beds, Baths, Cars, CarLots, StorageLots, Level, Aspect, TotalArea, Status, SoldBy);
    }

    @Then("agent clicks on close button on a pop-up display")
    public void agent_clicks_on_close_button_on_a_pop_up_display() {
        RealEstateSoldByReservedByStepImpl.agentClicksCloseButtonOnPopUp();
    }

    @Then("clicks on {string}")
    public void clicks_on(String reservedBy) {
        RealEstateSoldByReservedByStepImpl.userClicksOnReservedBy(reservedBy);
    }

    @Then("a pop-up displays with the text: {string}ID{string}PROJECT{string}PRICE{string}BEDS{string}BATHS{string}CARS{string}CAR LOTS{string}STORAGE LOTS{string}LEVEL{string}ASPECT{string}TOTAL ARIA{string}STATUS{string}RESERVED BY\"")
    public void a_pop_up_displays_with_the_text_ID_PROJECT_PRICE_BEDS_BATHS_CARS_CAR_LOTS_STORAGE_LOTS_LEVEL_ASPECT_TOTAL_AREA_STATUS_RESERVED_BY(
            String Id, String Project, String Price, String Beds, String Baths, String Cars,
            String CarLots, String StorageLots, String Level, String Aspect, String TotalArea, String Status,
            String ReservedBy) {
        RealEstateSoldByReservedByStepImpl.popUpDisplayFollowingText(Id, Project, Price, Beds, Baths, Cars, CarLots,
                StorageLots, Level, Aspect, TotalArea, Status, ReservedBy);
    }

    @Then("agent clicks on close button on pop-up display")
    public void agent_clicks_on_close_button_on_pop_up_display() {
        RealEstateSoldByReservedByStepImpl.agentClicksCloseBtnOnPopUp();
    }
}
