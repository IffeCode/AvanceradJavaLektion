public class RaceConditionDemo {

    public static void Demo(){
    try{
        doDemo();
    } catch(Exception e){
        e.printStackTrace();
    }
    }
    private static int counter = 0;

    private static void doDemo() throws InterruptedException{
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 10_000; i++) counter++;
        });

        Thread t2 = new Thread(()->{
            for (int i = 0; i < 10_000; i++) counter++;
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Det förväntade resultate: 20000");
        System.out.println("Det faktiska resultatet: " + counter);

    }

}
