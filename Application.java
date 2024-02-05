package com.company;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Application {

    public static void main(String[] args){


ArrayList<Student> student = new ArrayList<>();



        Scanner sc = new Scanner(System.in);

        System.out.println("--- Welcome to our Application : ---");
        System.out.println("Please enter teacher name : ");
        String Teacher_name = sc.nextLine();


        System.out.println("Enter the number of student entries :");
        int entries = sc.nextInt();
        Teacher teacher = new Teacher(Teacher_name,entries);

        for(int i=0;i<entries;i++){
           System.out.println("Please enter student name : ");
           String name= sc.next();



            System.out.println("Please enter student Physics Score");
            int p= sc.nextInt();

            System.out.println("Please enter student Chemistry Score");
            int c= sc.nextInt();

            System.out.println("Please enter student's Maths Score");
            int m= sc.nextInt();
      student.add(new Student(name,p,c,m));



        }

        System.out.print("_________"+"Teacher name :"+ Teacher_name+"___________");System.out.println("_________"+"Total Students : "+ entries+"___________");
        System.out.println("_____________________________________________________________________________________________________________________________________________________________________________________________________________________");
        System.out.println("Student Name"+ "                "+"  Physics score   " + "                "+ "Chemistry Score "+"                "+"Maths Score  "+"                "+"Total Marks " +"                   "+"Average Score"               );
        System.out.println("_____________________________________________________________________________________________________________________________________________________________________________________________________________________");
        for(Student stu : student){


            System.out.println(new StringBuilder().append(stu.name).append("                          ").append(stu.maths).append("                             ").append(stu.chemistry).append("                               ").append(stu.physics).append("                               ").append(stu.total).append("                               ").append(stu.average).append("                               "));
            System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________________________________");





        }
    }
}
