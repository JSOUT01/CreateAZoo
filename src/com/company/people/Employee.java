package com.company.people;

import java.util.ArrayList;
import java.util.List;

public class Employee extends People {

    private int employeeNumber;
    private String jobTitle;
    private String hireDate;
    private int hours;

    public Employee() {

    }

    private List <Employee> employeeList = new ArrayList<Employee>();

    public Employee(int age, String name, String race, char gender, int employeeNumber, String jobTitle, String hireDate) {
        super(age, name, race, gender);
        this.employeeNumber = employeeNumber;
        this.jobTitle = jobTitle;
        this.hireDate = hireDate;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }



    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getHireDate() {
        return hireDate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void addEmployee (Employee newEmployee) {

        employeeList.add(newEmployee);
        System.out.println(newEmployee.getname);
    }
}
