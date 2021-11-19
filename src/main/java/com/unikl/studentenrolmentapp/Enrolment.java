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
public class Enrolment {
    private String studentID;
    private String courseID;
    private String courseTitle;
    private int courseCreditHours;
    private String status;
    
    //TO DO:
    //Savekan data ni dalam text file. Refer OOP punya project
    //dan tambah field credit hours untuk kira total credit hours student.

    public Enrolment(String studentID, String courseID, String status) {
        this.studentID = studentID;
        this.courseID = courseID;
        this.status = status;
        
    }

    public Enrolment(String studentID, String courseID, String courseTitle, int courseCreditHours, String status) {
        this.studentID = studentID;
        this.courseID = courseID;
        this.courseTitle = courseTitle;
        this.courseCreditHours = courseCreditHours;
        this.status = status;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getCourseID() {
        return courseID;
    }

    public String getStatus() {
        return status;
    }

   

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCourseCreditHours() {
        return courseCreditHours;
    }

    public void setCourseCreditHours(int courseCreditHours) {
        this.courseCreditHours = courseCreditHours;
    }
    
    
    @Override
    public String toString() {
        return "Student ID: " + this.studentID + ", Course ID: " + this.courseID + ", Status: " + this.status;
    }

    
    
}
