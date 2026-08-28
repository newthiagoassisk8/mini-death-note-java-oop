package Model;

import java.util.concurrent.TimeUnit;

public class Shinigami extends DeathNoteUser {
    private String name;


    public Shinigami(String name) {
        super(true);
        this.name = name;
    }

     @Override
     void eraseRemainingLife(Human target) {
         target.remainingLifeYears = 0;
         target.remainingLifeMonths = 0;
         target.remainingLifeDays = 0;
     }
//TODO: Passar tempo de vida restante do humano pro shinigami
     @Override
     public void writeInDeathNote(Human victim) {
         System.out.println("using death note");
         for (int seconds = 5; seconds >= 0 ; seconds--) {
             System.err.println(seconds);
             try {
                 TimeUnit.SECONDS.sleep(1);

             } catch (InterruptedException e) {
                 System.err.println("A contagem foi interropida" + e);
             }

         }
         victim.die();
         eraseRemainingLife(victim);
         System.out.println(victim.name + " morreu");

     }

}
