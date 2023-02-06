package com.chroma.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import com.chroma.appsCommon.PageInitializer;
import cucumber.api.java.en.Then;

public class RealEstateSoldByReservedByStepDef extends PageInitializer {

    @Then("agent scroll down to {string} and clicks on it")
    public void agent_scroll_down_to_and_clicks_on_it(String string) {

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView(true);",
                driver.findElement(By.xpath("//p[normalize-space()='Sold By Me']")));
        js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//p[normalize-space()='Sold By Me']")));
    }

    @Then("a pop-up displays with the text: {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void a_pop_up_displays_with_the_text(String string, String string2, String string3, String string4,
            String string5, String string6, String string7, String string8, String string9, String string10,
            String string11, String string12, String string13) {
    }
}
