package org.example;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        // Create scanner object
        Scanner user_input = new Scanner(System.in);

        // User Creation
        User player = new User();

        // Ask for name
        coolOutput("Enter your name:");
        player.setName(user_input.next());
        coolOutput("\nYour name is: " + player.getName());

        char playerChoice;
        String playerInput = "";
        boolean validInput;
        // For Loop 3 times
        for (int i = 0; i < 3; i++) {
            validInput=false;
            coolOutput("\nRound " + (i + 1) + ":\nChoose!\nRock, Paper or Scissors!\n");
            do {
                // Get user input
                playerInput = user_input.next();
                playerInput = playerInput.trim().toUpperCase();
                if (playerInput.equals("ROCK") || playerInput.equals("PAPER") || playerInput.equals("SCISSORS")) {
                    validInput = true;
                } else {
                    coolOutput("\nPlease enter a valid answer.\n");
                }
            }while(!validInput);
        }
        // Declare winner

    }
    public static void coolOutput(String output) {
        for (char ch : output.toCharArray()) {
            System.out.print(ch);
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}