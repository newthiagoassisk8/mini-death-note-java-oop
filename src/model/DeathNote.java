package model;

import model.exception.DeathNoteRuleException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DeathNote {
    protected List<Human> victims = new ArrayList<>();

    public DeathNote() {
    }

    public List<Human> getVictims() {
        return victims;
    }

    public void addVictim(Human human) {
        victims.add(human);
    }

    /**
     * Escreve o nome de uma vítima no Death Note.
     * @throws DeathNoteRuleException (Checked Exception) quando alguma regra fundamental for violada.
     */
    public void write(Human human) throws DeathNoteRuleException {
        if (human == null || human.getName() == null || human.getName().trim().isEmpty()) {
            throw new DeathNoteRuleException("Regra violada: O nome da vítima não pode ser nulo ou vazio.");
        }

        // Simula os 40 segundos da regra do Death Note (reduzido para 2s para teste rápido)
        for (int seconds = 2; seconds >= 1; seconds--) {
            System.err.println("Aguardando " + seconds + "s para ataque cardíaco...");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("A contagem foi interrompida: " + e.getMessage());
            }
        }

        System.out.println(human.getName() + " morreu de ataque cardíaco.");
        human.die();
        addVictim(human);
        human.remainingLife.eraseRemainingLife();
    }
}
