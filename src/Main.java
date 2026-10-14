import model.*;
import model.exception.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EXERCÍCIO EDUCATIVO: EXCEPTIONS EM JAVA (DEATH NOTE) ===\n");

        DeathNote deathNoteLight = new DeathNote();
        Human light = new Human("Light Yagami", false, deathNoteLight);
        Human misa = new Human("Misa Amane", true); // Misa tem os olhos de Shinigami

        Human h1 = new Human("Near", false);
        Human h2 = h1;



        Calculadora calculator = new Calculadora();
        try {
            int num1 = 1;
            int num2 = 2;

            Human matsuda = new Human("Touta Matsuda", false);
            Calculadora.Resultado resultado = calculator.alterValues(num1, num2, matsuda);
            int foo = resultado.num1();
            num2 = resultado.num2();
            light = resultado.human();
            System.out.println(num1); // 1
            System.out.println(resultado.num1()); //10
            System.out.println(matsuda.getName()); // thiago
            System.out.println(resultado.human().getName()); //thiago
        } catch (Exception e) {
            System.err.println("Erro de regra do Death Note: " + e.getMessage());
        }

    }
}
