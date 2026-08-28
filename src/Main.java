//TODO: Nomear pacote com letra minusculo
// TODO: Conceito de Thread
// TODO: O que acontece quando mais de uma thread ela tenta alterar o mesmo valor
// TODO: Relacionamento entre objetos
// TODO: Aprofundar Interface
import Model.Human;
import Model.Shinigami;

public class Main {
    public static void main(String[] args) {

        Shinigami ryuk = new Shinigami("ryuk");

        Human light = new Human("light");
        Human matsuda = new Human("Mastuda");
        ryuk.writeInDeathNote(matsuda);
    }
    
}
