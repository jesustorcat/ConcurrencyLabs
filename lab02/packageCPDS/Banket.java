package packageCPDS;

public class Banket extends Thread {
  public static void main(String[] args) {
    Pot pot = new Pot(5);
    Thread a = new Savage(pot);
    a.setName("Alice");
    Thread b = new Cook(pot);
    b.setName("Bob");
    Thread c = new Savage(pot);
    c.setName("cooker");
    a.start();
    b.start();
    c.start();
  }
}
