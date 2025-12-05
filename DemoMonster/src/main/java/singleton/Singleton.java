package singleton;

import java.util.Random;

public class Singleton {

    private static Singleton instance;

    private Singleton(){
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    //Här kan man implementera speficik kod för vår singleton

    //En metod som returnenrar ett slumpmässigt tal
    int aRandomNumber = (new Random().nextInt(1000));

    public int getaRandomNumber(){
        return aRandomNumber;
    }

}
