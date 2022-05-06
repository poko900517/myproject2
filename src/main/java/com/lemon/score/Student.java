package com.lemon.score;

public class Student implements Printable{
    String name;
    int english;
    int math;
    int average;
    public Student(String name){//Constructor
        this.name= name;
    }
    public Student(String name,int english,int math){//Constructor
        this(name);
        //this.namex =name;
        this.english =english;
        this.math = math;
    }
    public Student(){
    }
    @Override
    public void print(){
        System.out.print(name+"\t"+english+"\t"+math+"\t"+average);
        if (average<60){
            System.out.println("#");
        }
        System.out.println();
    }
    public int getAverage(){
        return (english+math)/2;
}
}
