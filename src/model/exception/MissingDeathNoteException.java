package model.exception;

/**
 * Exemplo de UNCHECKED EXCEPTION (Exceção Não-Checada).
 * Herda de java.lang.RuntimeException.
 * 
 * Lançada quando uma entidade tenta realizar uma operação que exige posse de um Death Note, mas não o possui.
 */
public class MissingDeathNoteException extends RuntimeException {

    public MissingDeathNoteException(String message) {
        super(message);
    }
}
