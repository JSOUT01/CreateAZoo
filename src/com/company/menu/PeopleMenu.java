package com.company.menu;

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
            manageVisitor();

        }

    }

}
