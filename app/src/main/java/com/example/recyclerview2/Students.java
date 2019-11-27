package com.example.recyclerview2;

public class Students {

    private String name;
    private String Age;
    private String Address;
    private String Gender;
    private int imgProfile;

    public Students(String name, String age, String address, String gender, int imgProfile) {
        this.name = name;
        Age = age;
        Address = address;
        Gender = gender;
        this.imgProfile = imgProfile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public int getImgProfile() {
        return imgProfile;
    }

    public void setImgProfile(int imgProfile) {
        this.imgProfile = imgProfile;
    }

}

