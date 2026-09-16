package model;

import model.exception.DeathNoteRuleException;

public interface DeathNoteUser {
    // Como DeathNoteRuleException é uma CHECKED EXCEPTION, qualquer classe que
    // implementa esse método e qualquer código que o invoca é obrigado a lidar com ela.
    void writeInDeathNote(Human victim) throws DeathNoteRuleException;
}
