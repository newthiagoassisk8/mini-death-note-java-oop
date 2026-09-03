package Model;
import java.util.List;
import java.util.Random;

public class Human implements DeathNoteUser, ShinigamiEyes{
    protected String name;
    protected DeathNote deathNote;
    private boolean isAlive;
    protected boolean hasShinigamiEyes;
    public RemainingLife remainingLife;
    public Human(String name, boolean hasShinigamiEyes, DeathNote deathNote) {
        this.name = name;
        this.isAlive = true;
        this.hasShinigamiEyes = hasShinigamiEyes;
        this.deathNote = deathNote;
        this.remainingLife = new RemainingLife();
    }

    public Human(String name, boolean hasShinigamiEyes) {
        this.name = name;
        this.isAlive = true;
        this.hasShinigamiEyes = hasShinigamiEyes;
        this.remainingLife = new RemainingLife();
    }
    public boolean isAlive(){
        return this.isAlive;
    }

    public String getName() {
        return this.name;

    }
    public List<String> getNames() {
        if (new Random().nextBoolean()) {
            return List.of("Misa Amane");
        }

        return List.of();
    }

    public boolean hasShinigamiEyes() {
        return hasShinigamiEyes;
    }

    protected void die() {
        markAsDead();
        if (deathNote != null) {

            System.out.println("Go to Heaven");
        } else {

        }
    }
    protected void markAsDead() {
        this.isAlive = false;
    }


    @Override
    public void writeInDeathNote(Human victim) {
        if (deathNote == null) {
            System.out.println(name + "não possui death note");
            return;
        }
        deathNote.write(victim);
    }

    @Override
    public String seeRealName(Human target) {
        if (this.deathNote == null) {
            throw new IllegalStateException(
                    this.name + " não possui um Death Note"
            );
        }
        return target.getName();
    }



    @Override
    public String seeLifeSpan(Human target) {
        if (!this.hasShinigamiEyes()) {
            throw new IllegalStateException(
                    this.name + " não possui os olhos de shinigami"
            );
        }


        return  target.remainingLife.getRemainingLifeSpan();

    }
}
