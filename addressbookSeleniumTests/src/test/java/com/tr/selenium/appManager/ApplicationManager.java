package com.tr.selenium.appManager;

import com.tr.selenium.model.SessionData;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    private GroupHelper groupHelper ;
    private SessionHelper sessionHelper;//declare sessionHelper
    private ContactHelper contactHelper;
    private NavigationHelper navigationHelper;
    FirefoxDriver wd;

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void start() {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        wd.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
        groupHelper = new GroupHelper(wd);//initialization GroupHelper
        sessionHelper = new SessionHelper(wd);//initialize and build an instance of sessionHelper
        contactHelper = new ContactHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        openSite();
        sessionHelper.logIn(new SessionData()
                            .setUser("admin")
                            .setPassword("secret"));
    }


    public void openSite() {
        wd.get("http://localhost/addressbook/");
    }

    public void stop() {
        wd.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public SessionHelper getSessionHelper(){//generate getter for sessionHelper
        return sessionHelper;
    }

    public ContactHelper getContactHelper(){
        return contactHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}


