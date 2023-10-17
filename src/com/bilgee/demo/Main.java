package com.bilgee.demo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {







        TestLists score = new TestLists();

        score.arrayListMethod();
        score.linkedListMethod();

        List<Student> studentList = new ArrayList<>();

        for ( int i = 1; i<=5; i++){
            String studentName = "Student " + i;
            int studentAge = 18 + i;
            Student newStudent = new Student( studentName,studentAge );
            studentList.add( newStudent );
        }
        for (Student student : studentList){
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}
