public class ThreadSleepMain {

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();

        Thread.sleep(5000);

        System.out.println("thread was in sleep " + (System.currentTimeMillis() - start));
    }
}
