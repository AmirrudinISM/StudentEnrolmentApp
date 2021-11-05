
import com.unikl.studentenrolmentapp.Course;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Amirr
 */
public class CourseDriver {
    public static void main(String[] args) {
        Course testCourse1 = new Course("CS1001", "Introduction to Programming", 3, "This is the course for new programmers");
        Course testCourse2 = new Course("CS2001", "Object-Oriented Programming", 3, "This is the course for learning the object-oriented paradigm");
        Course testCourse3 = new Course("CS2002", "Algorithm Design & Data Structure", 3, "This is the course for learning existing algorithms and data structures and applying it to systems");
        Course testCourse4 = new Course("CS3001", "Operating Systems", 3, "This is the course for designing operating systems");
        
        System.out.println(testCourse1);
        System.out.println(testCourse2);
        System.out.println(testCourse3);
        System.out.println(testCourse4);
    }
}
