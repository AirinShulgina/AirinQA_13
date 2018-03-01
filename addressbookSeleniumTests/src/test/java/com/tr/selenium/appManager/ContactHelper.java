package com.tr.selenium.appManager;

import com.tr.selenium.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ContactHelper extends HelperBase{

    public ContactHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void clickCheckBoxButton() {wd.findElement(By.xpath("//input[@id='6']")).click();
    }

    public void clickDeletionButton() {wd.findElement(By.xpath("//html//div[2]/input[1]")).click();
    }
    public int getGroupCount() {

        return wd.findElements(By.name("selected[]")).size();
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
}
