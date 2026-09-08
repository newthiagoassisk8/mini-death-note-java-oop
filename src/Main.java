// TODO: O que acontece quando mais de uma thread ela tenta alterar o mesmo valor
// TODO: Relacionamento entre objetos
// TODO: Aprofundar Interface
import model.*;
import java.net.MalformedURLException;

// TODO: Uma outra coisa legal que você podia fazer depois, é um Shinigami capaz de se apaixonar, dando o restante de sua vida para o Human alvo e o DeathNote com um conjunto de Rule.jjk
public class Main {
    public static void main(String[] args) throws MalformedURLException {
        DeathNote deathNoteRyuk = new DeathNote();
        DeathNote deathNoteLight = new DeathNote();
        DeathNote deathNoteMisa = new DeathNote();
        deathNoteMisa.getVictims();

        Shinigami ryuk = new Shinigami("ryuk", deathNoteRyuk);
        Shinigami rem = new Shinigami("rem", deathNoteRyuk);
        Human misa = new Human("misa", true, deathNoteMisa);
        System.out.println(ryuk.seeLifeSpan(misa));
        System.out.println("antes vida do ryuk  " + ryuk.remainingLife);
        Human light = new Human("light", false, deathNoteLight);
        // dynamic binding
        // static binding
        Human light2 = new Human("light impostor", false, deathNoteLight);
        Human matsuda = new Human("Mastuda", false);
        ryuk.writeInDeathNote(misa);
        // rem.fallInLove(misa);
       // System.out.println(ryuk.seeLifeSpan(misa));
        //light.writeInDeathNote(matsuda);

        System.out.println("depois vida do ryuk " + ryuk.remainingLife);
        //light.writeInDeathNote(misa);
        //light.writeInDeathNote(misa);
        //System.out.println(deathNoteLight.getVictims());


    }
    
}
