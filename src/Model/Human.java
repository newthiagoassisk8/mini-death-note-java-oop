package Model;

import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Human implements DeathNoteUser, ShinigamiEyes{
    Random random = new Random();
    protected String name;
    protected DeathNote deathNote;
    private boolean isAlive;
    protected boolean hasShinigamiEyes;
    protected RemainingLife remainingLife;
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
    }
    public boolean isAlive(){
        return this.isAlive;
    }
    public String getName() {
        return this.name;
    }


    public String getRemainingLifeSpan() {
        return this.remainingLife.years + " anos "
                + this.remainingLife.months + " meses e "
                + this.remainingLife.days + " dias de vida restante";

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
        human.remainingLife.years = 0;
        human.remainingLife.months = 0;
        human.remainingLife.days = 0;
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
        System.out.println(target.getRemainingLifeSpan());

    }
}
