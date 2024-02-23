package com.sms.Task5;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sms.Task5.StudentManagementSystem.Student;
import com.sms.Task5.StudentManagementSystem.StudentManagementSystem;
@Service
@Component
// this a service class 
class StudentService{
	
				@Autowired
			private  StudentManagementSystem sms ;
			@Autowired
			public StudentService(StudentManagementSystem sms){
				this.sms=sms;
			}
			public StudentService(){

			}

			public  void execute()
			{
				System.out.println(sms);
				System.out.println("----- WELCOME TO  OUR STUDENT MANAGEMENT SYSTEM -------");
		
				
				
		
				Scanner input=new Scanner(System.in);
				System.out.println("press 1 --- for add a new  student\n" + 
								" press 2 ---  Remove student \n" + 
								" --- press 3  for update   student information \n" + //
								" --- press 4 for display all students"+
								"--- press 5 for search a student  ");
		
				int press=input.nextInt();
				switch (press) {
					case 1:
							Student student=new Student();
							System.out.println("Enter the rollnumber of student");
							student.setRollNumber(input.nextLong());
							System.out.println("Enter the name of student");
							student.setName(input.next());
							System.out.println("enter the fatherName of student");
							student.setFatherName(input.next());
							System.out.println("Enter the Grade of student e.g. A,B,C");
							student.setGrade(input.next());
							System.out.println("Enter the course of student");
							student.setCource(input.next());
		
							sms.addStudent(student);
						break;
		
					case 4:
					sms.showAllStudent();
				
					default:
					
						break;
				}

			}
		}


	

/*  we implement commondlineRunner interface bcz  it has run method that helps in run a springboot application bcz we want a console based interface to the user so it execute a  method which contains the console based interface code
 
 */

@SpringBootApplication
public class Task5Application implements CommandLineRunner{
			@Autowired
			StudentService ss;
	public static void main(String[] args) {
		SpringApplication.run(Task5Application.class, args);
		
	}

	@Override
	// this is the method which execute the user interface
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ss.execute();

		
	}
	
	

}
