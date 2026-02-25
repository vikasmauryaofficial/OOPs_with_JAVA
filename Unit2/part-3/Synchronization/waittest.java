class Shared {

    synchronized void waitMethod() {

        System.out.println("Thread waiting...");

        try {
            wait();   // releases lock and waits
        } catch (InterruptedException e) {}

        System.out.println("Thread resumed!");
    }

    synchronized void notifyMethod() {

        System.out.println("Notifying thread...");
        notify();   // wakes up waiting thread
    }
}

public class waittest {

    public static void main(String[] args) throws InterruptedException {

        Shared obj = new Shared();

        Thread t1 = new Thread(() -> {
            obj.waitMethod();
        });

        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
            obj.notifyMethod();
        });

        t1.start();
        t2.start();
    }
}