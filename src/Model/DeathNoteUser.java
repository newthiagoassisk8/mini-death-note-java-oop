package Model;


public class DeathNoteUser extends Human  {

    public  boolean hasShinigamiEyes;

    public DeathNoteUser (String name,boolean hasShinigamiEyes ){
        super(name);
        this.name = name;
        this.hasShinigamiEyes = hasShinigamiEyes;

    }

    protected void eraseRemainingLife (Human human) {
        human.remainingLifeYears = 0;
        human.remainingLifeMonths = 0;
        human.remainingLifeDays = 0;

    }
    public void writeInDeathNote(Human victim) {
        System.out.println("using death note");
        victim.die();
        eraseRemainingLife(victim);
        System.out.println(victim.name + " morreu");
    }

    @Override
    public void die() {
        markAsDead();
        System.out.println("Go to Mu");
    }

    @Override
    public String toString() {
        return "Death Note User{" +
                " name='" + name + '\'' +
                ", alive=" + isAlive() +
                ",remainingLife=" + getRemainingLifeSpan() +
                '}';

    }
}
