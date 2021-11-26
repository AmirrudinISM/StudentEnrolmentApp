/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unikl.studentenrolmentapp;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Amirr
 */
//
//Bachelor of Information Technology (Hons.) in Software Engineering
//Bachelor of Information Technology (Hons) in Computer System Security
//Bachelor of Multimedia Technology (Hons.) in Computer Animation
public class Database {
    
    public static ArrayList<Student> tableStudent = new ArrayList<Student>();
    public static ArrayList<Course> tableCourse = new ArrayList<Course>();
    public static ArrayList<Semester> tableSemester = new ArrayList<Semester>();
    public static ArrayList<Enrolment> tableEnrolment = new ArrayList<Enrolment>();
    
    private static Database database = new Database();
    
    private Database() {
        
        tableStudent.add(new Student("000000","asd","Test Student", "Test Program"));
        
        
       
        
        Course course1 = new Course("ISB42603", "ADVANCED PROGRAMMING", 3, "Learn Full-stack development using ASP.NET core MVC Framework");
        Course course2 = new Course("ISB42403", "WEB-APPLICATION DEVELOPMENT", 3, "Learn Full-stack development using ASP.NET Framework");
        Course course3 = new Course("ISB37603", "SOFTWARE DEVELOPMENT & INTEGRATION", 3, "This course aims to teach student on how to use a systematic approach to developing software that meets industry standard by introducind software patterns and architecture as well as emphasizing on sustainable software design");
        Course course4 = new Course("ISB36403", "INTERACTION DESIGN", 3, "Learn principles of UI/UX design as well as front-end development");
        tableCourse.add(course1);
        tableCourse.add(course2);
        tableCourse.add(course3);
        tableCourse.add(course4);
        tableCourse.add(new Course("IGB10403", "DISCRETE MATHEMATICS FOR IT",3,""));
        tableCourse.add(new Course("WEB10302", "FUNDAMENTAL ENGLISH",2,""));
        tableCourse.add(new Course("IDB20203", "OPERATING SYSTEMS",3,""));
        tableCourse.add(new Course("ISB10103", "PRINCIPLES OF COMPUTER PROGRAMMING",3,""));
        tableCourse.add(new Course("WEB20202", "PROFESSIONAL ENGLISH 1",2,""));
        tableCourse.add(new Course("MPU3123", "TAMADUN ISLAM & TAMADUN ASIA (TITAS)",3,""));
        tableCourse.add(new Course("WBB20103","TECHNOPRENEURSHIP",3,""));
        tableCourse.add(new Course("IKB20803","COMPUTER ORGANIZATION",3,""));
        tableCourse.add(new Course("MPU3113","HUBUNGAN ETNIK",3,""));
        tableCourse.add(new Course("IDB10103","INTRODUCTION TO COMPUTING AND INFORMATION SYSTEMS",3,""));
        tableCourse.add(new Course("ISB16003","OBJECT-ORIENTED PROGRAMMING",3,""));
        tableCourse.add(new Course("MPU3242","INNOVATION MANAGEMENT",2,""));
        tableCourse.add(new Course("WMD10201","MANDARIN 2",1,""));
        tableCourse.add(new Course("WBB20103","TECHNOPRENEURSHIP",3,""));
        tableCourse.add(new Course("ISB37503","REAL TIME AND EMBEDDED SYSTEMS",3,""));
        
        
    }
    
    public static Database getInstance(){
        return database;
    }
    
    public static String[] getCourseNames(){
        String[] temp = new String[tableCourse.size()];
        for (int i = 0; i < tableCourse.size(); i++){
            temp[i] = tableCourse.get(i).getTitle();
        }
        return temp;
    }
    
    public static void printTable(String tableName){
        if (tableName == "ENROLMENT"){
            for (int i = 0; i < tableEnrolment.size(); i++){
                System.out.println(tableEnrolment.get(i));
            }
        }
        
        System.out.println("-------------------------------");
    }
    
    public static Student getStudent(String studentID){
        Student currStudent = null;
        for(int i = 0; i < tableStudent.size(); i++){
            if (tableStudent.get(i).getId().equals(studentID)){
                currStudent = tableStudent.get(i);
            }
        }
        return currStudent;
    }
    
    public static DefaultTableModel getAdminDashBoardModel(String stdID,String status){
        DefaultTableModel model = new DefaultTableModel();
        Vector<String> columnNames = new Vector<String>();
        columnNames.addElement("Student ID");
        columnNames.addElement("Course Title");
        columnNames.addElement("Credit Hours");
        columnNames.addElement("Status");
        model.setColumnIdentifiers(columnNames);  
        
        for (int i = 0; i < tableEnrolment.size(); i++){
            String currSrudentID = tableEnrolment.get(i).getStudentID();
              String courseStatus = tableEnrolment.get(i).getStatus();

              if(status =="CURRENTLY TAKING"){

                    if(currSrudentID.equals(stdID) && courseStatus.equals(status)){
                        
                        String StudentId = tableEnrolment.get(i).getStudentID();
                        String CourseTitle = tableEnrolment.get(i).getCourseTitle();
                        String CreditHours = String.valueOf(tableEnrolment.get(i).getCourseCreditHours());
                        String Status = tableEnrolment.get(i).getStatus();
                        Object[] data = {StudentId, CourseTitle, CreditHours, Status};
                        model.addRow(data);

                    }

              }else{

                        if(currSrudentID.equals(stdID)&& (courseStatus.equals("PENDING ADD") || courseStatus.equals("PENDING DROP"))){
                            
                            String StudentId = tableEnrolment.get(i).getStudentID();
                            String CourseTitle = tableEnrolment.get(i).getCourseTitle();
                            String CreditHours = String.valueOf(tableEnrolment.get(i).getCourseCreditHours());
                            String Status = tableEnrolment.get(i).getStatus();
                            Object[] data = {StudentId, CourseTitle, CreditHours, Status};
                            model.addRow(data);
                }
            } 
        }
        return model;
    }
    
