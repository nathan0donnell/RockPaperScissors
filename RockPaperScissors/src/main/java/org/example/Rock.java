package org.example;

public class Rock extends Item {
    private String r1WinDialogue = "Computer: My rock crushes your feeble scissors! Tremble before my power!";
    private String r2WinDialogue = "Computer: Another victory for my rock! Your defeat is inevitable!";
    private String r3WinDialogue = "Computer: My rock reigns supreme! Your efforts are laughable!";

    private String r1LoseDialogue = "Computer: You may have won this round, but my rock will have its revenge!";
    private String r2LoseDialogue = "Computer: Enjoy your fleeting victory. My rock's wrath is far from over!";
    private String r3LoseDialogue = "Computer: You got lucky this time. My rock will crush you next time!";

    private String r1DrawDialogue = "Computer: A draw? How amusing. My rock will dominate soon enough!";
    private String r2DrawDialogue = "Computer: Another draw? My rock is merely toying with you!";
    private String r3DrawDialogue = "Computer: A draw again? My rock's true power is yet to be unleashed!";


    @Override
    public String getName() {
        return "rock";
    }

    @Override
    public char beats(String other) {
        switch (other) {
            case "scissors" -> {
                return 'w';
            }
            case "rock" -> {
                return 'd';
            }
            case "paper" -> {
                return 'l';
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
