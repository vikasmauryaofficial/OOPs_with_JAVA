class withoutjoin {
    public static void main(String[] args) {

        Thread t = new Thread(() -> {
            for(int i=1;i<=5;i++) {
                System.out.println("Child: " + i);
            }
        });

        t.start();

        System.out.println("Main Finished");
    }
}