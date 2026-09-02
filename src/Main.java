// TODO: O que acontece quando mais de uma thread ela tenta alterar o mesmo valor
// TODO: Relacionamento entre objetos
// TODO: Aprofundar Interface
import Model.*;

import java.net.MalformedURLException;

// TODO: Uma outra coisa legal que você podia fazer depois, é um Shinigami capaz de se apaixonar, dando o restante de sua vida para o Human alvo e o DeathNote com um conjunto de Rule.jjk
public class Main {
    public static void main(String[] args) throws MalformedURLException {
        DeathNote deathNoteRyuk = new DeathNote();
        DeathNote deathNoteLight = new DeathNote();
        DeathNote deathNoteMisa = new DeathNote();
        DeathNote.open();



        Shinigami ryuk = new Shinigami("ryuk", deathNoteRyuk);
        Human misa = new Human("misa", true, deathNoteMisa);
        // dynamic binding
        Human light = new Human("light", false, deathNoteLight);
        // static binding
        Human light2 = new Human("light", false, deathNoteLight);
        Human matsuda = new Human("Mastuda", false);
        light.getRemainingLifeSpan();
        ryuk.getRemainingLife();
        // light.seeLifeSpan(misa);

    }
    
}
