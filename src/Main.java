
class Human {
    protected String name;
    private boolean isAlive;

    Human (String name) {
        this.name = name;
        this.isAlive = true;
    }
    public boolean isAlive(){
        return this.isAlive;
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
                '}';

    }

}
class Victim extends Human {

    public String deathCause;
    Victim(String name, String deathCause) {
        super(name);
        this.name = name;
        this.deathCause = deathCause;
    }

}
class DeathNoteUser extends Human  {

   public  boolean hasShinigamiEyes;

   DeathNoteUser (String name,boolean hasShinigamiEyes){
       super(name);
       this.name = name;
       this.hasShinigamiEyes = hasShinigamiEyes;

   }

   public void writeInDeathNote(Human victim) {
    System.out.println("using death note");
    victim.die();
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
                '}';

    }
}
public class Main {
    public static void main(String[] args) {

        DeathNoteUser light = new DeathNoteUser("Light", true);
        Victim matsuda = new Victim("Mastuda", "Heart Attack");
        // Aplicacao de polimorfismo 
        light.writeInDeathNote(light);
    }
    
}
