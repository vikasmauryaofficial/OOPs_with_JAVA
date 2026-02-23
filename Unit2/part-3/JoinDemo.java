class JoinThread extends Thread {

    public void run() {
        for(int i = 1; i <= 3; i++) {
            System.out.println("Child Thread");
        }
    }
}

public class JoinDemo {

    public static void main(String[] args) throws Exception {

        JoinThread t1 = new JoinThread();
        t1.start();

        t1.join();  // Wait until child finishes

        System.out.println("Main Thread");
    }
}