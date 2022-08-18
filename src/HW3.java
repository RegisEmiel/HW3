public class HW3 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Task 1");

        PingPongGame game = new PingPongGame();
        game.startGame();

        Thread.sleep(1000);

        System.out.println("---------------------------------------------------------");
        System.out.println();

        System.out.println("Task 2");
        CounterThread counterThread = new CounterThread();
        Thread thread1 = new Thread(counterThread);
        Thread thread2 = new Thread(counterThread);
        Thread thread3 = new Thread(counterThread);

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
