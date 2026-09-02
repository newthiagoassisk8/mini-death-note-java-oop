package Model;

import java.util.Random;
public class Human implements DeathNoteUser{
    Random random = new Random();
    protected String name;
    protected DeathNote deathNote;
    private boolean isAlive;
    protected boolean hasShinigamiEyes;
    protected int remainingLifeYears = random.nextInt(81);
    protected int remainingLifeMonths = random.nextInt(12);
    protected int remainingLifeDays = random.nextInt(31);
    public Human(String name, boolean hasShinigamiEyes, DeathNote deathNote) {
        this.name = name;
        this.isAlive = true;
        this.hasShinigamiEyes = hasShinigamiEyes;
        this.deathNote = deathNote;
    }

    public Human(String name, boolean hasShinigamiEyes) {
        this.name = name;
        this.isAlive = true;
        this.hasShinigamiEyes = hasShinigamiEyes;
    }
    public boolean isAlive(){
        return this.isAlive;
    }

    public String getRemainingLifeSpan() {
        return remainingLifeYears + " anos "
                + remainingLifeMonths + " meses e "
                + remainingLifeDays + " dias de vida restante";

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


    @Override
    public String toString() {
        return "Human{" +
                " name='" + name + '\'' +
                ", alive=" + isAlive() +
                ",remainingLife=" + getRemainingLifeSpan() +
                '}';

    }


    @Override
    public void useShinigamiEyes(Human target) {
        if (!hasShinigamiEyes()) {
            System.out.println(name + " nao possui olhos de shinigami");
            return;
        }

        System.out.println(target.getRemainingLifeSpan());
    }

    @Override
    public void eraseRemainingLife (Human human) {
        human.remainingLifeYears = 0;
        human.remainingLifeMonths = 0;
        human.remainingLifeDays = 0;
    }
    @Override
    public void writeInDeathNote(Human victim) {
        if (deathNote == null) {
            System.out.println(name + "não possui death note");
            return;
        }
        deathNote.write(victim);
    }
}
