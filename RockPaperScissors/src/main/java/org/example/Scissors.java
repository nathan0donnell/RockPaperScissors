package org.example;

public class Scissors extends Item {
    private String r1WinDialogue = "Computer: My scissors slice through your paper! Your defeat is inevitable!";
    private String r2WinDialogue = "Computer: Another victory for my scissors! Your efforts are in vain!";
    private String r3WinDialogue = "Computer: My scissors cut down your hopes! You never stood a chance!";

    private String r1LoseDialogue = "Computer: You may have won this round, but my scissors will cut you down next time!";
    private String r2LoseDialogue = "Computer: Enjoy your fleeting victory. My scissors' revenge is coming!";
    private String r3LoseDialogue = "Computer: You got lucky this time. My scissors will slice through your defenses next time!";

    private String r1DrawDialogue = "Computer: A draw? How amusing. My scissors will soon cut through your defenses!";
    private String r2DrawDialogue = "Computer: Another draw? My scissors are merely sharpening their blades!";
    private String r3DrawDialogue = "Computer: A draw again? My scissors' true sharpness is yet to be revealed!";


    @Override
    public String getName() {
        return "scissors";
    }
    @Override
    public char beats(String other) {
        switch (other) {
            case "scissors" -> {
                return 'd';
            }
            case "rock" -> {
                return 'l';
            }
            case "paper" -> {
                return 'w';
            }
        }
        System.out.println("This shouldn't happen!");
        return 'x';
    }

    @Override
    public String speakDialogue(char condition, int round) {
        if (round == 1) {
            if (condition == 'w')
                return r1WinDialogue;
            if (condition == 'l')
                return r1LoseDialogue;
            if (condition == 'd')
                return r1DrawDialogue;
        } else if (round == 2) {
            if (condition == 'w')
                return r2WinDialogue;
            if (condition == 'l')
                return r2LoseDialogue;
            if (condition == 'd')
                return r2DrawDialogue;
        } else if (round == 3) {
            if (condition == 'w')
                return r3WinDialogue;
            if (condition == 'l')
                return r3LoseDialogue;
            if (condition == 'd')
                return r3DrawDialogue;
        }
        return "";
    }
}
