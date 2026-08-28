package Model;

import java.util.concurrent.TimeUnit;


public abstract class DeathNoteUser  {
 //TODO: Usar atributo hasShinigamiEyes
    public  boolean hasShinigamiEyes;

    abstract void eraseRemainingLife(Human target);

    protected abstract void writeInDeathNote(Human victim);


}
