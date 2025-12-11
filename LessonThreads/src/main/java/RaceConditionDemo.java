public class RaceConditionDemo {

    public static void Demo(){

    }
    private static int counter = 0;

    private static void doDemo(){
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 10_000; i++) counter++;
        });

        Thread t2 = new Thread(()->{
            for (int i = 0; i < 10_000; i++) counter++;
        });

        t1.start();
        t2.start();


    }

}
