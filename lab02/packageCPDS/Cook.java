package packageCPDS;

public class Cook extends Thread {
  Pot pot;
  public Cook(Pot pot) {
    this.pot = pot;
  }

  public void run() {
    while (true) {
      System.out.println(Thread.currentThread().getName() + " is cooking");
      try {
        Thread.sleep(200);
        pot.getserving();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
