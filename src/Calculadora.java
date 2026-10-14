import model.Human;

public class Calculadora {

    public record Resultado(int num1, int num2, Human human) {}
// Para tipos primitivos é criado uma copia daquele valor que não vai alterar o valor externo
    // Para tipos de referencia (que são os não os primitivos) será alterado o valor externo
    public Resultado alterValues(int num1, int num2, Human human) {
        num1 = 10;
        num2 = 20;

        System.out.println("Dentro do método");
        System.out.println("numero um -> " + num1);
        System.out.println("numero dois -> " + num2);
        System.out.println("Human -> " + human);
        return new Resultado(num1, num2, human);

    }
}
