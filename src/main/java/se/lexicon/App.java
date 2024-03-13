package se.lexicon;

import java.util.Scanner;
public class App
{
    //Load the scanner
    private static Scanner scanner = new Scanner(System.in);
    public static void main( String[] args )
    {
        String[] nameDatabase = new String[1];
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
        System.out.println("...../ 1. Add a name /......................");
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
                    // TODO: To be implemented
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
}
