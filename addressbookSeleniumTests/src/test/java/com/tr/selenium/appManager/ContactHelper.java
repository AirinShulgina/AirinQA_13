package com.tr.selenium.appManager;

import com.tr.selenium.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactHelper extends HelperBase {

    public ContactHelper(FirefoxDriver wd){
        super(wd);
    }

    public void submitContactCreation() {
        click(By.name("submit"));
    }

    public void fillContactForm(ContactData contactData) {
       type(By.name("firstname"), contactData.getContactFirstName());
       type(By.name("lastname"), contactData.getContactLastName());
       type(By.name("address"), contactData.getContactAddress());
       type(By.name("mobile"), contactData.getContactMobilePhone());
       type(By.name("email"), contactData.getContactEmail());
    }

    public int getContactCount() {
        return wd.findElements(By.name("selected[]")).size();
    }

    public void clickContactCheckBoxToDelete() {
        click(By.name("selected[]"));

    }

    public void clickDeleteButtonOnHomePage() {
        click(By.xpath("//*[@value='Delete']"));
        wd.switchTo().alert().accept();

    }

    public void clickContactEditPencilIcon() {
        click(By.cssSelector("img[src='icons/pencil.png']"));

    }

    public void clickContactDeleteButtonOnEditPage() {
        click(By.xpath("//*[@value='Delete']"));
    }

    public void clickContactDetailsIcon() {
       click(By.cssSelector("img[src='icons/status_online.png']"));
    }

    public void clickContactModifyButton() {
        click(By.name("modifiy"));
    }

    public void modifyContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getContactFirstName());
    }

    public void clickContactUpdateButton() {
       click(By.name("update"));
    }
}
