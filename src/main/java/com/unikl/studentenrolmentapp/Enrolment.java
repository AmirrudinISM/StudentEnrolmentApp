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
    private String status;
    
    //TO DO:
    //Savekan data ni dalam text file. Refer OOP punya project
    //dan tambah field credit hours untuk kira total credit hours student.

    public Enrolment(String studentID, String courseID, String status) {
        this.studentID = studentID;
        this.courseID = courseID;
        this.status = status;
        
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

    @Override
    public String toString() {
        return "Student ID: " + this.studentID + ", Course ID: " + this.courseID + ", Status: " + this.status;
    }

    
    
}
