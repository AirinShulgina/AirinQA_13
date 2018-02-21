package com.telRan.course.tests;

import org.testng.annotations.*;

public class LoginTrelloTest extends TestBase {

    @Test
    public void LoginTrelloTest() {
        app.login("elena.telran@yahoo.com", "12345.com");
        app.logout();

    }

}
