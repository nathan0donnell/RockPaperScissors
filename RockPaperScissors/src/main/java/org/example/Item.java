package org.example;

abstract class Item {
    public abstract String getName();
    public abstract char beats(String other);
    public abstract String speakDialogue(char condition, int round);
}
