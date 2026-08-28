package Model;

import java.util.concurrent.TimeUnit;


public abstract class DeathNoteUser  {
 //TODO: Usar atributo hasShinigamiEyes
    public  boolean hasShinigamiEyes;

    public DeathNoteUser (boolean hasShinigamiEyes) {
        this.hasShinigamiEyes = hasShinigamiEyes;
    }

    public void useShinigamiEyes(){
        System.out.print("see a person's information");

    }

    abstract void eraseRemainingLife(Human target);

    protected abstract void writeInDeathNote(Human victim);


}
