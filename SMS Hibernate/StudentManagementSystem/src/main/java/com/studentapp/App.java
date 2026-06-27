package com.studentapp;

import com.studentapp.dao.StudentDAO;
import com.studentapp.entity.Student;
import com.studentapp.util.HibernateUtil;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("---Welcome to Student Management System---");

        while (running) {
            System.out.println("\nChoose an option");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    //Create
                    System.out.print("Enter First Name: ");
                    String fName = scanner.nextLine();
                    System.out.print("Enter Last Name: ");
                    String lName = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter Course: ");
                    String course = scanner.nextLine();

                    Student newStudent = new Student(fName, lName, email, course);
                    studentDAO.saveStudent(newStudent);
                    System.out.println("Student saved successfully!");
                    break;

                case 2:
                    //read All
                    System.out.println("\n---List of Students---");
                    List<Student> students = studentDAO.getAllStudents();
                    if (students == null || students.isEmpty()) {
                        System.out.println("No students found in database.");
                    } else {
                        students.forEach(System.out::println);
                    }
                    break;

                case 3:
                    //Update
                    System.out.print("Enter Student ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();

                    Student studentToUpdate = studentDAO.getStudent(updateId);

                    if (studentToUpdate != null) {
                        System.out.println("Current Details " + studentToUpdate);
                        System.out.print("Enter New Course: ");
                        String newCourse = scanner.nextLine();
                        studentToUpdate.setCourse(newCourse);

                        studentDAO.updateStudent(studentToUpdate);
                        System.out.println("Student updated successfully!");
                    } else {
                        System.out.println("Student not found with ID: " + updateId);
                    }
                    break;

                case 4:
//                    Delete
                    System.out.print("Enter Student ID to delete: ");
                    int deleteId = scanner.nextInt();
                    studentDAO.deleteStudent(deleteId);
                    System.out.println("Student deleted successfully !");
                    break;

                case 5:
//                    Exit
                    running = false;
                    HibernateUtil.shutdown();
                    System.out.println("Application closed. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
        scanner.close();
    }
}
