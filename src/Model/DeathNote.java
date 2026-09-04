package Model;

import java.util.concurrent.TimeUnit;


public class DeathNote {
   /*
   * of
   * valueOf
   * from
   * getInstance
   * */


   public DeathNote() {
   }

   public void write (Human human) {
      for (int seconds = 5; seconds >= 0 ; seconds--) {
         System.err.println(seconds);
         try {
            TimeUnit.SECONDS.sleep(1);

         } catch (InterruptedException e) {
            System.err.println("A contagem foi interropida" + e);
         }

      }
      System.out.println(human.name + " morreu");
       human.die();
       human.remainingLife.eraseRemainingLife();
   }

}
