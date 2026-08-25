//TODO: Nomear pacote com letra minusculo
// TODO: Conceito de Thread
// TODO: O que acontece quando mais de uma thread ela tenta alterar o mesmo valor
// TODO: Relacionamento entre objetos
// TODO: Aprofundar Interface
import Model.DeathNoteUser;
import Model.Victim;

public class Main {
    public static void main(String[] args) {

        DeathNoteUser light = new DeathNoteUser("Light", true);
        Victim matsuda = new Victim("Mastuda", "Heart Attack");
        // Aplicacao de polimorfismo
        light.writeInDeathNote(matsuda);
        System.out.println(matsuda.toString());
    }
    
}
