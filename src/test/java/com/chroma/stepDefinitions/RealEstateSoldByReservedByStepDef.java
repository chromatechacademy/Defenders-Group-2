package com.chroma.stepDefinitions;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.chroma.appsCommon.PageInitializer;

import cucumber.api.java.en.Then;

public class RealEstateSoldByReservedByStepDef extends PageInitializer {

    @Then("agent scroll down to {string} and clicks on it")
public void agent_scroll_down_to_and_clicks_on_it(String string) {
   
         JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//p[normalize-space()='Sold By Me']")));
        js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//p[normalize-space()='Sold By Me']")));
    }

}
