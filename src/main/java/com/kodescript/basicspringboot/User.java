package com.kodescript.basicspringboot;

public class User {

    private String name;
    private String address;
    private Boolean isActived;


    public void setActived(Boolean actived) {
        isActived = actived;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActived() {
        return isActived;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }
}
