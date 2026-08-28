package Model;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Human extends DeathNoteUser{
    Random random = new Random();
    protected String name;
    private boolean isAlive;
    boolean hasShinigamiEyes = true;
    protected int remainingLifeYears;
    protected int remainingLifeMonths;
    protected int remainingLifeDays;
    public Human(String name, boolean hasShinigamiEyes) {
        super(hasShinigamiEyes);
        this.name = name;
        this.isAlive = true;
        this.remainingLifeYears = random.nextInt(81);
        this.remainingLifeMonths = random.nextInt(12);
        this.remainingLifeDays = random.nextInt(31);
    }
    public boolean isAlive(){
        return this.isAlive;
    }

    public String getRemainingLifeSpan() {
        return remainingLifeYears + " anos "
                + remainingLifeMonths + " meses e "
                + remainingLifeDays + " dias de vida restante";

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
    protected void eraseRemainingLife (Human human) {
        human.remainingLifeYears = 0;
        human.remainingLifeMonths = 0;
        human.remainingLifeDays = 0;
    }
    @Override
    public void writeInDeathNote(Human victim) {
        System.out.println("using death note");
        for (int seconds = 5; seconds >= 0 ; seconds--) {
            System.err.println(seconds);
            try {
                TimeUnit.SECONDS.sleep(1);

            } catch (InterruptedException e) {
                System.err.println("A contagem foi interropida" + e);
            }

        }
        victim.die();
        eraseRemainingLife(victim);
        System.out.println(victim.name + " morreu");
    }

}
