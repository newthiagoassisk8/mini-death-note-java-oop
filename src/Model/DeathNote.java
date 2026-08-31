package Model;

import java.util.concurrent.TimeUnit;

public class DeathNote  {
   public void write (Human human) {
      System.out.println("using death note");
      for (int seconds = 5; seconds >= 0 ; seconds--) {
         System.err.println(seconds);
         try {
            TimeUnit.SECONDS.sleep(1);

         } catch (InterruptedException e) {
            System.err.println("A contagem foi interropida" + e);
         }

      }
      human.die();
      System.out.println(human.name + " morreu");
   }

}
