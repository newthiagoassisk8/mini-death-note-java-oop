//TODO: Nomear pacote com letra minusculo
// TODO: Conceito de Thread
// TODO: O que acontece quando mais de uma thread ela tenta alterar o mesmo valor
// TODO: Relacionamento entre objetos
// TODO: Aprofundar Interface
import Model.DeathNote;
import Model.Human;
import Model.Shinigami;

import java.util.Optional;

// TODO: aplicar composicao (Criar nova classe ShinigamiEyes e DeathNote)
public class Main {
    public static void main(String[] args) {
        DeathNote deathNoteRyuk = new DeathNote();
        DeathNote deathNoteLight = new DeathNote();
        DeathNote deathNoteMisa = new DeathNote();

        Shinigami ryuk = new Shinigami("ryuk", deathNoteRyuk);
        Human misa = new Human("misa", true, deathNoteMisa);
        Human light = new Human("light", false, deathNoteLight);
        Human matsuda = new Human("Mastuda", false);

        ryuk.writeInDeathNote(misa);
        // deathNoteLight.writeInDeathNote(misa);
          misa.useShinigamiEyes(matsuda);
    }
    
}
