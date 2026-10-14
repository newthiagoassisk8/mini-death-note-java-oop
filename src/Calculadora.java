import model.Human;

import java.util.Objects;

public class Calculadora {

    public record Resultado(int num1, int num2, Human human) {}
// Para tipos primitivos é criado uma copia daquele valor que não vai alterar o valor externo
    // Para tipos de referencia (que são os não os primitivos) será alterado o valor externo
    public Resultado alterValues(int num1, int num2, Human human) {
        num1 = 10;
        human.setName("thiago");
        System.out.println("dentro da função");
        System.out.println(System.identityHashCode(num1));

        System.out.println(" human dentro da chamada da função");
        System.out.println(System.identityHashCode(human));

                return new Resultado(num1, num2, human);

    }
}
