package singleton;

public class SingletonDemo {

    public static void Demo(){

        LoggerSingleton log = LoggerSingleton.getInstance();

        log.Info();
        log.Warning();
        log.Error();



    }
}
