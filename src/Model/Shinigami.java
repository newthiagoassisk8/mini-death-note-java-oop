package Model;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
// TODO: FAZER shinigami poder se apaixonar
// Ideal ter o minimo de acoplamento possivel
public class Shinigami implements DeathNoteUser {
    private String name;
    private final boolean hasShinigamiEyes = true;
    private DeathNote deathNote;
    protected RemainingLife remainingLife;



    public Shinigami(String name, DeathNote deathNote) {
        this.name = name;
        this.deathNote = deathNote;
        this.remainingLife = new RemainingLife();
    }

    public void getRemainingLife() {
        System.out.println(remainingLife.getTotalDays() + " de dias restantes");
    }

    public String getName() {
        return name;
    }

    @Override
    public void useShinigamiEyes(Human target) {
       System.out.println(target.seeHumanLifeSpan());
    }

//TODO: Passar tempo de vida restante do humano pro shinigami
     @Override
     public void writeInDeathNote(Human victim) {
         Objects.requireNonNull(victim, "Victim must not be null");
         deathNote.write(victim);
         victim.die();

     }

}