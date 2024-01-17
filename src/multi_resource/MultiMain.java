package multi_resource;

public class MultiMain {

    public static Long sumParallel = 0L;


    public static Long sum = 0L;
    public static final int iterations = 600;

    public static void main(String[] args) {

        MyAggregator aggregator1 = new MyAggregator();
        Thread aggr1 = new Thread(aggregator1, "aggr1");
        MyAggregator aggregator2 = new MyAggregator();
        Thread aggr2 = new Thread(aggregator2, "aggr2");
        MyAggregator aggregator3 = new MyAggregator();
        Thread aggr3 = new Thread(aggregator3, "aggr3");
        aggr1.start();
        aggr2.start();
        aggr3.start();




        makeSum();
    }


    public static void makeSum() {   //0+1+2+3+4+5+6+7+8+9 = 45
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < iterations; i++) {
                sum += i;
            }
        }

        System.out.println( sum);
    }

}
