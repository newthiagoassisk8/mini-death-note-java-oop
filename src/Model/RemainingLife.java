package Model;
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
