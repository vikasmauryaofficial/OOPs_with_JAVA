import java.util.concurrent.*;

// Shared Resource (for Synchronization demo)
class BankAccount {

    private int balance = 1000;

    // synchronized method
    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() +
                " Deposited: " + amount +
                " | Balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() +
                    " Withdrawn: " + amount +
                    " | Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public int getBalance() {
        return balance;
    }
}

public class CompleteThread {

    public static void main(String[] args) throws Exception {

        System.out.println("===== THREAD CREATION USING RUNNABLE =====");

        BankAccount account = new BankAccount();

        // Runnable Thread 1
        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 3; i++) {
                account.deposit(200);
                try { Thread.sleep(500); } catch(Exception e) {}
            }
        }, "Deposit-Thread");

        // Runnable Thread 2
        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 3; i++) {
                account.withdraw(150);
                try { Thread.sleep(500); } catch(Exception e) {}
            }
        }, "Withdraw-Thread");

        t1.start();
        t2.start();

        // join() demo
        t1.join();
        t2.join();

        System.out.println("Final Balance: " + account.getBalance());

        System.out.println("\n===== THREAD POOL (ExecutorService) =====");

        ExecutorService service = Executors.newFixedThreadPool(2);

        for(int i = 1; i <= 4; i++) {
            int task = i;

            service.execute(() -> {
                System.out.println("Task " + task +
                        " executed by " +
                        Thread.currentThread().getName());
            });
        }

        service.shutdown();
        service.awaitTermination(5, TimeUnit.SECONDS);

        System.out.println("\n===== CALLABLE & FUTURE =====");

        ExecutorService singleService = Executors.newSingleThreadExecutor();

        Callable<Integer> callableTask = () -> {
            Thread.sleep(1000);
            return 10 + 20;
        };

        Future<Integer> result = singleService.submit(callableTask);

        System.out.println("Waiting for Callable result...");
        System.out.println("Result from Callable: " + result.get());

        singleService.shutdown();

        System.out.println("\n===== PROGRAM COMPLETED SUCCESSFULLY =====");
    }
}