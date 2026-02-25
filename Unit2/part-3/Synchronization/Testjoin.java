class Testjoin {
    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(() -> {
            for(int i=1;i<=5;i++) {
                System.out.println("Child: " + i);
            }
        });

        t.start();

        t.join();   // Main waits here

        System.out.println("Main Finished");
    }
}