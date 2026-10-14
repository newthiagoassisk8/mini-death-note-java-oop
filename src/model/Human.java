package model;

import model.exception.AlreadyDeadException;
import model.exception.DeathNoteRuleException;
import model.exception.MissingDeathNoteException;
import model.exception.MissingShinigamiEyesException;

import java.util.List;
import java.util.Random;

public class Human implements DeathNoteUser, ShinigamiEyes {
    protected String name;
    protected DeathNote deathNote;
    private boolean isAlive;
    protected boolean hasShinigamiEyes;
    public RemainingLife remainingLife;

    public Human(String name, boolean hasShinigamiEyes, DeathNote deathNote) {
        this.name = name;
        this.isAlive = true;
        this.hasShinigamiEyes = hasShinigamiEyes;
        this.deathNote = deathNote;
        this.remainingLife = new RemainingLife();
    }

    public Human(String name, boolean hasShinigamiEyes) {
        this.name = name;
        this.isAlive = true;
        this.hasShinigamiEyes = hasShinigamiEyes;
        this.remainingLife = new RemainingLife();
    }

    public void imprimeHumano(){
        System.out.println(this.name);

    }

    public static Human create() {
        return new Human("Humano generico", false);
    }

    public boolean isAlive() {
        return this.isAlive;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public List<String> getNames() {
        if (new Random().nextBoolean()) {
            return List.of("Misa Amane");
        }
        return List.of();
    }

    public boolean hasShinigamiEyes() {
        return hasShinigamiEyes;
    }

    protected void die() {
        markAsDead();
        if (this.deathNote != null) {
            System.out.println(this.name + " não vai para o Céu nem para o Inferno. Vai para o Vazio (Mu).");
        } else {
            System.out.println(this.name + " foi para o além.");
        }
    }

    protected void markAsDead() {
        this.isAlive = false;
    }

    @Override
    public void writeInDeathNote(Human victim) throws DeathNoteRuleException {
        // Unchecked Exception: estado do próprio usuário
        if (!isAlive()) {
            throw new AlreadyDeadException(this.name + " não pode usar o caderno pois já está morto!");
        }

        // Unchecked Exception: falta de posse do objeto necessário
        if (this.deathNote == null) {
            throw new MissingDeathNoteException(this.name + " não possui um Death Note para escrever.");
        }

        // Checked Exception: violação de regra do Death Note
        if (victim == null) {
            throw new DeathNoteRuleException("Não é possível escrever uma vítima nula no Death Note.");
        }

        // Unchecked Exception: estado inválido do alvo
        if (!victim.isAlive()) {
            throw new AlreadyDeadException("A vítima '" + victim.getName() + "' já está morta! Não surte efeito.");
        }

        deathNote.write(victim);
    }

    @Override
    public String seeRealName(Human target) {
        if (this.deathNote == null) {
            throw new MissingDeathNoteException(this.name + " não possui um Death Note para ver nomes.");
        }
        return target.getName();
    }

    @Override
    public String seeLifeSpan(Human target) {
        if (!this.hasShinigamiEyes()) {
            throw new MissingShinigamiEyesException(this.name + " não possui os olhos de Shinigami!");
        }
        return target.remainingLife.getRemainingLifeSpan();
    }
}
