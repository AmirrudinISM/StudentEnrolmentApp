/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unikl.studentenrolmentapp;

import java.util.Random;   
/**
 *
 * @author Amirr
 */
public class Student {
    private String id;
    private String password;
    private String name;
    private String program;
    private int accumulatedCreditHours;
    private int requestedCreditHours;
    
    private boolean isRegistered;

    public void setIsRegistered(boolean isRegistered) {
        this.isRegistered = isRegistered;
    }

    public boolean getIsRegistered() {
        return isRegistered;
    }
    


    public Student() {
        this.id = generateID();
        this.password = "000";
        this.name = "Dummy Student";
        this.program  = "Bachelor of Software Engineering (Honours)";
        this.accumulatedCreditHours = 0;
        this.requestedCreditHours = 0;
        this.isRegistered=false;
        
    }
    
    public Student(String password, String name, String program) {
        this.id = generateID();
        this.password = password;
        this.name = name;
        this.program  = program;
        this.accumulatedCreditHours = 0;
        this.requestedCreditHours = 0;
        this.isRegistered=false;
    }
    
    public Student(String id,String password, String name, String program) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.program  = program;
        this.accumulatedCreditHours = 0;
        this.requestedCreditHours = 0;
        this.isRegistered=false;
    }
    
    @Override
    public String toString(){
        return
                "ID: " + this.id + "\n" +
                "Password: " + this.password + "\n" +
                "Name: " + this.name + "\n" +
                "Program: " + this.program + "\n" +
                "Accumulated Credit Hours: " + this.accumulatedCreditHours + "\n"
                ;
    }
    
    public String generateID(){
        String studentID;
        int rand = new Random().nextInt(999999);
        studentID = String.valueOf(rand);
        if(studentID.length() < 6){
            studentID = '0' + studentID;
        }
        return studentID;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getProgram() {
        return program;
    }

    public int getAccumulatedCreditHours() {
        return accumulatedCreditHours;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setAccumulatedCreditHours(int accumulatedCreditHours) {
        this.accumulatedCreditHours = accumulatedCreditHours;
    }

    public int getRequestedCreditHours() {
        
        return requestedCreditHours;
    }

    public void setRequestedCreditHours(int requestedCreditHours) {
        this.requestedCreditHours = requestedCreditHours;
    }
    
    
}
