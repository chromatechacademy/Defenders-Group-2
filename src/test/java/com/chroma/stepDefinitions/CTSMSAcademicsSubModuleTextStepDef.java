package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Then;

public class CTSMSAcademicsSubModuleTextStepDef extends PageInitializer{
    
    @Then("user should be able to see the following sub module {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_should_be_able_to_see_the_following_sub_module(String classTimetableSubModule, String teachersTimetableSubModule, String assignClassTeacherSubModule,
            String promoteStudentsSubModule, String subjectGroupSubModule, String subjectsSubModule, String classSubModule, String sectionsSubModule) {
        String actualClassTimetableSubModuleText = academyDashBoardPage.classTimeTableSubModule.getText();
        CommonUtils.assertEquals(classTimetableSubModule, actualClassTimetableSubModuleText);
        String actualTeachersTimetableSubModuleText = academyDashBoardPage.teachersTimetableSubModule.getText();
        CommonUtils.assertEquals(teachersTimetableSubModule, actualTeachersTimetableSubModuleText);
        String actualAssignClassTeacherSubModuleText = academyDashBoardPage.assignClassTeacherSubModule.getText();
        CommonUtils.assertEquals(assignClassTeacherSubModule, actualAssignClassTeacherSubModuleText);
        String actualPromoteStudentsSubModuleText = academyDashBoardPage.promoteStudentsSubModule.getText();
        CommonUtils.assertEquals(promoteStudentsSubModule, actualPromoteStudentsSubModuleText);
        String actualSubjectGroupSubModuleText = academyDashBoardPage.subjectGroupSubModule.getText();
        CommonUtils.assertEquals(subjectGroupSubModule, actualSubjectGroupSubModuleText);
        String actualSubjectsSubModuleText = academyDashBoardPage.subjectsSubModule.getText();
        CommonUtils.assertEquals(subjectsSubModule, actualSubjectsSubModuleText);
        String actualClassSubModuleText = academyDashBoardPage.classSubModule.getText();
        CommonUtils.assertEquals(classSubModule, actualClassSubModuleText);
        String actualSectionsSubModuleText = academyDashBoardPage.sectionsSubModule.getText();
        CommonUtils.assertEquals(sectionsSubModule, actualSectionsSubModuleText);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }
}
