package packageCPDS;

public class Cook extends Thread {
  Pot pot;
  public Cook(Pot pot) {
    this.pot = pot;
  }

  public void run() {
    while (true) {
      System.out.println(Thread.currentThread().getName() + " is would like to fill the pot");
      try {
        System.out.println(Thread.currentThread().getName() + " waiting....");
        Thread.sleep(200);
        System.out.println(Thread.currentThread().getName() + " is trying to fill the pot");
        pot.fillpot();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
