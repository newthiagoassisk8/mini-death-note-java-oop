package Model;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
// TODO: FAZER shinigami poder se apaixonar
// Ideal ter o minimo de acoplamento possivel
public class Shinigami implements DeathNoteUser, ShinigamiEyes {
    private String name;
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


//TODO: Passar tempo de vida restante do humano pro shinigami
     @Override
     public void writeInDeathNote(Human victim) {
         Objects.requireNonNull(victim, "Victim must not be null");
         deathNote.write(victim);
         victim.die();

     }


    @Override
    public String seeRealName(Human target) {
        if (this.deathNote == null) {
            throw new IllegalStateException(
                    target.getName() + " não possui um Death Note"
            );
        }
        return target.getName();
    }



    @Override
    public String seeLifeSpan(Human target) {
        return  target.remainingLife.getRemainingLifeSpan();

    }

}