import java.util.concurrent.locks.ReentrantLock;

public class CounterThread implements Runnable {
    static int count = 0;

    static ReentrantLock counterLock = new ReentrantLock(true);

    static void incrementCounter() {
        counterLock.lock();

        try {
            count++;

            System.out.println(Thread.currentThread().getName() + ": " + count);
        } finally {
            counterLock.unlock();
        }
    }

    @Override
    public void run() {
        for(int i = 0; i < 50; i++) {
            incrementCounter();
        }
    }
}
