package com.company.menu;

import java.util.Scanner;

public class Peoplemenu {
    //Handles People Option
    private Scanner input = new Scanner(System.in);

    private void managePeople() {

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
                    mainMenu();
                case 4:
                    //Handle exiting the program
                    System.out.println("Thank you for using the Zoo Program");
                    System.exit(0);
                default:
                    System.out.println("That is not a vailid entry. Please enter a number between 1 and 4");
                    //incorrect number
                    break;
}
