import java.util.concurrent.*;

public class CallableFutureDemo {

    public static void main(String[] args) throws Exception {

        ExecutorService service = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> {
            return 50 + 50;
        };

        Future<Integer> result = service.submit(task);

        System.out.println("Result: " + result.get());

        service.shutdown();
    }
}