package multi_resource;

public class MyAggregator implements Runnable {
    public static Object stam = new Object();//just object which will be used as a lock

    public void run() {
        for (int i = 0; i < MultiMain.iterations; i++) {
            //b
            synchronized (stam) {//a //cc
                MultiMain.sumParallel += i;//synchronized resource //a
                System.out.println("Current thread: " + this.hashCode() + " iteration number "+ i + " New Sum is : " + MultiMain.sumParallel);//a
            }//a

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("The parralel sum is : " + MultiMain.sumParallel);
    }
}
