package com.company;

public class Teacher {

    String Teacher_name;
    int entries;
    Student student;

public Teacher(String Teacher_name,Student student){
    this.Teacher_name= Teacher_name;
    this.student = student;
}

    public Teacher(String Teacher_name,int entries){
        this.Teacher_name= Teacher_name;
        this.entries = entries;
    }

}