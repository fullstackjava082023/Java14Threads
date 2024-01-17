public class Main {
    public static void main(String[] args) {

     /*   Truck volvo = new Truck("Volvo");//truck now is thread
        volvo.start();//we can do start //waits till method finish
        Truck isuzu = new Truck("Isuzu");//truck now is thread
        isuzu.start();*/



        Car mercedes = new Car("Mercedes");
        //mercedes.start();//Car is not a thread
        Thread t1 = new Thread(mercedes, "myCar");//new thread
        System.out.println("the thread name is : " + t1.getName());
        t1.start();

        Car kia = new Car("Kia");
        Thread t2 = new Thread(kia);
        t2.start();


        //and only then jumps to the next
        System.out.println("finished the job");

    }
}