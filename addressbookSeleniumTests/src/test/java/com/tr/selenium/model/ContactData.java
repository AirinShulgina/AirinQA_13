package com.tr.selenium.model;

public class ContactData {
    private  String name;
    private  String lastName;
    private  String homePhone;
    private  String address;

    public ContactData(String name, String lastName, String homePhone, String address) {
        this.name = name;
        this.lastName = lastName;
        this.homePhone = homePhone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public String getAddress() {
        return address;
    }
}
