package com.campus.service;

public class Student {
    private int studentid;
    private String studentname;
    private int age;
    private String department;
    private int[] marks;

    //static variables
    static int studentCount = 0;

    //Default constructor
    public Student() {
        studentCount++;
    }
    //parameterized constructor
    public Student(int studentid, String studentname, int age, String department, int[] marks) {
        this.studentid = studentid;
        this.studentname = studentname;
        this.age = age;
        this.department = department;
        this.marks = marks;
        studentCount++;
    }

    //getter
    public int getStudentid() {
        return studentid;
    }
    public String getStudentname() {
        return studentname;
    }
    public int getAge() {
        return age;
    
}public String getDepartment() {
        return department;
    }
    public int[] getMarks() {
        return marks;
    }

    //setter
   // Setter methods
public void setStudentid(int studentid) {
    this.studentid = studentid;
}

public void setStudentname(String studentname) {
    this.studentname = studentname;
}

public void setAge(int age) {
    this.age = age;
}

public void setDepartment(String department) {
    this.department = department;
}

public void setMarks(int[] marks) {
    this.marks = marks;
}
public void displayStudentInfo() {
    System.out.println("Student ID: " + studentid);
    System.out.println("Student Name: " + studentname);
    System.out.println("Age: " + age);
    System.out.println("Department: " + department);
}
public void displaystudentinfo(boolean showMark){
    displayStudentInfo();
    if (showMark) {
        System.out.println("Marks:" + java.util.Arrays.toString(marks));
    }
    //static method_belong to class,not
    public static void displayStudentCount() {
 
        System.out.println("Total number of students: " + studentCount);
    }
}
}