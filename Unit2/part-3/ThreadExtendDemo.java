class MyThread extends Thread {

    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
        }
    }
}

public class ThreadExtendDemo {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        t1.start();  // Start new thread

        for(int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}