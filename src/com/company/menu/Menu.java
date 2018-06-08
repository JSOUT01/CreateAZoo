package com.company.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private Scanner input = new Scanner(System.in);

    public void mainMenu() {

        try {
            System.out.println("Please Choose an option. " + "\n1. Manage People" +
                    "\n2 Manage Animal" +
                    "\n3 Manage Inverntory");

            switch (input.nextInt()) {
                case 1:
                    //Manage People
                    managePeople();
                    break;
                case 2:
                    //Manage Animal
                    manageAnimal();
                    break;
                case 3:
                    //Manage Inventory
                    mangageInventory();
                    break;
                case 4:
                    System.out.println("Thank you for using the Zoo Program");
                    System.exit(0);
                default:
                    //Handle wrong number
                    System.out.println("That is not a vailid entry. Please enter a number between 1 and 4");
                    //Restart method to allow user to try again
                    mainMenu();
                    break;

            }

        } catch (InputMismatchException ime) {
            // Handle if a user puts in a something that is not int
            input.nextLine();
            System.out.println("That is not a vailid entry. Please enter a number between 1 and 4");
            mainMenu();
        }

    }

    //Handles Inventory Option
    private void mangageInventory() {

        try {
            //Enter code here that you would like to run that MAY throw an exception
        } catch (InputMismatchException ime) {
            //What you want your program to do IF this exception happens
            // Handle any imput that is not an int
            input.nextLine();
            System.out.println("That is not a vailid entry. Please enter a number between 1 and 4");
            mangageInventory();
        }

    }

    //Handles Animal Option
    private void manageAnimal() {
        try {
            //Enter code here that you would like to run that MAY throw an exception
        } catch (InputMismatchException ime) {
            //What you want your program to do IF this exception happens
            // Handle any imput that is not an int
            input.nextLine();
            System.out.println("That is not a vailid entry. Please enter a number between 1 and 4");
            manageAnimal();
        }

    }

    //Handles People Option

    private void managePeople() {
        try {
            //Enter code here that you would like to run that MAY throw an exception
        } catch (InputMismatchException ime) {
            //What you want your program to do IF this exception happens
            // Handle any imput that is not an int
            input.nextLine();
            System.out.println("That is not a vailid entry. Please enter a number between 1 and 4");
            managePeople();
        }

    }

}