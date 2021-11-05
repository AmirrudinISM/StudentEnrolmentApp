/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnrolmentTests;

import com.unikl.studentenrolmentapp.Database;

/**
 *
 * @author Amirrudin
 */
public class TestDatabase {
    public static void main(String[] args) {
        Database database = Database.getInstance();
        
        String names[] = database.getCourseNames();
        
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
    }
}
