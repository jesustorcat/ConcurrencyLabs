
import packageCPDS.*;

public class main {
    public static void main(String[] args) {
      Pot pot = new Pot(5);
      Thread a = new Savage(pot);
      a.setName("Alice");
      Thread b = new Cook(pot);
      b.setName("Bob");
      Thread c = new Savage(pot);
      c.setName("Cindy");
      Thread d = new Savage(pot);
      d.setName("David");
      Thread e = new Cook(pot);
      e.setName("Eve");
      a.start();
      b.start();
      c.start();
      d.start();
      e.start();
    }
}