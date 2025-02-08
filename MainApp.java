/* 
 * Program To Calculate The Grade Of A Student
 * Author: Thuku Josphat Wamwago
 * Reg No: CT101/G/19448/23
 * Date: 3/2/2025
 * Version: 1
 */


import java.util.Scanner;

//the class student
class Student{
    String name;
    double marks;

    //constructor
    Student(String name, double marks){
        this.name = name;
        this.marks = marks;
    }

    //method to display Student Details
    void displayDetails(){
        System.out.println("Student Name: " + this.name);
        System.out.println("Student Marks: " + this.marks);
    }
}
// grade calculating class
class gradingCalculator{
    double marks;

    //the constructor
    gradingCalculator(double marks){
        this.marks = marks;
    }

    //method to calculate the grade
    void calculateGrade(){


        if(this.marks>=90){
            System.out.println("Grade: A");
        }
        else if(this.marks<90 && this.marks>76  ){
            System.out.println("Grade: B");
        }
        else if(this.marks<75 && this.marks>51  ){
            System.out.println("Grade: C");
        }
        else{
            System.out.println("Grade: D");
        }



    }
}
public class MainApp {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //input of name from user
        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();

        //input of marks from user
        System.out.print("Enter Your Marks: ");
        int marks = scanner.nextInt();

        //Student object
        Student student = new Student(name, marks);
        //grading calculator object
        gradingCalculator calculation = new gradingCalculator(marks);

        //calling of the method to display Student details
        student.displayDetails();

        //calling of the method to calculate grade
        calculation.calculateGrade();





    }
}
