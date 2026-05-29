class MyTask implements Runnable {

    private String threadName;

    MyTask(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ": " + i);

            try {
                Thread.sleep(500); // small delay for better visibility
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted");
            }
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {

        Thread t1 = new Thread(new MyTask("Thread 1"));
        Thread t2 = new Thread(new MyTask("Thread 2"));

        t1.start();
        t2.start();
    }
}
