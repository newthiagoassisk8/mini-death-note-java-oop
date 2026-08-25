import Model.DeathNoteUser;
import Model.Victim;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        DeathNoteUser light = new DeathNoteUser("Light", true);
        Victim matsuda = new Victim("Mastuda", "Heart Attack");
        // Aplicacao de polimorfismo
        light.writeInDeathNote(matsuda);
        System.out.println(matsuda.toString());
    }
    
}
