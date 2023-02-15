package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;

public class CTSMSAcadmicsSubModuleTextStepImpl extends PageInitializer{

    /* User Sees Acadmics Sub Module */
    public static void acadmicsSubModule(String classTimetableSubModule, String teachersTimetableSubModule, String assignClassTeacherSubModule,
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
        CommonUtils.nonMobileScreenshots();
    }
}
