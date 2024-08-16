package org.example;

public class Paper extends Item {
    private String r1WinDialogue;
    private String r2WinDialogue;
    private String r3WinDialogue;
    private String r1LoseDialogue;
    private String r2LoseDialogue;
    private String r3LoseDialogue;
    private String r1DrawDialogue;
    private String r2DrawDialogue;
    private String r3DrawDialogue;

    @Override
    public String getName() {
        return "paper";
    }
    @Override
    public boolean beats(Item other) {
        String name = other.getName();
        if (name.equals("scissors") || name.equals("paper")) {
            return false;
        } else if (name.equals("rock")) {
            return true;
        }
        System.out.println("This shouldn't happen!");
        return false;
    }
}
