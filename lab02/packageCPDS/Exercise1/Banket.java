package packageCPDS.Exercise1;

public class Banket extends Thread {
  public static void main(String[] args) {

    Pot pot = new Pot(5);

    // Alice
		Thread a = new Savage(pot);
		a.setName("Alice");

    // Bob
		Thread b = new Savage(pot);
		b.setName("Bob");

    // Cook
		Thread cook = new Cook(pot);
		cook.setName("Cook");

		a.start();
		b.start();
		cook.start();
  }
}
