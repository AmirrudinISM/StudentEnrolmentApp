/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unikl.studentenrolmentapp;

/**
 *
 * @author Amirr
 */
public class Course {
    private String id;
    private String title;
    private int creditHour;
    private String description;

//    public Course() {
//    }

    public Course(String id, String title, int creditHour, String description) {
        this.id = id;
        this.title = title;
        this.creditHour = creditHour;
        this.description = description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCreditHour(int creditHour) {
        this.creditHour = creditHour;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getCreditHour() {
        return creditHour;
    }

    public String getDescription() {
        return description;
    }
    
    @Override
    public String toString(){
        return
                "ID: " + this.id + "\n" +
                "Course Title: " + this.title + "\n" +
                "Credit Hours: " + this.creditHour + "\n" +
                "Description: " + this.description + "\n"
                ;
    }
    
    
}
