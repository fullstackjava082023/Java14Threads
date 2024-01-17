public class Car implements Runnable {
    String name;

    public Car(String name) {
        this.name = name;
    }



    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("The car " + name + " is running");
        }

    }

   /* public void repair() {
        System.out.println("Repairing");
    }*/
}
