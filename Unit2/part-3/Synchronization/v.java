class Task {
    private volatile boolean running = true;

    public void stop() {
        running = false;
    }

    public void start() {
        new Thread(() -> {
            while(running) {
                System.out.println("Running...");
                try {
                    Thread.sleep(200);
                } catch(Exception e){}
            }
            System.out.println("Stopped.");
        }).start();
    }
}

public class v {
    public static void main(String[] args) throws Exception {

        Task t = new Task();
        t.start();

        Thread.sleep(600);
        t.stop();
    }
}