import java.io.*;
public class Employee{
	
	String name;
	int age;
	String designation;
	double salary;

	public Employee(String name){
		this.name = name; // this keyword points to an object of the class it is conceived in
	}

	public void empAge(int empAge){
		age = empAge;
	}

	public void empDesignation(String empDesig){
		designation = empDesig;
	}

	public void empSalary(double empSalary){
		salary = empSalary;
	}

	public void printEmployee(){
		System.out.printf("Name: " + name 
				+ "\nAge: " + age 
				+ "\nDesignation: " + designation 
				+ "\nSalary: " + salary 
				+ "\n"
				);
	}
}
