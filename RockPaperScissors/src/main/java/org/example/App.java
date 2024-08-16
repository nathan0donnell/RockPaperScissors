package org.example;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.io.FileWriter;


public class App {
    public static void main(String[] args)  {
        // Create scanner object
        Scanner user_input = new Scanner(System.in);

        // User Creation
        User player = new User();
        String matchResult="";
        // Ask for name
        coolOutput("Enter your name:");
        player.setName(user_input.next());


        String playerInput;
        boolean validInput;
        int playerPoints = 0, computerPoints = 0;
        // For generating random choice
        String computerChoice;
        String[] choices = {"rock", "paper", "scissors"};
        Random random = new Random();
        Rock rock = new Rock();
        Paper paper = new Paper();
        Scissors scissors = new Scissors();

        boolean drawed = true;
        do {
            // For Loop 3 times
            for (int i = 1; i < 4; i++) {
                validInput = false;
                coolOutput("\nRound " + i  + ":\nChoose!\nRock, Paper or Scissors!\n");
                do {
                    // Get user input
                    playerInput = user_input.next();
                    playerInput = playerInput.trim().toLowerCase();
                    if (playerInput.equals("rock") || playerInput.equals("paper") || playerInput.equals("scissors")) {
                        validInput = true;
                        // Generate Computer Choice
                        computerChoice = choices[random.nextInt(2)];

                        // Check who wins
                        coolOutput("\nComputer chose:.....\n");
                        coolOutput(computerChoice.toUpperCase());
                        coolOutput("\n");
                        // Print Computer Dialogue
                        if (computerChoice.equals(rock.getName())) {
                            if (rock.beats(playerInput) == 'w') {
                                coolOutput(rock.speakDialogue('w', i));
                                computerPoints++;
                            } else if (rock.beats(playerInput) == 'l') {
                                coolOutput(rock.speakDialogue('l', i));
                                playerPoints++;

                            } else if (rock.beats(playerInput) == 'd') {
                                coolOutput(rock.speakDialogue('d', i));
                            }
                        } else if (computerChoice.equals(paper.getName())) {
                            if (paper.beats(playerInput) == 'w') {
                                coolOutput(paper.speakDialogue('w', i));
                                computerPoints++;
                            } else if (paper.beats(playerInput) == 'l') {
                                coolOutput(paper.speakDialogue('l', i));
                                playerPoints++;
                            } else if (paper.beats(playerInput) == 'd') {
                                coolOutput(paper.speakDialogue('d', i));
                            }
                        } else if (computerChoice.equals(scissors.getName())) {
                            if (scissors.beats(playerInput) == 'w') {
                                coolOutput(scissors.speakDialogue('w', i));
                                computerPoints++;
                            } else if (scissors.beats(playerInput) == 'l') {
                                coolOutput(scissors.speakDialogue('l', i));
                                playerPoints++;
                            } else if (scissors.beats(playerInput) == 'd') {
                                coolOutput(scissors.speakDialogue('d', i));
                            }
                        }

                        // Add Round totals
                        if (playerPoints > computerPoints) {
                            coolOutput("\nYou win!");
                        } else if (playerPoints < computerPoints) {
                            coolOutput("\nYou LOSE!");
                        } else if (playerPoints == computerPoints) {
                            coolOutput("\nDRAW! AGAIN!");
                        }
                    } else {
                        coolOutput("\nPlease enter a valid answer.\n");
                    }
                } while (!validInput);
            }
            // Add Round totals
            if (playerPoints > computerPoints) {
                coolOutput("\nYou win the game....");
                matchResult="WON";
                drawed=false;
            } else if (playerPoints < computerPoints) {
                coolOutput("\nYou LOSE!");
                matchResult="LOST";
                drawed=false;
            } else if (playerPoints == computerPoints) {
                coolOutput("\nDRAW! KEEP PLAYING!");
            }
        } while (drawed);
        try (FileWriter writer = new FileWriter("results.txt", true)){
            writer.write("\nPlayer: " + player.getName() + ", Result: " + matchResult);
            System.out.println("Match result saved to file.");
        } catch (IOException  e) {
            System.out.println(e.getMessage());
        }
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