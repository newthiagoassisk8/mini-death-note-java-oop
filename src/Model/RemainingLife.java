package Model;

import java.util.Objects;
import java.util.Random;

public class RemainingLife {
    private static final String VICTIM_NAME = "Misa Amane";
    //acoplamento de conteudo
    private int years;
    private int months;
    private int days;
    Random random = new Random();
    public RemainingLife() {
        this.years = random.nextInt(81);
        this.months = random.nextInt(12);
        this.days = random.nextInt(31);
    }

    public int getTotalDays() {
        return years * 365 + months * 30 + days;
    }

    public void eraseRemainingLife() {
        this.years = 0;
        this.months = 0;
        this.days = 0;
    }
//TODO: Tipar o parametro como deathNoteUser
    public static void transferRemainingLife(Human human, Shinigami shinigami) {
        Objects.requireNonNull(human, "Human must not be null");
        Objects.requireNonNull(shinigami, "Shinigami must not be null");

        int totalDays = Math.addExact(
                human.remainingLife.getTotalDays(),
                shinigami.remainingLife.getTotalDays()
        );

        human.remainingLife.setTotalDays(totalDays);
        shinigami.remainingLife.eraseRemainingLife();
    }

    private void setTotalDays(int totalDays) {
        this.years = totalDays / 365;
        int remainingDays = totalDays % 365;
        this.months = remainingDays / 30;
        this.days = remainingDays % 30;
    }

    public String getRemainingLifeSpan() {
        return this.years + " anos "
                + this.months + " meses e "
                + this.days + " dias de vida restante";

    }
    @Override
    public String toString() {
        return this.years + " years, "
                + this.months + " months, "
                + this.days + " days";
    }
}
