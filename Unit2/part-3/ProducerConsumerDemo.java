class SharedResource {

    private int data;
    private boolean hasData = false;

    synchronized void produce(int value) throws InterruptedException {

        while(hasData)
            wait();

        data = value;
        hasData = true;

        System.out.println("Produced: " + value);
        notify();
    }

    synchronized void consume() throws InterruptedException {

        while(!hasData)
            wait();

        System.out.println("Consumed: " + data);
        hasData = false;

        notify();
    }
}

public class ProducerConsumerDemo {

    public static void main(String[] args) {

        SharedResource resource = new SharedResource();

        Thread producer = new Thread(() -> {
            try {
                for(int i = 1; i <= 5; i++)
                    resource.produce(i);
            } catch (Exception e) {}
        });

        Thread consumer = new Thread(() -> {
            try {
                for(int i = 1; i <= 5; i++)
                    resource.consume();
            } catch (Exception e) {}
        });

        producer.start();
        consumer.start();
    }
}