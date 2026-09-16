package model.exception;

/**
 * Exemplo de UNCHECKED EXCEPTION (Exceção Não-Checada).
 * Herda de java.lang.RuntimeException.
 * 
 * Regra do Java: O compilador NÃO obriga o uso de try-catch ou declaração 'throws'.
 * 
 * Uso comum: Erros de estado inválido, falha de pré-condição ou bugs de lógica (ex: tentar matar alguém já morto).
 */
public class AlreadyDeadException extends RuntimeException {

    public AlreadyDeadException(String message) {
        super(message);
    }
}