    public static DefaultTableModel getRequestedEnrolmentModel(String stdID, String status){
        DefaultTableModel model = new DefaultTableModel();
        Vector<String> dataVector = new Vector<String>();
        Vector<String> columnNames = new Vector<String>();
        columnNames.addElement("Course Title");
        columnNames.addElement("Credit Hours");
        columnNames.addElement("Status");
        model.setColumnIdentifiers(columnNames);

        for (int i = 0; i < tableEnrolment.size(); i++){
            String currSrudentID = tableEnrolment.get(i).getStudentID();
              String courseStatus = tableEnrolment.get(i).getStatus();

              if(status =="CURRENTLY TAKING"){

                    if(currSrudentID.equals(stdID) && courseStatus.equals(status)){
                        String CourseTitle = tableEnrolment.get(i).getCourseTitle();
                        String CreditHours = String.valueOf(tableEnrolment.get(i).getCourseCreditHours());
                        String Status = tableEnrolment.get(i).getStatus();
                        Object[] data = {CourseTitle, CreditHours, Status};
                        model.addRow(data);

                    }

              }else{

                        if(currSrudentID.equals(stdID)&& (courseStatus.equals("PENDING ADD") || courseStatus.equals("PENDING DROP"))){

                            String CourseTitle = tableEnrolment.get(i).getCourseTitle();
                            String CreditHours = String.valueOf(tableEnrolment.get(i).getCourseCreditHours());
                            String Status = tableEnrolment.get(i).getStatus();
                            Object[] data = {CourseTitle, CreditHours, Status};
                            model.addRow(data);
                }
            } 
        }

        return model;
    }
    
    
    
    public static DefaultTableModel getAllFromTableStudent(){
        Vector<String> columnNames = new Vector<String>();
        columnNames.addElement("ID");
        columnNames.addElement("Name");
        columnNames.addElement("Program"); 
        columnNames.addElement("Accumulated Credit Hours");
        
        DefaultTableModel model = new DefaultTableModel(columnNames,0);
        
        
        
        for (int i = 0; i < tableStudent.size(); i++){
            
            String studentID = tableStudent.get(i).getId();
            
                for (int y=0; y< tableEnrolment.size(); y++){

                String currSrudentID = tableEnrolment.get(y).getStudentID();
                String courseStatus = tableEnrolment.get(y).getStatus();

                if(currSrudentID.equals(studentID)&& (courseStatus.equals("PENDING ADD") || courseStatus.equals("PENDING DROP"))){
                String studentName = tableStudent.get(i).getName();
                String studentProgram = tableStudent.get(i).getProgram();
                int studentCreditHours = select_SumOfApprovedCreditHours_Where_StudentID(studentID);
                Object[] data = {studentID, studentName, studentProgram, studentCreditHours};
                model.addRow(data);

                break;
                            }
                }
        }
        
        return model;
    }
    
    public static int select_SumOfRequestedCreditHours_Where_StudentID(String stdID){
        int sum = 0;
        for (int i = 0; i < tableEnrolment.size(); i++){
            String currSrudentID = tableEnrolment.get(i).getStudentID();
            String courseStatus = tableEnrolment.get(i).getStatus();
            if(currSrudentID.equals(stdID) && courseStatus.equals("PENDING ADD")){
                
                sum += tableEnrolment.get(i).getCourseCreditHours();
                
            }
        }
        return sum;
    }
    
  
    

    
    public static int select_SumOfRequestedCreditHours_Where_StudentID(String stdID, String status){
        int sum = 0;
        for (int i = 0; i < tableEnrolment.size(); i++){
            String currSrudentID = tableEnrolment.get(i).getStudentID();
            String courseStatus = tableEnrolment.get(i).getStatus();

            if(currSrudentID.equals(stdID) && courseStatus.equals(status)){

                sum += tableEnrolment.get(i).getCourseCreditHours();

            }
        }
        return sum;
    }
    
    public static int select_SumOfApprovedCreditHours_Where_StudentID(String stdID){
        int sum = 0;
        for (int i = 0; i < tableEnrolment.size(); i++){
            String currSrudentID = tableEnrolment.get(i).getStudentID();
            String courseStatus = tableEnrolment.get(i).getStatus();
            if(currSrudentID.equals(stdID) && courseStatus.equals("CURRENTLY TAKING")){
                
                sum += tableEnrolment.get(i).getCourseCreditHours();
                
            }
        }
        return sum;
    }
}
