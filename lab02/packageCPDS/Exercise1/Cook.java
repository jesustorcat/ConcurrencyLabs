package packageCPDS.Exercise1;

public class Cook extends Thread {
  Pot pot;

  public Cook(Pot pot) {
    this.pot = pot;
  }

  public void run() {
    while (true) {
      System.out.println(Thread.currentThread().getName() + " would like to fill the pot");
      try {
        System.out.println(Thread.currentThread().getName() + " waiting....");
        Thread.sleep(200);
        System.out.println(Thread.currentThread().getName() + " try to fill the pot");
        pot.fillpot();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
