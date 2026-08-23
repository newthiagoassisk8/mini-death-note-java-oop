//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class Human {
    public String name;
    private boolean isAlive;

    Human (String name) {
        this.name = name;
        this.isAlive = true;
    }

    public boolean getLifeStatus(){
        return this.isAlive;
    }

    public void die() {
        this.isAlive = false;
    }
}

class DeathNoteUser extends  Human{
   public  boolean hasShinigamiEyes;

   DeathNoteUser (String name,boolean hasShinigamiEyes){
       super(name);
       this.name = name;
       this.hasShinigamiEyes = hasShinigamiEyes;

   }

    @Override
    public String toString() {
        return "Human{" +
                ", name='" + name + '\'' +
                ", alive=" + getLifeStatus() +
                '}';


    }
}
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        DeathNoteUser human = new DeathNoteUser("Light", true);
        // human.die();
        System.out.println(human.toString());

    }

}

