package observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    public void notifyObservers(String message){
        observers.forEach(obs -> obs.update( message));
    }

    //Skapa fler metoder som är specifika för NewsAgency
    public void reportNewNews(String news){
        notifyObservers(news);
    }
}
