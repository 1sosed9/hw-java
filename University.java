import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class University {

   public static void main(String[] args) throws StudentNotFoundException {
    
    Gender male = Gender.MALE;
    Gender female = Gender.FEMALE;

    Group group1 = new Group("1A");
    Group group2 = new Group("1B");

    Student student1 = new Student("Vasil", "Vasilchenko", male, 1);
    Student student2 = new Student("Sergiy", "Sergiyenko", male, 2);
    Student student3 = new Student("Ivan", "Aga", male, 3);
    Student student4 = new Student("Evgen", "Krupa", male, 4);
    Student student5 = new Student("Petro", "Petrenko", male, 5);
    Student student6 = new Student("Olexandr", "Zhoh", male, 6);
    Student student7 = new Student("Denis", "Denisenko", male, 7);
    Student student8 = new Student("Bogdan", "Kut", male, 8);
    Student student9 = new Student("Maxim", "Maximenko", male, 9);
    Student student10 = new Student("Pavel", "Pavlenko", male, 10);
    Student student11 = new Student("Stepan", "Stepanenko", male, 11);

    Student[] studentsUnivessity = {student1,student2,student3,student4,student5,student6,student7,student8,student9,student10};
    for (int i = 0; i < studentsUnivessity.length; i++) {
      try {
        group1.addStudent(studentsUnivessity[i]);
      } catch (GroupOverflowException e) {
        System.out.println("You have Exeption!");
      }
    }

    // 1.
    System.out.println(group1.toString());
    System.out.println();

    // 2.
    Student informationAbouStudent = group1.searchStudentByLastName("Denisenko");
    System.out.println(informationAbouStudent.toString()); 
    System.out.println();
    
    // 3.
    System.out.println(group1.removeStudentByID(10)); 
    System.out.println();

    // 4.
    System.out.println(group1.toString());
    System.out.println();
    

    try {
      group1.addStudent(student11);
    } catch (GroupOverflowException e1) {
      // TODO Auto-generated catch block
      System.out.println("You have Exeption!");
    }
    System.out.println();

    try {
      group1.addStudent(student11);
    } catch (GroupOverflowException e1) {
      // TODO Auto-generated catch block
      System.out.println("You have Exeption!");
    }
    System.out.println();

    System.out.println("Hello! Program is work");
    System.out.println();

    Student[] var = group1.getStudens();
    System.out.println(var[1].getLastName());
    System.out.println();

    System.out.println(group1.toString());
    System.out.println();

    group1.sortStudentsByLastName();
    System.out.println(group1);
    System.out.println();

    System.out.println(group1.removeStudentByID(1)); 
    System.out.println();

    System.out.println(group1);
    System.out.println();

    Student student12 = AddAndCreateStudentsFromKeyboard.createNewStudent();
    System.out.println(student12.toString());
    System.out.println(); 

    AddAndCreateStudentsFromKeyboard.addStudentToGroup(student12, group1);
    System.out.println(group1);

   }
}