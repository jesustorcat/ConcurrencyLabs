package packageCPDS.Exercise1;

public class Savage extends Thread {
  Pot pot;

  public Savage(Pot pot) {
    this.pot = pot;
  }

  public void run() {
    while (true) {
      System.out.println(Thread.currentThread().getName() + " is hungry");
      try {
        Thread.sleep(200);
        pot.getserving();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
