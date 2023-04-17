class MyRunnable implements Runnable {
    private final String taskName;

    public MyRunnable(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(taskName + " is executing, iteration: " + i);
            try {
                Thread.sleep(1000); // Pause for 1000 milliseconds (1 second)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultithreadingExample {
    public static void main(String[] args) {
        MyRunnable task1 = new MyRunnable("Task 1");
        MyRunnable task2 = new MyRunnable("Task 2");
        MyRunnable task3 = new MyRunnable("Task 3");

        // Create Thread objects and pass the Runnable instances
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for all threads to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All tasks completed.");
    }
}
