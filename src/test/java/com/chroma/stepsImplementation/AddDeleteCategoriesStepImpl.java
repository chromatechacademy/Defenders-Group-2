package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.AddDeleteStudentCategoriesPage;
import com.chroma.web.CommonUtils;

public class AddDeleteCategoriesStepImpl extends PageInitializer {

    /* Admin Selects Student Categories */
    public static void adminSelectsStudentCategories() {
        addDeleteStudentCategoriesPage.studentCategories.click();
        CommonUtils.nonMobileScreenshots();
    }

    /* Admin Is Directed To Category Page */
    public static void adminDirectedToCategoryPage(String expectedCategoryPageText) {
        String actualCategoryPageText = addDeleteStudentCategoriesPage.createCategoryText.getText();
        CommonUtils.assertEquals(expectedCategoryPageText, actualCategoryPageText);
        CommonUtils.nonMobileScreenshots();
    }

    /* Admin Enters Category */
    public static void adminEntersCategory(String categoryName) {
        addDeleteStudentCategoriesPage.categoryText.sendKeys(categoryName);
        CommonUtils.nonMobileScreenshots();
    }

    /* Admin Clicks On The Category Save Button */
    public static void adminClicksCategorySaveButton() {
        addDeleteStudentCategoriesPage.categorySaveButton.click();
        CommonUtils.nonMobileScreenshots();
    }

    /* Category Is Succesfully Saved And Conformation Message Displays */
    public static void categoryConformationMessage(String expectedCategorySaveSuccessfullyText) {
        String actualCategorySaveSuccessfullyText = addDeleteStudentCategoriesPage.categorySaveButton.getText();
        CommonUtils.assertEquals(expectedCategorySaveSuccessfullyText, actualCategorySaveSuccessfullyText);
        CommonUtils.nonMobileScreenshots();
        CommonUtils.sleep(1000);
    }

    /* admin Clicks On Category Delete Button */
    public static void adminClicksCategoryDeleteButton(String categoryName) {
        AddDeleteStudentCategoriesPage.categoryDeleteLocator(categoryName).click();
        CommonUtils.nonMobileScreenshots();
    }

    /* Category Is Deleted */
    public static void categoryIsDeleted() {
        CommonUtils.nonMobileAutoAcceptAlert();
        CommonUtils.nonMobileScreenshots();
        CommonUtils.sleep(1000);
    }
}
