package com.tr.selenium.tests;

import com.tr.selenium.model.ContactData;
import org.testng.annotations.Test;

public class ContactsCreationTests extends TestBase {
    @Test
        public void contactsCreationTest(){
        app.getGroupHelper().clickNewContactButton();
        app.getGroupHelper().fillContactForm(new ContactData("Irin","Shulgina","0587066791","Hadera"));
        app.getGroupHelper().clickEnterButton();
        app.getGroupHelper().clickHomeButton();
    }
   }
