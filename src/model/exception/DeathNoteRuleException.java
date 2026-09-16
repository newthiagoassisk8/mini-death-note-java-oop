package model.exception;

/**
 * Exemplo de CHECKED EXCEPTION (Exceção Checada).
 * Herda diretamente de java.lang.Exception.
 * 
 * Regra do Java: O compilador OBRIGA quem chama o método a:
 * 1. Tratar com bloco try-catch, OU
 * 2. Declarar explicitamente na assinatura do método com 'throws DeathNoteRuleException'.
 * 
 * Uso comum: Situações de negócio previsíveis e recuperáveis das quais a aplicação deve se defender.
 */
public class DeathNoteRuleException extends Exception {

    public DeathNoteRuleException(String message) {
        super(message);
    }

    public DeathNoteRuleException(String message, Throwable cause) {
        super(message, cause);
    }
}
