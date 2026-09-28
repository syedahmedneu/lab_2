/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2.ui;

/**
 *
 * @author syedahmed
 */
public class Student {
  private String name;
    private int age;
    private String gender;
    private String phone;
    private String continent;
    private String experience;
    private String photoPath;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
    
    public void setPhotoPath(String photoPath){
        this.photoPath = photoPath;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public String getContinent() {
        return continent;
    }

    public String getExperience() {
        return experience;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public Student(String name, int age, String gender, String phone, String continent, String experience, String photoPath) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.continent = continent;
        this.experience = experience;
        this.photoPath = photoPath;
    }

    @Override
    public String toString() {
        return  "Name: " + name + "\nAge: " + age + "\nGender: " + gender + "\nPhone: " + phone + "\nContinent: " + continent + "\nExperience: " + experience + "\nPhotoPath: " + photoPath;
    }
    
    
    
}
