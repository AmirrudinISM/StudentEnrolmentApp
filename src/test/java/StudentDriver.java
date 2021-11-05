
import com.unikl.studentenrolmentapp.Student;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Amirr
 */
public class StudentDriver {
    public static void main(String[] args) {
        Student test = new Student("abc123","Amir", "BSE");
        System.out.println(test);
        
        Student test1 = new Student("abc123","Rizal", "BNS");
        System.out.println(test1);
        Student test2 = new Student("abc123","Rahim", "BCE");
        System.out.println(test2);
        Student test3 = new Student("abc123","Syarifah", "BCEM");
        System.out.println(test3);
    }
}
