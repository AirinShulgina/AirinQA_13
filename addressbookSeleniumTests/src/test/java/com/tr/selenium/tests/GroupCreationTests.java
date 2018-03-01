package com.tr.selenium.tests;

import com.tr.selenium.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void groupCreationTest() {
        app.goToGroupsPage();
        int before = app.getGroupHelper().getGroupCount();

        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData().
                withGroupName("test1").
                //withGroupHeader("Test1Header").
                withGroupFooter("Test1Footer"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupsPage();

        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after, before+1);

    }

}