package com.telRan.course.tests;

import org.testng.annotations.Test;

import org.openqa.selenium.*;

public class CreateNewBoard extends TestBase {
    @Test
    public void createNewBoard() {
        app.login("elena.telran@yahoo.com", "12345.com");
        clickNewBoard();
        enterBoardName("newBoard");
        createBoard();
    }

    public void createBoard() {
        app.wd.findElement(By.cssSelector("button.primary")).click();
    }

    public void enterBoardName(String name) {
        app.wd.findElement(By.cssSelector("input.subtle-input")).click();
        app.wd.findElement(By.cssSelector("input.subtle-input")).clear();
        app.wd.findElement(By.cssSelector("input.subtle-input")).sendKeys(name);
    }

    public void clickNewBoard() {
        app.wd.findElement(By.xpath("//div[@class='js-react-root']//span[.='Create new board…']")).click();
    }

}