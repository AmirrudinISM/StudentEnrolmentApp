/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.unikl.studentenrolmentapp;

/**
 *
 * @author Arthuria
 */
public interface Command {
    
    public boolean execute(Database database,String StudentId, String SelectedCourseId,String SelectedCourseTitle,int SelectedCourseCredit, String status);
    

}
