import java.lang.*;
class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}

public class MethodTest {
    public static void main(String[] args) throws Exception {

        Counter c = new Counter();

        Thread t1 = new Thread(() -> {
            for(int i=0;i<1000;i++) c.increment();
        });

        Thread t2 = new Thread(() -> {
            for(int i=0;i<1000;i++) c.increment();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + c.getCount());
    }
}