package packageCPDS;

public class BanketNoWait {

	public static void main(String args[]) {
		BadPotTwo pot = new BadPotTwo(5);

      // Alice
      Thread a = new Savage(pot);
      a.setName("Alice");
      a.start();

      // Bob
      Thread b = new Savage(pot);
      b.setName("Bob");
      b.start();

      // Peter
      Thread c = new Savage(pot);
      c.setName("Peter");
      c.start();

      // Xana
      Thread d = new Savage(pot);
      d.setName("Xana");
      d.start();

      // Tom
      Thread e = new Savage(pot);
      e.setName("Tom");
      e.start();

      // Jerry
      Thread f = new Savage(pot);
      f.setName("Jerry");
      f.start();

      // Kim
      Thread g = new Savage(pot);
      g.setName("Kim");
      g.start();

      // Berta
      Thread h = new Savage(pot);
      h.setName("Berta");
      h.start();

      // Cook
      Thread cook = new Cook(pot);
      cook.setName("Cook");
      cook.start();
	}
}
