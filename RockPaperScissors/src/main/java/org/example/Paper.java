package org.example;

public class Paper extends Item {
    private String r1WinDialogue = "Computer: My paper smothers your rock! You never stood a chance!";
    private String r2WinDialogue = "Computer: Another victory for my paper! Your defeat is written in stone!";
    private String r3WinDialogue = "Computer: My paper wraps up the win! Your efforts are futile!";

    private String r1LoseDialogue = "Computer: You may have won this round, but my paper will cover your next move!";
    private String r2LoseDialogue = "Computer: Enjoy your fleeting victory. My paper's revenge is coming!";
    private String r3LoseDialogue = "Computer: You got lucky this time. My paper will envelop you next time!";

    private String r1DrawDialogue = "Computer: A draw? How quaint. My paper will soon dominate!";
    private String r2DrawDialogue = "Computer: Another draw? My paper is merely biding its time!";
    private String r3DrawDialogue = "Computer: A draw again? My paper's true power is yet to be revealed!";


    @Override
    public String getName() {
        return "paper";
    }
    @Override
    public char beats(String other) {
        switch (other) {
            case "scissors" -> {
                return 'l';
            }
            case "rock" -> {
                return 'w';
            }
            case "paper" -> {
                return 'd';
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
