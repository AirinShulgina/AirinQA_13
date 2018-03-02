package com.tr.selenium.appManager;

import com.tr.selenium.model.SessionData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionHelper extends HelperBase {


    public SessionHelper(FirefoxDriver wd){
            super(wd);
    }

    public void logIn(SessionData sessionData){
        type(By.name("user"), sessionData.getUser());
        type(By.name("pass"), sessionData.getPassword());
        click(By.xpath("//form[@id='LoginForm']/input[3]"));
    }
}
