package com.sms.Task5.StudentManagementSystem;

public interface StudentManegementInterface {

    public void addStudent(Student student);
    public void removeStudent(long rollNumber);
    public void searchForStudent(String name,long rollNumber);
    public void showAllStudent();
    public void editStudent(long rollNumber);

}
