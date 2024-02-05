package com.company;

import java.util.ArrayList;

public class Student {

    String name;
    int physics;
    int chemistry;
    int maths;
    double average;
    double total;

    public Student(String name){
        this.name=name;
    }

    public Student(String name,int physics,int chemistry,int maths){
        this.name=name;
        this.physics=physics;
        this.chemistry=chemistry;
        this.maths=maths;
        this.total= maths+physics+chemistry;
        this.average= (this.total)/3;
    }

    double average(int physics, int chemistry, int maths) {

        return (physics+chemistry+maths)/3;
    }

    double Total(int physics, int chemistry, int maths) {
        return (physics+chemistry+maths);
    }





}