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
    private char status;
    private int semester;
    //TO DO:
    //Savekan data ni dalam text file. Refer OOP punya project
    //dan tambah field credit hours untuk kira total credit hours student.

    public Enrolment(String studentID, String courseID, char status, int semester) {
        this.studentID = studentID;
        this.courseID = courseID;
        this.status = status;
        this.semester = semester;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getCourseID() {
        return courseID;
    }

    public char getStatus() {
        return status;
    }

    public int getSemester() {
        return semester;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
    
    
}
