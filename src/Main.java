//TODO: Nomear pacote com letra minusculo
// TODO: Conceito de Thread
// TODO: O que acontece quando mais de uma thread ela tenta alterar o mesmo valor
// TODO: Relacionamento entre objetos
// TODO: Aprofundar Interface
import Model.Human;
import Model.Shinigami;
// TODO: aplicar composicao (Criar nova classe ShinigamiEyes e DeathNote)
public class Main {
    public static void main(String[] args) {

        Shinigami ryuk = new Shinigami("ryuk");

        Human misa = new Human("light", true);
        Human light = new Human("light", false);
        Human matsuda = new Human("Mastuda", false);
        ryuk.writeInDeathNote(matsuda);
        light.useShinigamiEyes(matsuda);
    }
    
}
