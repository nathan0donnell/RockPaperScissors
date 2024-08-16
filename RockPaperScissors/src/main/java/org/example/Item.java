package org.example;

abstract class Item {
    private String r1WinDialogue;
    private String r2WinDialogue;
    private String r3WinDialogue;
    private String r1LoseDialogue;
    private String r2LoseDialogue;
    private String r3LoseDialogue;
    private String r1DrawDialogue;
    private String r2DrawDialogue;
    private String r3DrawDialogue;

    public abstract String getName();

    public abstract boolean beats(Item other);

    public void speakDialogue(char condition, int round) {
        if (round == 1) {
            if (condition == 'w')
                System.out.println(r1WinDialogue);
            if (condition == 'l')
                System.out.println(r1LoseDialogue);
            if (condition == 'd')
                System.out.println(r1DrawDialogue);
        } else if (round == 2) {
            if (condition == 'w')
                System.out.println(r2WinDialogue);
            if (condition == 'l')
                System.out.println(r2LoseDialogue);
            if (condition == 'd')
                System.out.println(r2DrawDialogue);
        } else if (round == 3) {
            if (condition == 'w')
                System.out.println(r3WinDialogue);
            if (condition == 'l')
                System.out.println(r3LoseDialogue);
            if (condition == 'd')
                System.out.println(r3DrawDialogue);
        }
    }
}
