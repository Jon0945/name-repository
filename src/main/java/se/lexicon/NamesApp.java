package se.lexicon;

import java.util.Arrays;
import java.util.Scanner;

public class NamesApp {
    public static String[] nameDatabase = {"Erik Svensson"};

    private static Scanner scanner = new Scanner(System.in);

    public static void start() {

        menuScan();
    }

    public static void printMenu() {
        // Clears the screen
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Application Menu
        System.out.println("............................................");
        System.out.println("...../ Name Repository /....................");
        System.out.println("............................................");
        System.out.println("...../ 1. Print names /.....................");
        System.out.println("...../ 2. Add a name /......................");
        System.out.println("...../ Q. Terminate program /...............");
        System.out.println("............................................");
        System.out.println();
        System.out.print("Make your choice: ");
    }

    public static void menuScan() {
        boolean keepGoing = true;
        while (keepGoing) {
            printMenu();
            char userInput = scanner.next().charAt(0);
            switch (userInput) {
                case '1':
                    print();
                    break;
                case '2':
                    addName();
                    break;
                case 'Q':
                    System.out.println("Goodbye!");
                    keepGoing = false;
                    break;
                default:
                    //Exception handling
                    System.out.println("That's not a valid menu choice");
                    break;
            }
        }
    }

    public static void print() {
        System.out.println();
        for (int i = 0; i < nameDatabase.length; i++) {
            System.out.println(nameDatabase[i]);
        }
    }

    public static void addName() {
        System.out.print("First name: ");
        String firstNameInput = scanner.next();
        System.out.print("Last name: ");
        String lastNameInput = scanner.next();
        String fullNameInput = firstNameInput +" "+lastNameInput;
        if (!add(fullNameInput)) {
            System.out.println("Name already exists!");
        } else {
            System.out.println("Name successfully added!");
        }
    }

    public static String[] addToArray(final String[] source, String fullName) {
        String[] newArray = Arrays.copyOf(source, source.length + 1);
        newArray[newArray.length - 1] = fullName;
        return newArray;
    }

    public static boolean add(final String fullName) {
        for (int i = 0; i < nameDatabase.length; i++) {
            if (nameDatabase[i].equals(fullName)) {
                return false;
            } else {
                nameDatabase = addToArray(nameDatabase, fullName);
                return true;
            }
        }
        return false;
    }
}


