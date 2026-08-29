package Model;

import java.util.concurrent.TimeUnit;

public class Shinigami implements DeathNoteUser {
    private String name;
    private final boolean hasShinigamiEyes = true;

    public Shinigami(String name) {
        this.name = name;
    }

    @Override
    public void useShinigamiEyes(Human target) {
       System.out.println(target.getRemainingLifeSpan());
    }

    @Override
     public void eraseRemainingLife(Human target) {
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
                 //TODO: Estudar no java tem duas categorias de execções
                 System.err.println("A contagem foi interropida" + e);
             }

         }
         victim.die();
         eraseRemainingLife(victim);
         System.out.println(victim.name + " morreu");

     }

}
