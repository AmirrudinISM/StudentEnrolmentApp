/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unikl.studentenrolmentapp;
import java.util.Date;
/**
 *
 * @author Amirr
 */
public class Semester {
    private int semesterNumber;
    private Date semesterStartDate;
    private int totalSemesterCreditHours;

    public Semester() {
        this.semesterNumber = 1;
        this.semesterStartDate = new Date();
        this.totalSemesterCreditHours = 0;
    }

    public int getSemesterNumber() {
        return semesterNumber;
    }

    public Date getSemesterStartDate() {
        return semesterStartDate;
    }

    public int getTotalSemesterCreditHours() {
        return totalSemesterCreditHours;
    }

    public void setSemesterNumber(int semesterNumber) {
        this.semesterNumber = semesterNumber;
    }

    public void setSemesterStartDate(Date semesterStartDate) {
        this.semesterStartDate = semesterStartDate;
    }

    public void setTotalSemesterCreditHours(int totalSemesterCreditHours) {
        this.totalSemesterCreditHours = totalSemesterCreditHours;
    }
    
    
    
    
}
