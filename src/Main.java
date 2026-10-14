import model.*;
import model.exception.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EXERCÍCIO EDUCATIVO: EXCEPTIONS EM JAVA (DEATH NOTE) ===\n");

        DeathNote deathNoteLight = new DeathNote();
        Human light = new Human("Light Yagami", false, deathNoteLight);
        Human matsuda = new Human("Touta Matsuda", false);
        Human misa = new Human("Misa Amane", true); // Misa tem os olhos de Shinigami

        Human h1 = new Human("Near", false);
        Human h2 = h1;



        Human[] humans = {light, matsuda, misa};
        Calculadora calculator = new Calculadora();
        try {
            int num1 = 1;
            int num2 = 2;
            Calculadora.Resultado resultado = calculator.alterValues(num1, num2, matsuda);
            num1 = resultado.num1();
            num2 = resultado.num2();
            light = resultado.human();
            System.out.println("depois da chamada da função");
            System.out.println(light);
            System.out.println(num1);
            System.out.println(num2);
        } catch (Exception e) {
            System.err.println("Erro de regra do Death Note: " + e.getMessage());
        }

    }
}
