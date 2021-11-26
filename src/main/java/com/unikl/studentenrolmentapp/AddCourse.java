/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unikl.studentenrolmentapp;

/**
 *
 * @author Arthuria
 */
public class AddCourse implements Command {
    
    
    @Override
    public boolean execute(Database database,String StudentId, String SelectedCourseId,String SelectedCourseTitle,int SelectedCourseCredit, String status){
               Enrolment enrolment = new Enrolment(StudentId,SelectedCourseId,  SelectedCourseTitle, SelectedCourseCredit, "PENDING ADD");
          
            if(database.tableEnrolment.add(enrolment)){
                return true;
            }else{
                return false;
            }
    }
}
