package model.exception;

/**
 * Exemplo de UNCHECKED EXCEPTION (Exceção Não-Checada).
 * Herda de java.lang.RuntimeException.
 * 
 * Lançada quando um humano tenta usar habilidades oculares (como ver a expectativa de vida)
 * sem ter feito o acordo dos olhos de Shinigami.
 */
public class MissingShinigamiEyesException extends RuntimeException {

    public MissingShinigamiEyesException(String message) {
        super(message);
    }
}
