package com.tr.selenium.appManager;

import com.tr.selenium.model.ContactData;
import com.tr.selenium.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GroupHelper extends HelperBase {
    FirefoxDriver wd;

    public GroupHelper(FirefoxDriver wd) {
        super(wd);
    }



    public void returnToGroupsPage() {
        click(By.linkText("group page"));
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void fillGroupForm(GroupData groupData) {
        type("group_name", groupData.getGroupName());
        type("group_header", groupData.getGroupHeader());
        type("group_footer", groupData.getGroupFooter());
    }


    public void initGroupCreation() {
        click(By.name("new"));
    }




    public void selectGroup() {
        click(By.name("selected[]"));
    }

    public void initGroupDeletion() {
        click(By.name("delete"));
    }

    public void initGroupModification() {
        click(By.name("edit"));
    }

    public void submitGroupModification() {
        click(By.xpath("//input[@type='submit']"));
    }

    public void clickNewContactButton() {
        click(By.xpath("//a[@href='edit.php']"));

    }

    public void fillContactForm(ContactData contactData) {
        type("firstname", contactData.getName());

        type("lastname", contactData.getLastName());

        type("home", contactData.getHomePhone());

        type("address", contactData.getAddress());

    }

    public void clickEnterButton() {
        click(By.name("submit"));
    }

    public void clickHomeButton() {
        click(By.xpath("//a[@href='./']"));
    }

    public void clickEditButton() {
        click(By.xpath("//a[@href='edit.php?id=1']"));
    }

    public void clickUpdateButton() {
        click(By.name("update"));
    }

    public void clickCheckBoxButton() {wd.findElement(By.xpath("//input[@id='6']")).click();
    }

    public void clickDeletionButton() {wd.findElement(By.xpath("//html//div[2]/input[1]")).click();
    }
    public int getGroupCount() {

        return wd.findElements(By.name("selected[]")).size();
    }


}
