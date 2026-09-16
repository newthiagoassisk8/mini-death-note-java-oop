import model.*;
import model.exception.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EXERCÍCIO EDUCATIVO: EXCEPTIONS EM JAVA (DEATH NOTE) ===\n");

        DeathNote deathNoteLight = new DeathNote();
        Human light = new Human("Light Yagami", false, deathNoteLight);
        Human matsuda = new Human("Touta Matsuda", false);
        Human misa = new Human("Misa Amane", true); // Misa tem os olhos de Shinigami

        // -------------------------------------------------------------
        // 1. FLUXO NORMAL (SUCESSO)
        // -------------------------------------------------------------
        System.out.println("--- 1. Execução Normal ---");
        try {
            light.writeInDeathNote(matsuda);
            System.out.println("Status do Matsuda: vivo = " + matsuda.isAlive());
        } catch (DeathNoteRuleException e) {
            System.err.println("Erro de regra do Death Note: " + e.getMessage());
        }

        System.out.println("\n-------------------------------------------------------------");

        // -------------------------------------------------------------
        // 2. UNCHECKED EXCEPTION (RuntimeException)
        // Exemplo: Já está morto (AlreadyDeadException)
        // O compilador NÃO obriga a colocar try-catch, mas podemos tratar!
        // -------------------------------------------------------------
        System.out.println("--- 2. Unchecked Exception: Tentando matar quem já morreu ---");
        try {
            System.out.println("Tentando escrever Matsuda novamente no caderno...");
            light.writeInDeathNote(matsuda);
        } catch (AlreadyDeadException e) {
            System.out.println("[UNCHECKED CAPTURADA] " + e.getMessage());
        } catch (DeathNoteRuleException e) {
            System.out.println("[CHECKED CAPTURADA] " + e.getMessage());
        }

        System.out.println("\n-------------------------------------------------------------");

        // -------------------------------------------------------------
        // 3. UNCHECKED EXCEPTION (RuntimeException)
        // Exemplo: Tentando usar olhos de Shinigami sem tê-los (MissingShinigamiEyesException)
        // -------------------------------------------------------------
        System.out.println("--- 3. Unchecked Exception: Light tentando ver expectativa de vida ---");
        try {
            System.out.println("Light tenta olhar para Misa...");
            System.out.println(light.seeLifeSpan(misa));
        } catch (MissingShinigamiEyesException e) {
            System.out.println("[UNCHECKED CAPTURADA] " + e.getMessage());
        }

        System.out.println("\n-------------------------------------------------------------");

        // -------------------------------------------------------------
        // 4. CHECKED EXCEPTION (Exception)
        // Exemplo: Violação de regra de negócio (DeathNoteRuleException)
        // O Java nos OBRIGA a tratar ou declarar 'throws'!
        // -------------------------------------------------------------
        System.out.println("--- 4. Checked Exception: Violação de regra (vítima nula) ---");
        try {
            System.out.println("Tentando escrever vítima nula...");
            light.writeInDeathNote(null);
        } catch (DeathNoteRuleException e) {
            System.out.println("[CHECKED CAPTURADA] " + e.getMessage());
        } finally {
            // O bloco finally SEMPRE executa, quer haja exceção ou não.
            System.out.println("[FINALLY] Esse bloco sempre executa para limpeza ou log final.");
        }

        System.out.println("\n=== FIM DA DEMONSTRAÇÃO ===");
    }
}
