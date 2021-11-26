/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unikl.studentenrolmentapp;

import static com.unikl.studentenrolmentapp.Database.tableEnrolment;

/**
 *
 * @author Arthuria
 */
public class DropCourse implements Command {
    
    public boolean execute(Database database,String StudentId, String SelectedCourseId,String SelectedCourseTitle,int SelectedCourseCredit, String status){
             boolean found=false;
           
           for (int i = 0; i < tableEnrolment.size(); i++){
                String currSrudentID = tableEnrolment.get(i).getStudentID();
                String courseStatus = tableEnrolment.get(i).getStatus();
                String courseTitle= tableEnrolment.get(i).getCourseTitle();
            
                
                if(currSrudentID.equals(StudentId) && courseStatus.equals("CURRENTLY TAKING") && courseTitle.equals(SelectedCourseTitle)){
                
                    tableEnrolment.get(i).setStatus(status);
                    found= true;
                  
                }
         }
           
           return found;
    }
}
