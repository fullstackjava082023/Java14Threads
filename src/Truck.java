public class Truck extends Thread {
    String name;

    public Truck(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("The " + name + " is going");
    }




}
