/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
public class Student {
    private int regNumber;
    private String name;
    private int age;

    public Student(int regNumber, String name, int age) {
        this.regNumber = regNumber;
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Registration number: " + regNumber);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class UGStudent extends Student {
    private int semester;
    private double fees;
    private static int ugAdmissions = 0;

    public UGStudent(int regNumber, String name, int age, int semester, double fees) {
        super(regNumber, name, age);
        this.semester = semester;
        this.fees = fees;
        ugAdmissions++;
    }

    public void displayUGDetails() {
        displayDetails();
        System.out.println("Semester: " + semester);
        System.out.println("Fees: " + fees);
    }

    public static int getUGAdmissions() {
        return ugAdmissions;
    }
}

public class PGStudent extends Student {
    private int semester;
    private double fees;
    private static int pgAdmissions = 0;

    public PGStudent(int regNumber, String name, int age, int semester, double fees) {
        super(regNumber, name, age);
        this.semester = semester;
        this.fees = fees;
        pgAdmissions++;
    }

    public void displayPGDetails() {
        displayDetails();
        System.out.println("Semester: " + semester);
        System.out.println("Fees: " + fees);
    }

    public static int getPGAdmissions() {
        return pgAdmissions;
    }
}
