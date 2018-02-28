package com.tr.selenium.tests;

import com.tr.selenium.model.ContactData;
import org.testng.annotations.Test;

public class ContactEditTests extends TestBase {
    @Test

    public void contactEditTests(){
app.getGroupHelper().clickEditButton();
app.getGroupHelper().fillContactForm(new ContactData("Sander","Shulgin","0525402417","haifa"));
app.getGroupHelper().clickUpdateButton();
app.getGroupHelper().clickHomeButton();
    }
}
