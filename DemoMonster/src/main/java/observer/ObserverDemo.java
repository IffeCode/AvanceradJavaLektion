package observer;

public class ObserverDemo {

    public static void Demo() {

        NewsAgency TT =  new NewsAgency();
        TT.addObserver(new NewsChannel("Skånska Dagbladet"));
        TT.addObserver(new NewsChannel("Sydsvenska Dagbladet"));
        TT.addObserver(new NewsChannel("Norra Skånes Dagblad"));

        TT.reportNewNews("Max IV räddas i sista stund – får pengar till hyra och el");


    }




}
