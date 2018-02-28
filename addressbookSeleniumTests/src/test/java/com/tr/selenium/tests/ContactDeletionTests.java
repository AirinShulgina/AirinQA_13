package com.tr.selenium.tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {
    @Test
    public void contactDeletionTests(){
        app.getGroupHelper().clickCheckBoxButton();
        app.getGroupHelper().clickDeletionButton();
        app.getGroupHelper().clickHomeButton();
    }
}
