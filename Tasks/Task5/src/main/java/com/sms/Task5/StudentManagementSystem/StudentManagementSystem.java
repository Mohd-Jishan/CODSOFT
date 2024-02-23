package com.sms.Task5.StudentManagementSystem;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//Student management class that implements StudentManagementInterface 

@Component
public class StudentManagementSystem implements StudentManegementInterface {

    public StudentManagementSystem() {

    }

    private StudentRepo studentRepo;
    private Scanner input = new java.util.Scanner(System.in);

    @Autowired
    public StudentManagementSystem(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }
// here in this method we got a student to which we save in database with the help of  studentRepo interface

    @Override
    public void addStudent(Student student) {

        studentRepo.save(student);
        return;

    }

    @Override
    // here in this method first we search a student by its rollnumber bcz rollnumber is a primary key or @ID
    // after that we update the details of fetched sstudent then again save the student in our database
    public void editStudent(long rollNumber) {
        // TODO Auto-generated method stub
        Student student = studentRepo.findById(rollNumber).get();
        System.out.println(student.toString());

        if (student != null) {
            System.out.println(
                    "press 1 --- for update the name of student\n press 2 ---  for update the father name of student \n ---press 3 updating grade of student \n --- press 4 update course of student");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("-------Enter update name of student------");
                    student.setName(input.nextLine());

                    break;
                case 2:
                    System.out.println(" ------- Enter updated father name of student------");
                    student.setFatherName(input.nextLine());
                    break;
                case 3:
                    System.out.println(" ------- Enter updated Grade of student------");
                    student.setGrade(input.nextLine());
                    break;
                case 4:
                    System.out.println(" ------- Enter updated course of student------");
                    student.setCource(input.nextLine());
            }
            System.out.println("updated details of student   " + student.toString());
        } else {
            System.out.println("Student search by rollnumber is not in record");
        }

        return;

    }

    @Override
    // here in this method firstly we search a student by its roll number then delete the feched student
    public void removeStudent(long rollNumber) {
        Student student = studentRepo.findById(rollNumber).get();
        studentRepo.delete(student);
        System.out.println("student record is deleted");
        showAllStudent();
        return;

    }

    @Override
    // in this method we simply search a student a show the deatils of fetched student
    public void searchForStudent(String name, long rollNumber) {
        Student student = studentRepo.findById(rollNumber).get();
        if (student.getName() == name) {
            System.out.println(student.toString());
            return;
        }
        return;

    }

    @Override
    // in this method we fetch all the student in a table and store them into a list 
    // and show all the student and their details to the user
    public void showAllStudent() {
        List<Student> students = studentRepo.findAll();
        for (Student st : students) {
            System.out.println(st.toString());
        }

    }

}
