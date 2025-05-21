import java.util.*;
public class Student {
    private String name;
    private int studentID;
    private double grade;
    static String schoolName = "Legends";

    public Student(String name, int studentID, double grade){
        this.name = name;
        this.studentID = studentID;
        this.grade = grade;
    }

    public String getName(){
        return name;
    }
    public int getStudentID(){
        return studentID;
    }
    public double getGrade(){
        return grade;
    }
    public String setName(String name){
        this.name = name;
        return name;
    }
    public double setGrade(double grade){
        this.grade = grade;
        return grade;
    }

    public void displayInfo(){
        System.out.println("Student Information");
        if(grade >=70){
            System.out.println("Grade: A");
        }else if(grade >=40){
            System.out.println("Grade: Pass");
        }else{
            System.out.println("Fail");
        }
    System.out.println("Name: " + name);
    System.out.println("StudentID:" + studentID);
    System.out.println("Score: " + grade);
    System.out.println("School: " + schoolName);
    }
    

}

