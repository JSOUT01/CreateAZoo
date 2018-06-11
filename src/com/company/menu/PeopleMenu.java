package com.company.menu;

import com.company.people.Employee;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PeopleMenu {
    //Handles People Option
    private Scanner input = new Scanner(System.in);

    protected void mangagePeople() {
    }

    protected void managePeople() {

        try {
            System.out.println("are you "
                    + "\n1. an Employee"
                    + "\n2. a Visitor"
                    + "\n3. Go back"
                    + "\n4. Exit Program");

            switch (input.nextInt()) {
                case 1:
                    //handle Employee
                    manageEmployee();
                    break;
                case 2:
                    //Handle Visitor
                    break;
                case 3:
                    //handle going back to mainMenu()
                    Menu menu = new Menu();
                    menu.mainMenu();
                case 4:
                    //Handle exiting the program
                    System.out.println("Thank you for using the Zoo Program");
                    System.exit(0);
                default:
                    System.out.println("That is not a vailid entry. Please enter a number between 1 and 4");
                    //incorrect number
                    break;
            }
        } catch (InputMismatchException ime) {
            System.out.println("That is not a vailid entry. Please enter a number between 1 and 4");
            managePeople();

        }
    }

    private void manageEmployee() {

        System.out.println("You are in the Employee Menu" +
                "\n What would you like to do:" +
                "\n1. Create New Employee" +
                "\n2. View All Employee" +
                "\n3. Remove an Employee" +
                "\n4. Edit an Employee" +
                "\n5. Go back" +
                "\n6. Exit Program");

        try {

            switch (input.nextInt()) {
                case 1:
                    //Create new Employee
                    createPerson(1);
                    break;
                case 2:
                    // View all Employee
                    break;
                case 3:
                    // Remove Employee
                    break;
                case 4:
                    // Edit Employee
                    break;
                case 5:
                    // Go Back
                    managePeople();
                    break;
                case 6:
                    //Exit Program
                    System.out.println("Thank you for using the Zoo Program");
                    System.exit(0);
                    break;
                default:
                    //Handle if an incorrect number is put in
                    System.out.println("That is not a vailid entry. Please enter a number between 1 and 6");
                    manageEmployee();
                    break;

            }
        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("That is not a vailid entry. Please enter a number between 1 and 6");
            manageEmployee();

        }
    }

    private void manageVisitor() {


        System.out.println("You are in the Visitor Menu" +
                "\n What would you like to do:" +
                "\n1. Create New Visitor" +
                "\n2. View All Visitor" +
                "\n3. Remove an Visitor" +
                "\n4. Edit an Visitor" +
                "\n5. Go back" +
                "\n6. Exit Program");

        try {

            switch (input.nextInt()) {
                case 1:
                    //Create new Visitor
                    createPerson(2);
                    break;
                case 2:
                    // View all Visitor
                    break;
                case 3:
                    // Remove Visitor
                    break;
                case 4:
                    // Edit Visitor
                    break;
                case 5:
                    // Go Back
                    managePeople();
                    break;
                case 6:
                    //Exit Program
                    System.out.println("Thank you for using the Zoo Program");
                    System.exit(0);
                    break;
                default:
                    //Handle if an incorrect number is put in
                    System.out.println("That is not a vailid entry. Please enter a number between 1 and 6");
                    manageVisitor();
                    break;

            }
        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("That is not a vailid entry. Please enter a number between 1 and 6");
            manageVisitor();

        }

    }
    private void createPerson(int location) {


        //If location == 1, new employee, if location == , new visitor
        if(location == 1) {

            System.out.println("What is the employee's age?");
            int employeeAge= input.nextInt();
            input.nextLine();
            System.out.println("What is the employee's name?");
            String employeeName = input.nextLine();
            System.out.println("What gender is the employee?");
            char employeeGender = input.nextLine().charAt(0);
            System.out.println("What is the employee's race?");
            String employeeRace = input.nextLine();
            System.out.println("What will be the employee's Number?");
            int employeeNumber = input.nextInt();
            input.nextLine();
            System.out.println("What will be employee's Job Title?");
            String jobTitle = input.nextLine();
            System.out.println("What is the employee's Hire Date?");
            String hireDate = input.nextLine();


            Employee newEmployee = new Employee(employeeAge, employeeName, employeeRace,employeeGender, employeeNumber, jobTitle, hireDate);

        }


    }

}
