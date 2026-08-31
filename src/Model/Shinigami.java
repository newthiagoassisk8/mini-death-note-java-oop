package Model;

import java.util.concurrent.TimeUnit;

public class Shinigami implements DeathNoteUser {
    private String name;
    private final boolean hasShinigamiEyes = true;
    private DeathNote deathNote;

    public Shinigami(String name, DeathNote deathNote) {
        this.name = name;
        this.deathNote = deathNote;
    }

    @Override
    public void useShinigamiEyes(Human target) {
       System.out.println(target.getRemainingLifeSpan());
    }

    @Override
     public void eraseRemainingLife(Human target) {
         target.remainingLifeYears = 0;
         target.remainingLifeMonths = 0;
         target.remainingLifeDays = 0;
     }
//TODO: Passar tempo de vida restante do humano pro shinigami
     @Override
     public void writeInDeathNote(Human victim) {
         deathNote.write(victim);
         victim.die();

     }

}
