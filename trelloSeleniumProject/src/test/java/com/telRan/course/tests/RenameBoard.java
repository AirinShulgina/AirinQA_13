package com.telRan.course.tests;

import com.telRan.course.model.BoardData;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RenameBoard extends TestBase {
    @BeforeClass
    public void preConditions(){
        app.login("elena.telran@yahoo.com", "12345.com");
    }

    @Test
    public void testRenameBoard(){
       app.selectBoard();
       app.clickOnTheBoardTitle();
       app.fillRenameBoardTitle(new BoardData("new name"));
       app.clickRenameBoardButton();
       app.returnToHomePage();

    }


}