public class StartThreadsByInheritanceDemo extends Thread {

    public static void Demo(){
        System.out.println("Skapar tråd");
        StartThreadsByInheritanceDemo threadObj = new StartThreadsByInheritanceDemo();
        System.out.println("Startar tråd!");
        threadObj.start();
        try{
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } //Fördröjer tråden
        System.out.println("Tråd startad!");
    }

    @Override
    public void run() {
        System.out.println("Tråd startad: " + Thread.currentThread().getName());
    }
}
