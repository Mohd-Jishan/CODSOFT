package com.sms.Task5.StudentManagementSystem;

// StudentManagementInterface that has 5 method to add ,delete, update, search and show all students method 
public interface StudentManegementInterface {

    public void addStudent(Student student);
    public void removeStudent(long rollNumber);
    public void searchForStudent(String name,long rollNumber);
    public void showAllStudent();
    public void editStudent(long rollNumber);

}
