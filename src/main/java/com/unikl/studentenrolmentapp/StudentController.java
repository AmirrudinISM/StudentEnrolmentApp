/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unikl.studentenrolmentapp;

import static com.unikl.studentenrolmentapp.Database.tableEnrolment;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Arthuria
 */
public class StudentController {
    
    Database database;
    
    public StudentController(Database database){
        
        this.database = database;
        
    }
    public boolean registerStudent(char[] password, String name, String program){
        
        String passwordString = "";
        
        for (int i = 0; i < password.length; i++){
            passwordString += password[i];
        }
        
        Student input = new Student(passwordString, name, program);
        
        if(database.tableStudent.add(input)){
            for (int i = 0; i < database.tableStudent.size(); i++){
               
                System.out.println(database.tableStudent.get(i));
            
            }
        System.out.println("-------------------------------------");
            return true;
            
        }else{
            
            return false;
            
        }
    }
    
    
    public boolean checkStudentAddCourse(String StudentId, String SelectedCourse){
        
         var checkdata= database.tableEnrolment.stream().filter(x -> x.getStudentID().equalsIgnoreCase(StudentId) && x.getCourseID().equalsIgnoreCase(SelectedCourse)).findFirst().orElse(null);
         
         if(checkdata == null){
             
             return true;
             
         }else{
             
             return false;
             
        }
    }
    
       public boolean StudentAddCourse(String StudentId, String SelectedCourseId,String SelectedCourseTitle,int SelectedCourseCredit,String status ){
       
  
         return new AddCourse().execute(database, StudentId, SelectedCourseId, SelectedCourseTitle, SelectedCourseCredit,status);
         
    }
       
          //  public boolean execute(Database database,String StudentId, String SelectedCourseId,String SelectedCourseTitle,int SelectedCourseCredit, String status);
       public boolean StudentDropCouse(String stdID,String selectedCourseId, String title, int creditHours,String status){
           
           
           return new DropCourse().execute(database, stdID, selectedCourseId, title, creditHours,status);
      
           
       }
}
