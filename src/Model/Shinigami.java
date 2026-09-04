package Model;

import java.util.Objects;
// TODO: FAZER shinigami poder se apaixonar
// Ideal ter o minimo de acoplamento possivel
public class Shinigami implements DeathNoteUser, ShinigamiEyes {
    private String name;
    private DeathNote deathNote;
    public RemainingLife remainingLife;


    public Shinigami(String name, DeathNote deathNote) {
        this.name = name;
        this.deathNote = deathNote;
        this.remainingLife = new RemainingLife();
    }

    public String getRemainingLife() {
        return remainingLife.getTotalDays() + " de dias restantes";
    }

    public String getName() {
        return name;
    }

    public String fallInLove(Human target) {
        RemainingLife.transferRemainingLife(target, this);
        return this.name + " transferiu seu tempo de vida restante para " + target.getName();
    }

     @Override
     public void writeInDeathNote(Human victim) {
         Objects.requireNonNull(victim, "Victim must not be null");
         deathNote.write(victim);

     }

     @Override
     public String toString(){
        Human foo =  Human.create();
        return "Shinigami{" +
                "name='" + this.name + '\'' +
                ", deathNote=" + this.deathNote +
                ", remainingLife=" + this.remainingLife +
                '}';
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
