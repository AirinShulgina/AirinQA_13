package com.telRan.course.tests;

import org.testng.annotations.Test;

import org.openqa.selenium.*;

public class CreateNewList extends TestBase {

    @Test
    public void createNewList() {
        app.login("elena.telran@yahoo.com", "12345.com");
        selectBoard();
        clickAddList();
        enterListName("newList");
        clickSaveButton();

    }

    private void enterListName(String name) {
        app.wd.findElement(By.xpath("//input[@class='list-name-input']")).click();
        app.wd.findElement(By.xpath("//input[@class='list-name-input']")).clear();
        app.wd.findElement(By.xpath("//input[@class='list-name-input']")).sendKeys(name);
    }

    public void selectBoard() {
        app.wd.findElement(By.xpath("//span[@class='board-tile-details is-badged']//span[@title='newBoard']")).click();
    }
    private void clickAddList() {
        app.wd.findElement(By.cssSelector("span.placeholder.js-open-add-list")).click();
    }
    private void clickSaveButton() {
        app.wd.findElement(By.xpath("//input[@class='primary mod-list-add-button js-save-edit']")).click();
    }
}