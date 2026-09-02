package Model;

import java.util.Random;
class RemainingLife {
    private static final String VICTIM_NAME = "Misa Amane";
    //acoplamento de conteudo
    int years;
    int months;
    int days;
    Random random = new Random();
    public RemainingLife() {
        this.years = random.nextInt(81);
        this.months = random.nextInt(12);
        this.days = random.nextInt(31);
    }

    public int getTotalDays() {
        return years * 365 + months * 30 + days;
    }

    @Override
    public String toString() {
        return years + " years, "
                + months + " months, "
                + days + " days";
    }
}
