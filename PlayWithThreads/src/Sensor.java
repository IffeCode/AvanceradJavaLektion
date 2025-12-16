public class Sensor implements Runnable {
    int value = 0;

    public Sensor(int value) {
        this.value = value;
    }


    @Override
    public void run() {
        while (true) {
           try{
               System.out.println(Thread.currentThread().getName() + ":value= " + value);
           }catch(Exception e){
               e.printStackTrace();
           }
        }
    }
}
