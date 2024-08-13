package com.lab;

class Employee {
    String name;
    String jobTitle;
    int salary;

  
    public Employee(String name, String jobTitle, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public void updateSalary(int newSalary) {
        this.salary = newSalary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Monthly Salary: " + salary);
 
    }
}

public class MyEmployee {
    public static void main(String[] args) {
        
        Employee emp = new Employee("Bharath", "Software Engineer", 97000);
 emp.displayEmployeeDetails();
  
System.out.println("\nAfter Salary Update:");
emp.updateSalary(99000);
        emp.displayEmployeeDetails();
    }
}
