package Code;

import java.util.Scanner;

public class Menu {
    public static void start() {
        System.out.println("1. Start Game");
        System.out.println("2. Exit");

        System.out.println("Enter your choice: ");
        Scanner choice = new Scanner(System.in);
        int userChoice = choice.nextInt();
        while (userChoice < 1 || userChoice > 2) { // while the userChoice is not 1 or 2
            System.out.println("Invalid choice. Please enter a valid choice: ");
            userChoice = choice.nextInt();
        }
        if (userChoice == 1) {
            Stage stage = new Stage();
            stage.start();
        }
        else {
            System.out.println("Exiting the game...");
        }

    }

    public static int getChoice() {
        System.out.println("Choose the case you want to put a cross in: ");
        Scanner choice = new Scanner(System.in);
        int userChoice = choice.nextInt();
        while(userChoice < 1 || userChoice > 9) {
            System.out.println("Invalid choice. Please enter a valid choice: ");
            userChoice = choice.nextInt();
        }
        return userChoice;

    }
}
