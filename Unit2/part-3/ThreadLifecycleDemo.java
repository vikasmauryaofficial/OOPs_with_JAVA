class LifecycleThread extends Thread {

    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("Thread Running...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadLifecycleDemo {

    public static void main(String[] args) throws Exception {

        LifecycleThread t1 = new LifecycleThread();

        System.out.println("State after creation: " + t1.getState());

        t1.start();
        System.out.println("State after start(): " + t1.getState());

        Thread.sleep(100);
        System.out.println("State during sleep: " + t1.getState());

        t1.join();
        System.out.println("State after completion: " + t1.getState());
    }
}