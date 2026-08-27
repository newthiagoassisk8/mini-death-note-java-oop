package Model;

public class DeathNote {
    public int numberOfVictims;
    public String owner;
    public boolean isDestroyed;
    public Rule rule;

    public DeathNote(int numberOfVictims, String owner, Rule rule) {
        this.numberOfVictims = numberOfVictims;
        this.owner = owner;
        this.rule = rule;
    }



}