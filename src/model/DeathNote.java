package model;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class DeathNote {
    protected List<Human> victims = new ArrayList<>();


   public DeathNote() {
   }

   public List<Human> getVictims (){
      return victims;
   }
   public void addVictim (Human human){
       victims.add(human);
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

      addVictim(human);
       human.remainingLife.eraseRemainingLife();
   }


}
