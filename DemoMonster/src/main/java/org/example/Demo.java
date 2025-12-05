package org.example;

import factory.FactoryDemo;
import observer.ObserverDemo;
import singleton.SingletonDemo;
import strategy.StrategyDemo;

import java.util.Scanner;

public class Demo {
    static void main(String[] args) {

        System.out.println("""
                1. Singleton
                2. Observer
                3. Factory
                4. Strategy
                Välj demo: """);
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        try {
            choice = sc.nextInt();
        } catch (Exception ex) {
            System.out.println("Ogiltig inmatning");
            return;
        }

        switch(choice) {
            case 1:
                SingletonDemo.Demo();
                break;
            case 2:
                ObserverDemo.Demo();
                break;
            case 3:
                FactoryDemo.Demo();
                break;
            case 4:
                StrategyDemo.Demo();
                break;
            default:
                System.out.println("Ogiltigt val!");
        }

    }
}
