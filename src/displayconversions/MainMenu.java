
package displayconversions;

import java.util.Scanner;
import displayconversions.DisplayConversions;

/**
 *
 * @author Robert Holahan
 */
public class MainMenu {

    boolean exit;

    public static void main(String[] args) {
        MainMenu menu = new MainMenu();
        menu.runMenu();
    }

    private void runMenu() {

        printHeader();        
        while (!exit) { 
            printMenu();
            int choice = getInput();
            performAction(choice);
        }
    }

    private void printMenu() {
        System.out.println("\nPlaese Select A Conversion");
        System.out.println("1. Convert Inches to Centimeters");
        System.out.println("2. Convert Centimeters to Inches");
        System.out.println("3. Convert Pounds to Kilos");
        System.out.println("4. Convert Kilos to Pounds");
        System.out.println("Exit 0");
    }

    private void printHeader() {
        System.out.println("+---------------------------------------------------------+");
        System.out.println("|                        Welcome to                       |");
        System.out.println("|                     Conversion Master                   |");
        System.out.println("+---------------------------------------------------------+");
    }

    private void performAction(int choice) {
        switch (choice) {
            case 0:
                exit = true;
                System.out.println("Thank you for Conversion Master.");
                break;
            case 1:
                System.out.println();
                DisplayConversions.InputInches();
                break;
            case 2:
                System.out.println();
                DisplayConversions.InputCentimeters();
                break;
            case 3:
                System.out.println();
                DisplayConversions.InputLbs();
                break;
            case 4:
                System.out.println();
                DisplayConversions.InputKilos();
                break;
            default:
        }
    }

    private int getInput() {
        Scanner input = new Scanner(System.in);

        int choice = -1;
        while (choice < 0 || choice > 4) {

            try {
                System.out.print("\nEnter your choice: ");
                choice = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid selection. Pleace try again.");
            }
        }
        return choice;
    }
}
