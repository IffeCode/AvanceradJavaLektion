package singleton;

public class LoggerSingleton {

    private static LoggerSingleton instance;

    private LoggerSingleton() {

    }

    public static LoggerSingleton getInstance() {
        if (instance == null) {
            instance = new LoggerSingleton();
        }
        return instance;
    }


    String Info;
    public void Info() {
        System.out.println("2025-12-01" +" INFO" +"Startar applikationen...");
    }

    String Warning;
    public void Warning() {
        System.out.println("2025-12-01"+ "WARNING" +"Startar applikationen...");

    }

    String Error;
    public void Error() {
        System.out.println("2025-12-01"+ "ERROR" +"Startar applikationen...");
    }
}
