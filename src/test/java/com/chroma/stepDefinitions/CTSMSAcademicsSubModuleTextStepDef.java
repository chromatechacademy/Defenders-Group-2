package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.CTSMSAcadmicsSubModuleTextStepImpl;
import cucumber.api.java.en.Then;

public class CTSMSAcademicsSubModuleTextStepDef extends PageInitializer {

    @Then("user should be able to see the following sub module {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_should_be_able_to_see_the_following_sub_module(String classTimetableSubModule,
            String teachersTimetableSubModule, String assignClassTeacherSubModule,
            String promoteStudentsSubModule, String subjectGroupSubModule, String subjectsSubModule,
            String classSubModule, String sectionsSubModule) {
        CTSMSAcadmicsSubModuleTextStepImpl.acadmicsSubModule(classTimetableSubModule, teachersTimetableSubModule,
                assignClassTeacherSubModule, promoteStudentsSubModule, subjectGroupSubModule, subjectsSubModule,
                classSubModule, sectionsSubModule);
    }
}
