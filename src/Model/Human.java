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
        System.out.println("Go to Heaven");
    }
    protected void markAsDead() {
        this.isAlive = false;
    }

    // public void eraeseLife() {
     //  remainingLife.eraseRemainingLife();
    //}


    @Override
    public String toString() {
        return "Human{" +
                " name='" + name + '\'' +
                ", alive=" + isAlive() +
                ",remainingLife=" + seeHumanLifeSpan() +
                '}';

    }
    public String seeHumanLifeSpan(){
       return remainingLife.getRemainingLifeSpan();

    }


    @Override
    public void useShinigamiEyes(Human target) {
        if (!hasShinigamiEyes()) {
            System.out.println(name + " nao possui olhos de shinigami");
            return;
        }


        seeHumanLifeSpan();
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
        return target.name;
    }

    @Override
    public String seeRealName(Shinigami target) {
        return "";
    }

    @Override
    public void seeLifeSpan(Human target) {
        System.out.println(seeHumanLifeSpan());

    }
}
