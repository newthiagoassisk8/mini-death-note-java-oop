package Model;

public class Victim extends Human {

    public String deathCause;
    public Victim(String name, String deathCause) {
        super(name);
        this.name = name;
        this.deathCause = deathCause;
    }

}
