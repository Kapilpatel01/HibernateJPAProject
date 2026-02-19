package com.example;

import com.example.dao.StudentDAO;
import com.example.entity.Student;

public class MainApp {

    public static void main(String[] args) {
        StudentDAO dao=new StudentDAO();
//create
        dao.save(new Student("Kapil","Kapilkumar@gmail.com"));

        //view
//        Student s=dao.find(1);
//        System.out.println(s);

        //update
//        dao.update(1,"KapilKumar");

        //delete
//        dao.delete(1);

        //first level caching
        dao.testFirstLevelCache();

      //second level caching
        dao.find(1);   // First session
        dao.find(1);   // Second session


    }
}
