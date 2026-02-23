class MyRunnable implements Runnable {

    public void run() {
        System.out.println("Runnable thread running...");
    }
}

public class main1 {
    public static void main(String[] args) {

        Thread t1 = new Thread(new MyRunnable());
        t1.start();
    }
}