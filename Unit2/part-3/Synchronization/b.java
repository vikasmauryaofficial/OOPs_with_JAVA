import java.lang.*;
class Counter {

    private int count = 0;

    // Increment method with synchronized block
    public void increment() {

        // Locking only the critical section
        synchronized (this) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}

public class b {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        // Thread 1
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        // Thread 2
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        // Start threads
        t1.start();
        t2.start();

        // Wait for threads to finish
        t1.join();
        t2.join();

        // Final result
        System.out.println("Final Count: " + counter.getCount());
    }
}