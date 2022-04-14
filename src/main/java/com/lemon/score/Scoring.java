package com.lemon.score;

import java.util.ArrayList;
import java.util.List;

public class Scoring {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Larry",80,50));
        students.add(new Student("Cindy",90,60));
        students.add(new GraduateStudent("lemon",100,70,50));
        for (Student stu : students){
            stu.print();
        }
    }
}
