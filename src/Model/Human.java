package Model;

import java.util.Random;

public class Human {
    Random random = new Random();
    protected String name;
    private boolean isAlive;
    protected int remainingLifeYears;
    protected int remainingLifeMonths;
    protected int remainingLifeDays;
    Human (String name) {
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

}
