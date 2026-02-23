public class mainlam {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            System.out.println("Lambda thread running");
        });

        t1.start();
    }
}