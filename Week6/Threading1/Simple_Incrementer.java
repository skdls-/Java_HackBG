import java.util.Date;

class Counter {

    private Integer counter = new Integer(0);

    public synchronized void increm() throws InterruptedException {
        counter++;
    }

    public int getCount() {
        return counter.intValue();
    }

}

class Incrementer extends Thread {

    Counter counter;

    Incrementer(Counter c) {
        counter = c;
    }

    public void run() {
        try {
            while (counter.getCount() <= 100) {
                System.out.println(getName() + " " + counter.getCount());
                counter.increm();
            }
        } catch (InterruptedException e) {
        }
    }
}

public class Simple_Incrementer {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Counter sharedCounter = new Counter();
        Incrementer thread1 = new Incrementer(sharedCounter);
        Incrementer thread2 = new Incrementer(sharedCounter);
        thread1.start();
        thread2.start();
    }

}
