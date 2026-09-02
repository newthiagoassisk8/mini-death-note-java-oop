package Model;
import java.util.Random;
public class RemainingLife {
    private static final String VICTIM_NAME = "Misa Amane";
    //acoplamento de conteudo
    protected int years;
    protected int months;
    protected int days;
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
    @Override
    public String toString() {
        return years + " years, "
                + months + " months, "
                + days + " days";
    }
}
