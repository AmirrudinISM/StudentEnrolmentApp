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
public class AdminController {
   
    
        Database database;

    public AdminController(Database database) {
        this.database = database;
    }
    
   
     public void ApproveCourse(String stdID, String status, String title){
        for (int i = 0; i < tableEnrolment.size(); i++){
            String currSrudentID = tableEnrolment.get(i).getStudentID();
            String courseStatus = tableEnrolment.get(i).getStatus();
            String courseTitle= tableEnrolment.get(i).getCourseTitle();
              if(currSrudentID.equals(stdID) && courseStatus.equals("PENDING ADD") && courseTitle.equals(title)){
                
                tableEnrolment.get(i).setStatus(status);
                
            }
              if(currSrudentID.equals(stdID) && courseStatus.equals("PENDING DROP") && courseTitle.equals(title)){
                
                tableEnrolment.get(i).setStatus(status);
                
            }
           }
    }
}
