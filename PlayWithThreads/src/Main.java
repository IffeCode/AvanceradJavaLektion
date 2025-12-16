public class Main {

    public static void main(String[] args) {

        Thread t = new Thread(new Sensor((3)));
        t.start();
    }
}
